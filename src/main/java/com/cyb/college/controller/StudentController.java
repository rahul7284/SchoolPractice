package com.cyb.college.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cyb.college.dto.Expense;
import com.cyb.college.dto.StudentDTO;
import com.cyb.college.entity.LoginDetails;
import com.cyb.college.entity.Sport;
import com.cyb.college.entity.Student;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class StudentController {
    @Autowired
    private StudentRepository studRepo;
    
    @PostMapping(path = "/saveStudent")
    public Student saveStudent(@RequestBody StudentDTO stDTO) {
        LoginDetails login = new LoginDetails();
        Sport sportEntity = new Sport();
        Set<Sport> sportArray = new HashSet();
        Set<Sport> sportArrayToSave = new HashSet();
        login.setUserName(stDTO.getUserName());
        login.setUserPwd(stDTO.getUserPwd());
        login.setUserMobNum(stDTO.getUserMobNum());
        stDTO.setLogindetails(login);
        Student st = new Student();
        sportArray = stDTO.getSportArray();
        for (Sport sport2 : sportArray) {
            Sport sport = new Sport();
            sport.setSprt_names(sport2.getSprt_names());
            sport.setSt(st);
            sportArrayToSave.add(sport);
        }
        stDTO.setSportArray(sportArrayToSave);
        BeanUtils.copyProperties(stDTO, st);
        login.setStudent(st);
        // sportEntity.setSt(st);
        return studRepo.save(st);
    }
    
    @GetMapping(path = "/getUserDetails/{userId}")
    public Student getUserDetails(@PathVariable("userId") Long userId) {
        HSSFWorkbook myExcelBook;
        List<Expense> expenseList = new ArrayList<>();
        Expense expense = null;
        try {
            myExcelBook = new HSSFWorkbook(new FileInputStream("D:\\CollegeApp\\CollegeApp\\src\\test3.xls"));
            HSSFSheet myExcelSheet = myExcelBook.getSheet("test");
            for (int i = 14; i < 42; i++) {
                Row row = myExcelSheet.getRow(i);
                String date = row.getCell(3).getStringCellValue();
                String name = row.getCell(5).getStringCellValue();
                double withDraw = row.getCell(6).getNumericCellValue();
                double bal = row.getCell(8).getNumericCellValue();
                String newName = name.replaceAll("[0-9]", "").replace("MPS/", "").replace("BIL/", "")
                        .replace("ATM/", "").replace("NFS/", "").replace("MMT/", "").replace("MPS/", "")
                        .replace("PUBN/", "").replace("IPS/", "").replace("MIN/", "").replace("IIN/", "")
                        .replace("ONL/", "").replace("INFT/", "").replace("SFCNQ/", "").replace("///PUNE", "")
                        .replace("///", "");
                System.out.println("name : " + newName + " || Withdrw :: " + withDraw + " || Balance ::: " + bal
                        + " Date ::" + date);
                expense = new Expense();
                expense.setDetail(newName.trim() + "" + date);
                expense.setAmount((long) withDraw);
                expense.setRemain((long) bal);
                expenseList.add(expense);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Student stud = studRepo.findById(userId).get();
        stud.setExpenses(expenseList);
        return stud;
    }
    
    @GetMapping(path = "/getUserDetailsByRollNum/{rollNum}")
    public Student getUserDetailsByRollNum(@PathVariable("rollNum") Long rollNum) {
        return studRepo.findByRollNum(rollNum);
    }
    
    @GetMapping(path = "/helloStudent")
    public String helloStudent() {
        List<String> test = new ArrayList<>();
        return "hi";
    }
}

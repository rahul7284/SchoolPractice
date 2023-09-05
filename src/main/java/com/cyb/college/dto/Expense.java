package com.cyb.college.dto;

public class Expense {
    public String detail;
    public long amount;
    public long remain;
    
    public String getDetail() {
        return detail;
    }
    
    public void setDetail(String detail) {
        this.detail = detail;
    }
    
    public long getAmount() {
        return amount;
    }
    
    public void setAmount(long amount) {
        this.amount = amount;
    }
    
    public long getRemain() {
        return remain;
    }
    
    public void setRemain(long remain) {
        this.remain = remain;
    }
}

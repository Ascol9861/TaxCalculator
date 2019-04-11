package com.example.taxcalculator;

public class TaxCalc {
    private double salary;
    double firAmt, secAmt, thirdAmt, total;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateTax(){
        if(this.getSalary() <= 200000){
            total = this.getSalary()*0.01;
        }
        else if(this.getSalary() >= 200000 && this.getSalary() <= 350000){
            firAmt = 2000;
            secAmt = (this.getSalary() - 200000)*0.15;

            total = (firAmt + secAmt);
        }
        else if(this.getSalary() >350000){
            firAmt = 2000;
            secAmt = 22500;
            thirdAmt = (this.getSalary() - 350000) *0.25;
            total = (firAmt + secAmt+thirdAmt);
        }
        return total;
    }
}

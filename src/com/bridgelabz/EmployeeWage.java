package com.bridgelabz;

public class EmployeeWage {

    public static void dailyEmployeeWage() {
        int is_FULL_TIME = 1;
        int emp_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empCheck == is_FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;

        empWage = empHrs * emp_RATE_PER_HOUR;
        System.out.println("The total employeeWage are : " + empWage);

    }

    public static void main(String[] args) {
        dailyEmployeeWage();
    }
}

package com.bridgelabz;

public class EmployeeWage {
    public static void employeeWage() {
        int is_FULL_TIME = 1;
        int is_PART_TIME = 2;
        int emp_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        if (empCheck == is_FULL_TIME)
            empHrs = 8;
        else if (empCheck == is_PART_TIME)
            empHrs = 4;
        else
            empHrs = 0;

        empWage = empHrs * emp_RATE_PER_HOUR;
        System.out.println("The total employee wage are : " + empWage);

    }

    public static void main(String[] args) {
        employeeWage();
    }
}

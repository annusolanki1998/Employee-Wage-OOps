package com.bridgelabz;

public class EmployeeWage {
    public static final int IS_PART_TIME = 2;
    public static final int IS_FULL_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 25;
    public static final int NUM_OF_WORKING_DAY = 20;

    public static void employeeWage() {
        int empHour = 0, empWage = 0, totalWage = 0;

        for (int i = 0; i < NUM_OF_WORKING_DAY; i++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_FULL_TIME :
                    empHour = 8;
                    break;

                case IS_PART_TIME:_TIME :
                empHour = 4;
                    break;

                default:
                    empHour = 0;
            }

            empWage = empHour * EMP_RATE_PER_HOUR;
            totalWage += empWage;

            System.out.println("Employee wages are : " + empWage);
        }

        System.out.println("The total employee wages are : " +totalWage);
    }

    public static void main(String[] args) {
        employeeWage();
    }

}

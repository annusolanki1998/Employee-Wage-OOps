package com.bridgelabz;

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FUll_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 25;
    public static final int NUM_OF_WORKING_DAYS = 10;
    public static final int MAX_HRS_IN_MONTH = 90;

    public static void computeEmployeeWage() {
        int totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;

        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays <= NUM_OF_WORKING_DAYS) {

            int empHrs = 0;
            totalWorkingDays++;

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {

                case IS_FUll_TIME :
                    empHrs = 8;
                    break;

                case IS_PART_TIME :
                    empHrs = 4;
                    break;

                default :
                    empHrs = 0;
            }

            totalEmpHrs += empHrs;
            System.out.println("Working hours : " +empHrs);
            int empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Employee Wage : " +empWage);
        }
        System.out.println("Total working hours : " +totalEmpHrs);
        System.out.println("Total employee wage : " +totalEmpWage);
    }

    public static void main(String[] args) {

        computeEmployeeWage();
    }
}

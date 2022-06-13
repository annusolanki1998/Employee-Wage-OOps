package com.bridgelabz;

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FUll_TIME = 2;

    public static int computeEmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        int totalEmpHrs = 0, totalWorkingDays = 0;

        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {

            int empHrs = 0;
            totalWorkingDays++;

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {

                case IS_FUll_TIME:
                    empHrs = 8;
                    break;

                case IS_PART_TIME:
                    empHrs = 4;
                    break;

                default:
                    empHrs = 0;
            }

            totalEmpHrs += empHrs;
            System.out.println("Day " +totalWorkingDays+  " :"  + " " + "Emp Hrs : " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Employee wage for company : " + company + " is :" + totalEmpWage);
        return totalEmpWage;

    }

    public static void main(String[] args) {

        computeEmployeeWage("TCS", 20, 2, 10);
        computeEmployeeWage("INFOSYS", 10, 3, 20);
    }
}

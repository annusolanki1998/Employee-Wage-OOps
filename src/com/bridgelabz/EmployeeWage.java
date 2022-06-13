package com.bridgelabz;
public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FUll_TIME = 2;
    int totalEmpWage = 0;
    public final String company;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHoursPerMonth;
    public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void computeEmployeeWage() {
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
            System.out.println("Day " + totalWorkingDays + " :" + " " + "Emp Hrs : " + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
    }

    @Override
    public String toString() {
        return "EmployeeWage{" +
                "company='" + company + '\'' +
                ", empRatePerHour=" + empRatePerHour +
                ", numOfWorkingDays=" + numOfWorkingDays +
                ", maxHoursPerMonth=" + maxHoursPerMonth +
                ",Total employee wage for company : " + company + " " + "is:" + totalEmpWage +
                '}';
    }

    public static void main(String[] args) {

        EmployeeWage tcs = new EmployeeWage("TCS", 20, 2, 10);
        EmployeeWage infosys = new EmployeeWage("INFOSYS", 20, 2, 10);

        tcs.computeEmployeeWage();
        System.out.println(tcs);

        infosys.computeEmployeeWage();
        System.out.println(infosys);

    }
}

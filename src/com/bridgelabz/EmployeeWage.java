package com.bridgelabz;

public class EmployeeWage {
    public static void empAttendance() {
        int is_full_time = 1;
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empCheck == is_full_time)
            System.out.println("Employee is present !");
        else
            System.out.println("Employee is absent ! ");
    }

    public static void main(String[] args) {
        empAttendance();
    }
}

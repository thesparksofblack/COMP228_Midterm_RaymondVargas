package main.staff;

import main.people.Person;

/**
 * Abstract class representing the hospital staff members.
 * These are shared by Doctor, SpecialistDoctor, and Nurse.
 */
public abstract class MedicalStaff extends Person {

    protected final int staffId;
    protected String department;
    protected double monthlySalary;

    // This tracks the total number of staff
    protected static int staffCount = 0;

    /**
     * Constructor initializes staff-specific fields.
     * In other words, it sets up the fields and subclasses by calling through super() to inherit data
     */
    public MedicalStaff(int personId, int staffId, String name, String phone, String department, double salary) {
        super(personId, name, phone);
        this.staffId = staffId;
        this.department = department;
        this.monthlySalary = salary;
        staffCount++;
    }

    /**
     * since method is abstract, medicalStaff doesn't define how compensation is calculated
     * Instead, every subclass must go override it and implement their own logic
     * to explain why Doctors, SpecialistDoctors and Nurses have different monthly payment calculations
     */
    public abstract double calculateMonthlyCompensation();

    public static int getStaffCount() {
        return staffCount;
    }
}
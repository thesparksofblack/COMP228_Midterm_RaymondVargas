package main.people;

import main.interfaces.Reportable;
import main.interfaces.Schedulable;


/**
 * Represents a patient in the hospital system.
 * Implements Reportable and Schedulable interfaces.
 */

public class Patient extends Person implements Reportable, Schedulable {

    private final int patientNumber;
    private int age;
    private String department;

    // This servers to check the total number of Patient objects
    private static int patientCount = 0;

    /**
     * Constructor initializes patient-specific fields.
     */
    public Patient(int personId, int patientNumber, String name, String phone, int age, String department) {
        super(personId, name, phone);
        this.patientNumber = patientNumber;
        this.age = age;
        this.department = department;
        patientCount++;
    }

    /**
     * Overloaded method: basic registration validation.
     */
    public boolean registerPatient() {
        return age > 0 && name != null && !name.isEmpty();
    }

    /**
     * Overloaded method with insurance code.
     */
    public boolean registerPatient(String insuranceCode) {
        return registerPatient();
    }

    @Override
    public String getRoleDescription() {
        return "Patient";
    }

    @Override
    public void generateReport() {
        System.out.println("Patient Report: " + name + " | Dept: " + department);
    }

    @Override
    public boolean scheduleAppointment(String date, String time, String doctorName) {
        System.out.println("Appointment scheduled for " + name + " with Dr. " + doctorName +
                " on " + date + " at " + time);
        return true;
    }

    public static int getPatientCount() {
        return patientCount;
    }
}

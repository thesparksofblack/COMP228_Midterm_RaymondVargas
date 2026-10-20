package main;

import main.people.Patient;
import main.staff.Doctor;
import main.staff.SpecialistDoctor;
import main.staff.Nurse;
import main.people.Person;
import main.staff.MedicalStaff;

public class Main {
	public static void main(String[] args) {
		 // This here is creating patient objects
        Patient p1 = new Patient(1, 101, "Jane", "555-1111", 25, "Cardiology");
        Patient p2 = new Patient(2, 102, "John", "555-2222", 40, "Neurology");

        // Creating Doctors
        Doctor d1 = new Doctor(3, 201, "Dr. Carter", "555-3333", "General", 8000, 50);

        // Creating Specialist Doctor right here
        SpecialistDoctor sd1 = new SpecialistDoctor(
                4, 202, "Dr. House", "555-4444",
                "Diagnostics", 12000, 100,
                "Immunology", 40
        );

        // This here is creating Nurse
        Nurse n1 = new Nurse(
                5, 301, "Nurse Rivera", "555-5555",
                "Emergency", 5000,
                "Night", 300
        );

        // this here is demonstrating polymorphism
        MedicalStaff ms = d1;
        System.out.println(ms.calculateMonthlyCompensation());

        ms = sd1;
        System.out.println(ms.calculateMonthlyCompensation());

        // --- Demonstrate interface usage ---
        p1.scheduleAppointment("2026-10-20", "10:00", "Dr. Smith");
        p1.generateReport();

        // --- Display counters ---
        System.out.println("People: " + Person.getPersonCount());
        System.out.println("Patients: " + Patient.getPatientCount());
        System.out.println("Staff: " + MedicalStaff.getStaffCount());
	}
}

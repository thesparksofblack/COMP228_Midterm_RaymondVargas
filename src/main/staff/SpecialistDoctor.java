package main.staff;

/**
 * Represents a specialist doctor with additional surcharge.
 */
public class SpecialistDoctor extends Doctor {

    private final String specialization;
    private final double specialistSurcharge;

    /**
     * Constructor initializes specialist-specific fields.
     */
    public SpecialistDoctor(int personId, int staffId, String name, String phone, String dept,
                            double salary, double fee, String specialization, double surcharge) {
        super(personId, staffId, name, phone, dept, salary, fee);
        this.specialization = specialization;
        this.specialistSurcharge = surcharge;
    }

    /**
     * Specialist fee includes base fee + surcharge.
     */
    @Override
    public double calculateConsultationFee() {
        return consultationFee + specialistSurcharge;
    }

    @Override
    public String getRoleDescription() {
        return "Specialist Doctor (" + specialization + ")";
    }
}
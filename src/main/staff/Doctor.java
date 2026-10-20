package main.staff;

/**
 * This represents general doctor in the hospital
 * Then it extends MedicalStaff and adds consultation
 */
public class Doctor extends MedicalStaff {

    protected final double consultationFee;
    protected int patientsSeen;

    /**
     * Constructor initializes doctor-specific fields.
     */
    public Doctor(int personId, int staffId, String name, String phone, String dept,
                  double salary, double fee) {
        super(personId, staffId, name, phone, dept, salary);
        this.consultationFee = fee;
    }

    /**
     * Basic consultation fee calculation.
     */
    public double calculateConsultationFee() {
        return consultationFee;
    }

    /**
     * Overloaded method: applies senior discount.
     */
    public double calculateConsultationFee(boolean seniorDiscount) {
        return seniorDiscount ? consultationFee * 0.8 : consultationFee;
    }

    /**
     * Monthly compensation includes salary + fees from patients seen.
     */
    @Override
    public double calculateMonthlyCompensation() {
        return monthlySalary + (patientsSeen * consultationFee);
    }

    @Override
    public String getRoleDescription() {
        return "Doctor";
    }
}

package main.staff;

public class Nurse extends MedicalStaff {
	
	private final String shiftType;
    private final double shiftAllowance;

    /**
     * Constructor initializes nurse-specific fields.
     */
    public Nurse(int personId, int staffId, String name, String phone, String dept,
                 double salary, String shiftType, double allowance) {
        super(personId, staffId, name, phone, dept, salary);
        this.shiftType = shiftType;
        this.shiftAllowance = allowance;
    }

    /**
     * Monthly compensation includes salary + shift allowance.
     */
    @Override
    public double calculateMonthlyCompensation() {
        return monthlySalary + shiftAllowance;
    }

    @Override
    public String getRoleDescription() {
        return "Nurse (" + shiftType + ")";
    }
}

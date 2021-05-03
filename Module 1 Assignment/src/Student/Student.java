package Student;

public class Student {
	// add property of student
	private int StudentID;
	private String FullName;
	private int engMarks;
	private int vernMarks;
	private int mathMarks;
	private int PhysMarks;
	private int chemMarks;
	private int CompMarks;
	private int ExtraMarks;
	private int Fees;
	private int FinalFees;
	// add getters and setters

	public int calculateMarks() {
		int m[] = new int[7];
		int total = 0;
		m[0] = this.getEngMarks();
		m[1] = this.getVernMarks();
		m[2] = this.getMathMarks();
		m[3] = this.getPhysMarks();
		m[4] = this.getChemMarks();
		m[5] = this.getCompMarks();
		m[6] = this.getExtraMarks();
		for (int i = 0; i < 7; i++) {
			total = m[i] + total;
		}
		int avg = total / 7;

		return avg;
	}

	public int getFinalFees() {
		return FinalFees;
	}

	public void setFinalFees(int finalFees) {
		FinalFees = finalFees;
	}

	public int getFees() {
		return Fees;
	}

	public void setFees(int fees) {
		Fees = fees;
	}

	public Student(int studentID, String fullName, int engMarks, int vernMarks, int mathMarks, int physMarks,
			int chemMarks, int compMarks, int extraMarks, int Fees) {
		super();
		StudentID = studentID;
		FullName = fullName;
		this.engMarks = engMarks;
		this.vernMarks = vernMarks;
		this.mathMarks = mathMarks;
		PhysMarks = physMarks;
		this.chemMarks = chemMarks;
		CompMarks = compMarks;
		ExtraMarks = extraMarks;
		this.Fees = Fees;
		calculateFees();
	}

	public int getStudentID() {
		return StudentID;
	}

	public void setStudentID(int studentID) {
		StudentID = studentID;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public int getEngMarks() {
		return engMarks;
	}

	public void setEngMarks(int engMarks) {
		this.engMarks = engMarks;
	}

	public int getVernMarks() {
		return vernMarks;
	}

	public void setVernMarks(int vernMarks) {
		this.vernMarks = vernMarks;
	}

	public int getMathMarks() {
		return mathMarks;
	}

	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}

	public int getPhysMarks() {
		return PhysMarks;
	}

	public void setPhysMarks(int physMarks) {
		PhysMarks = physMarks;
	}

	public int getChemMarks() {
		return chemMarks;
	}

	public void setChemMarks(int chemMarks) {
		this.chemMarks = chemMarks;
	}

	public int getCompMarks() {
		return CompMarks;
	}

	public void setCompMarks(int compMarks) {
		CompMarks = compMarks;
	}

	public int getExtraMarks() {
		return ExtraMarks;
	}

	public void setExtraMarks(int extraMarks) {
		ExtraMarks = extraMarks;
	}

	/*
	 * trigger if student marks is less than 50 ---->> fees += 50%
	 */
	public void calculateFees() {
		int avg = calculateMarks();
		int fees = getFees();
		if (avg < 50) {
			int increase = (int) (fees * 0.5);
			fees = (fees + increase);
			setFinalFees(fees);
		} else
			setFinalFees(this.Fees);

	}
}

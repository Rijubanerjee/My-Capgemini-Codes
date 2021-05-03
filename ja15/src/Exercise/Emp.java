package Exercise;

public class Emp {
	private byte age;
	private String name;
	private double sal;
	private double da;
	private double pf;
	private double netSal;
	public byte getAge() {
		return age;
	}
	public void setAge(int age) throws Exception {
		if (age < 20 || age > 60)
			throw new Exception("Age must be between 20 and 60");
		this.age = (byte)age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception {
		if (!name.matches("[a-z A-Z]{3,15}"))
			throw new Exception("Name must contain min 3 adn max 15 aplhabates");
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) throws Exception {
		if (sal < 5000)
			throw new Exception("Salary must be min Rs 5000");
		this.sal = sal;
		this.pf = this.sal * 0.12;
		this.da = this.sal * 0.4;
		this.netSal = this.sal + this.da + this.pf;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getNetSal() {
		return netSal;
	}
	public void setNetSal(double netSal) {
		this.netSal = netSal;
	}
	
}

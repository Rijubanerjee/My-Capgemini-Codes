package Exercise;

public class Empclient {
	public static void main(String[] args) {
	
	Emp emp = new Emp();
	
	try {
		emp.setName("Wriju");
		emp.setAge(69);
		emp.setSal(6000);
		System.out.println("Name"+emp.getName());
		System.out.println("Age"+emp.getAge());
		System.out.println("Salary"+emp.getSal());
		System.out.println("DA"+emp.getDa());
		System.out.println("Pf"+emp.getPf());
		System.out.println("Net Salary"+emp.getNetSal());
	}catch (Exception e)
	{
		System.out.println(e.getMessage());
	}
}

}

package code.java;

public class EncapsulationMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation e1 = new Encapsulation();
		e1.setEmpId(180534);
		e1.setEmpDept("Java");
		e1.setEmpName("Shivam Gupta");
		e1.setEmpSalary(15550.80);
		
		System.out.println(e1.getEmpDept());
		System.out.println(e1.getEmpId());
		System.out.println(e1.getEmpName());
		System.out.println(e1.getEmpSalary());
		
		Encapsulation e2 = new Encapsulation();
		e2.setEmpId(180522);
		e2.setEmpDept("BI");
		e2.setEmpName("Sakshi Deshmukh");
		e2.setEmpSalary(85550.80);
		
		System.out.println(e2.getEmpDept());
		System.out.println(e2.getEmpId());
		System.out.println(e2.getEmpName());
		System.out.println(e2.getEmpSalary());
		
		
	
		

	}

}

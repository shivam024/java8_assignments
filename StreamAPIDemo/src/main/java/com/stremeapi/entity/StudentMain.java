package com.stremeapi.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StudentMain {
	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		List<Student> student = dao.findAllStudent();
		
//	Consumer<Student> s = (e) -> System.out.println(e);
	//	student.forEach(s);

//		List<Student> adminEmployees = new ArrayList<Student>();

//		for(Employee employee: employees) {
//			if(employee.getEmployeeDepartment().equals("ADMIN")) {
//				adminEmployees.add(employee);
//			}
//		}
//
//		for (Employee employee : adminEmployees) {
//			System.out.println(employee);
//		}

//		public interface Predicate<T> {
//			public boolean test(T t);
//		}

//		public class MyPredicate implements Predicate<Employee> {
//			@Override
//			public boolean test(Employee e) {
//				return e.getEmployeeDepartment().equals("ADMIN");
//			}
//		}

//		Predicate<Employee> p = (e) -> e.getEmployeeDepartment().equals("ADMIN");
//		
//		List<Employee> adminEmployees = employees.stream()
//		               													  .filter(p)
//		               													  .collect(Collectors.toList());
//		
//		adminEmployees.forEach(e -> System.out.println(e));

		// (3) Find total no of employees.

//		long noOfEmployees = employees.stream().count();
//		System.out.println("Total no. of employees = " + noOfEmployees);

//		public interface Function<T, R> {
//			public R apply(T t);
//		}
//		
//		public MyFunction implements Function<Employee, String> {
//			@Override
//			public String apply(Employee e) {
//				return e.getEmployeeName();
//			}
//		}

//		Function<Employee, String> f = (e) -> e.getEmployeeName();
//		
//		List<String> adminEmployeeNames = employees.stream()
//		               														.filter(e -> e.getEmployeeDepartment().equals("ADMIN"))
//		               														.map(f)
//		               														.collect(Collectors.toList());
//		
//		adminEmployeeNames.forEach(e -> System.out.println(e));

		// (4) Display top 3 salaried employees

//		Comparator<Employee> c = (e1, e2) -> {
//			int result = Double.compare(e2.getEmployeeSalary(), e1.getEmployeeSalary());
//			if(result == 0)
//				Integer.compare(e2.getEmployeeId(), e1.getEmployeeId());
//			return result;
//		};
//		
//		List<Employee> top3SalariedEmployees = employees.stream()
//				                                                                   .sorted(c)
//				                                                                   .limit(3)
//				                                                                   .collect(Collectors.toList());
//		
//		top3SalariedEmployees.forEach(e -> System.out.println(e));

		// (5) Demo of limit() and skip()

//		employees.stream()
//		               .skip(5)
//		               .limit(5)
//		               .forEach(e -> System.out.println(e));

		// (6) Find max, min, avg and sum of salaries

//		double maxSalary = employees.stream()
//		               								 .mapToDouble(e -> e.getEmployeeSalary())
//		               								 .max()
//		               								 .getAsDouble();
//		
//		System.out.println("maximum salary: " + maxSalary);

//		double minSalary = employees.stream()
//													.mapToDouble(e -> e.getEmployeeSalary())
//													.min()
//													.getAsDouble();
//		
//		System.out.println("Minimum salary: " + minSalary);

//		double sumOfSalaries = employees.stream()
//														  .mapToDouble(e -> e.getEmployeeSalary())
//														  .sum();
//		
//		System.out.println("Sum of salaries: " + sumOfSalaries);

	//	double averageSalary = student.stream().mapToDouble(e -> e.getStudentSalary()).average().getAsDouble();

	//	System.out.println("Average salary: " + averageSalary);
	}

}

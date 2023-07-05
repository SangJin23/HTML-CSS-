package basicPractice.hr.repository;

import basicPractice.hr.etity.EmployeeEntity;

public interface EmployeeRepositiory {
	
	EmployeeEntity[] employeeList = new EmployeeEntity[5];
 	
	boolean save(EmployeeEntity employeeEntity);
	boolean delete(EmployeeEntity employeeEntity);
	
	EmployeeEntity[] findAll();
	EmployeeEntity findByEmployeeNumber(String employeeNumber);
	
	
}

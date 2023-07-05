package basicPractice.hr.dto;

import basicPractice.hr.etity.EmployeeEntity;

public class GetEmployeeListDto {

	private String employeeNumber;
	private String name;
	private String address;
	private String birth;
	private String email;
	private String department;
	
	public GetEmployeeListDto() {}
	
	public GetEmployeeListDto(EmployeeEntity employeeEntity) {
		this.employeeNumber = employeeEntity.getEmployeeNumber();
		this.name =employeeEntity.getName();
		this.address = employeeEntity.getAddress();
		this.birth = employeeEntity.getBirth();
		this.email = employeeEntity.getEmail();
		this.department = employeeEntity.getDepartment();
	}

	public GetEmployeeListDto(String employeeNumber, String name, String address, String birth, String email,
			String department) {
		this.employeeNumber = employeeNumber;
		this.name = name;
		this.address = address;
		this.birth = birth;
		this.email = email;
		this.department = department;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "GetEmployeeListDto [employeeNumber=" + employeeNumber + ", name=" + name + ", address=" + address
				+ ", birth=" + birth + ", email=" + email + ", department=" + department + "]";
	}

	public void setEmployeeNumber(String employeeNumber2) {
		// TODO Auto-generated method stub
		
	}
	
	public  static GetEmployeeListDto[] copyList(EmployeeEntity[] employeeEntityList) {
		int size = 0;
		for(; size< employeeEntityList.length; size++) {
			if(employeeEntityList[size] == null) break;
		}

		
		GetEmployeeListDto[] result = new GetEmployeeListDto[size];
		for(int index = 0; index <result.length; index++) {
			
			EmployeeEntity employeeEntity = employeeEntityList[index];
			
			
			GetEmployeeListDto item = new GetEmployeeListDto(employeeEntity);
			result[index] = item;
		}
		
		return result;
	}
}

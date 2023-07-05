package basicPractice.hr.service.implement;

import basicPractice.hr.dto.GetEmployeeListDto;
import basicPractice.hr.dto.GetEmployeeResponseDto;
import basicPractice.hr.dto.PatchEmplyeeRequestDto;
import basicPractice.hr.dto.PostEmplyeeRequestDto;
import basicPractice.hr.etity.EmployeeEntity;
import basicPractice.hr.repository.EmployeeRepositiory;
import basicPractice.hr.service.MainService;

public class MainServiceImplement implements MainService {
	
	private final EmployeeRepositiory employeeRepositiory;
	
	public MainServiceImplement(EmployeeRepositiory employeeRepositiory) {
		this.employeeRepositiory = employeeRepositiory;
	}

	@Override
	public boolean postEmployee(PostEmplyeeRequestDto dto) {
		// 입력한 데이터를 저장소에 저장
	
		EmployeeEntity employeeEntity = new EmployeeEntity(dto);
		boolean result = employeeRepositiory.save(employeeEntity);
		return result;
	}

	@Override
	public GetEmployeeListDto[] getEmployeeList() {
		EmployeeEntity[] employeeEntityList = employeeRepositiory.findAll();
		
		GetEmployeeListDto[] result = GetEmployeeListDto.copyList(employeeEntityList);
		return result;
	}

	@Override
	public GetEmployeeResponseDto getEmployee(String employeeNumber) {
		EmployeeEntity employeeEntity =employeeRepositiory.findByEmployeeNumber(employeeNumber);
		if(employeeEntity == null) return null;
		
		GetEmployeeResponseDto result = new GetEmployeeResponseDto(employeeEntity);
		return result;
	}

	@Override
	public boolean patchEmployee(PatchEmplyeeRequestDto dto) {
		boolean result =false;
		
		String employeeNumber = dto.getEmployeeNumber();
		// 입력한 사번에 대한 사원이 존재하는지 
		EmployeeEntity employeeEntity = employeeRepositiory.findByEmployeeNumber(employeeNumber);
		if(employeeEntity == null) return result;
		
		employeeEntity = new EmployeeEntity(dto);
		
		result = employeeRepositiory.save(employeeEntity);
		
		return result;
	}

	@Override
	public boolean deleteEmplyee(String employeeNumber) {
		boolean result = false;
		
		EmployeeEntity employeeEntity = employeeRepositiory.findByEmployeeNumber(employeeNumber);
		if(employeeEntity == null) return result;
		
		result = employeeRepositiory.delete(employeeEntity);		
		return result;
	}

}

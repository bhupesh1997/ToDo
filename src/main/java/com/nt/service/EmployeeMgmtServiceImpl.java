package com.nt.service;

import java.util.List;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.ToDo;
import com.nt.repo.IEmployeeRepo;
@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
    
	@Autowired
	private IEmployeeRepo empRepo;
	
	@Override
	public List<ToDo>getAllEmployees()
	 {
		
		return empRepo.findAll();
	}
	
	public String registerEmployee(ToDo todo) {
		int idVal=empRepo.save(todo).getTaskno();
		return "Employee is saved with the id value::"+idVal;
	}
	
	 

}

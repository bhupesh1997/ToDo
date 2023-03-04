package com.nt.service;

import java.util.List;


import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;

import com.nt.model.ToDo;

public interface IEmployeeMgmtService {

	public List<ToDo>getAllEmployees();
	public String registerEmployee(ToDo emp);
	
	
	
}

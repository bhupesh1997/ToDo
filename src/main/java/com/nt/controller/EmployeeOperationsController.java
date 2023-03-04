package com.nt.controller;

import java.util.List;



import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.ToDo;
import com.nt.service.IEmployeeMgmtService;

@Controller
public class EmployeeOperationsController {
	@Autowired
	private IEmployeeMgmtService service;
	
	@GetMapping("/")
	public String showHome()
	{
		return "dash_board";
	}
	
	@GetMapping("/taskrecord")
	public String showEmployeeReport(Map<String,Object>map)
	{
		//use service
		List<ToDo>list=service.getAllEmployees();
		System.out.println(list);
		//put the result in model attributes
		map.put("empsData",list);
		System.out.println(map);
		return "task_record";
	}
	
	    @GetMapping("/createtask")
	    public String AddEmployeeForm(@ModelAttribute("todo")ToDo todo) {
		return"task_register";
	}
	
     	@PostMapping("/createtask")
	    public String addEmployee(Map<String,Object>map,@ModelAttribute("todo") ToDo todo) {
		String result=service.registerEmployee(todo);//in this line we save the emp details
		List<ToDo>list=service.getAllEmployees();
		map.put("resultMsg",result);
		map.put("empsData",list);
		return "task_record";
		}
	

}

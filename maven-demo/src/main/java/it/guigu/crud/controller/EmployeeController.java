package it.guigu.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.guigu.crud.bean.Department;
import it.guigu.crud.dao.DepartmentMapper;

@Controller
@ResponseBody
public class EmployeeController {
	
	@Autowired
	DepartmentMapper departmentMapper;
	
	@RequestMapping("/emp")
	public Department  t(){
		Department dept =   departmentMapper.selectByPrimaryKey(1);
		return dept;
	}
}

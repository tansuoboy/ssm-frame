package it.guigu.crud.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import it.guigu.crud.bean.Department;
import it.guigu.crud.bean.DepartmentExample;
import it.guigu.crud.bean.Employee;
import it.guigu.crud.bean.EmployeeExample;
import it.guigu.crud.dao.DepartmentMapper;
import it.guigu.crud.dao.EmployeeMapper;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class SelectTest {

	@Autowired()
	DepartmentMapper departmentMapper;
	
	@Autowired()
	EmployeeMapper employee;
	
	//测试数据库连接情况
	@Test
	public void inset(){
		departmentMapper.insert(new Department(1,"UI"));
	}
	@Test
	public void inset2(){
		Employee emp =new Employee();
		/*emp.setEmpName("张杰");
		emp.setEmpId(1);*/
		//添加数据库的数据
		//employee.insertSelective(emp);
		//修改数据库的参数
		//employee.updateByExample(emp, new EmployeeExample());
		//查找数据库的数据
		//emp =employee.selectByPrimaryKey(1);
		//删除数据库的数据
		//employee.deleteByPrimaryKey(1);
		System.out.println(emp);
		//
		
	}
}

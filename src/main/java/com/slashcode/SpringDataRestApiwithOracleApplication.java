package com.slashcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.slashcode.entity.EmployeeData;
import com.slashcode.service.EmpServiceImpl;
import com.slashcode.service.IEmpService;

@SpringBootApplication
public class SpringDataRestApiwithOracleApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringDataRestApiwithOracleApplication.class, args);
		IEmpService empSer = ac.getBean(EmpServiceImpl.class);
		
		EmployeeData emp = new EmployeeData();
		emp.setEmpName("Govindha");
		emp.setEmpSalary(1000.09);
		
		
		if(empSer.saveEmployee(emp)) {
			System.out.println("Inserted in Main");
		}
		
		
		
	}

}

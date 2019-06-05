package com.slashcode.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.slashcode.entity.EmployeeData;
import com.slashcode.repository.IEmpRepository;

@Service
public class EmpServiceImpl implements IEmpService {

	@Autowired
	private IEmpRepository empRepo;
	
	
	@Override
	public boolean saveEmployee(EmployeeData e) {
		System.out.println("Inserted in Service");
		EmployeeData emp = ((CrudRepository<EmployeeData, Serializable>) empRepo).save(e);
		
		return (emp!=null)?true:false;
	}

}

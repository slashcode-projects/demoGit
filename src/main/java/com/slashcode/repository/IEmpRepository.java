package com.slashcode.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.slashcode.entity.EmployeeData;

@Repository
public interface IEmpRepository extends CrudRepository<EmployeeData, Serializable>{

}

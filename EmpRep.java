package com.ensemble.lombokDemo.repository;

import com.ensemble.lombokDemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRep extends JpaRepository<Employee, Integer> {
}

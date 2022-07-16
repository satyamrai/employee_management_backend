package com.satyam.employee_management_backend.repository;

import com.satyam.employee_management_backend.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}

package com.example.exam.reponsitory;

import com.example.exam.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeReponsitory extends JpaRepository<Employee,Long> {
}

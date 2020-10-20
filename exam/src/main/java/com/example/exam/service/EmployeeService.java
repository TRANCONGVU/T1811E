package com.example.exam.service;

import com.example.exam.entity.Employee;
import com.example.exam.reponsitory.EmployeeReponsitory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeReponsitory employeeReponsitory;

    public List<Employee> findAll(){
       return employeeReponsitory.findAll();
    }

    public Optional<Employee> findById(Long id){
        return employeeReponsitory.findById(id);
    }

    public Employee save(Employee emp){
        return employeeReponsitory.save(emp);
    }

    public void deleteById(Long id){
        employeeReponsitory.deleteById(id);
    }
}

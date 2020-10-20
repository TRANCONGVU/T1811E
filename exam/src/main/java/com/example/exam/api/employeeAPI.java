package com.example.exam.api;

import com.example.exam.entity.Employee;
import com.example.exam.service.EmployeeService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/employees")
@RequiredArgsConstructor
public class employeeAPI {

    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> findAll(){
        return ResponseEntity.ok(employeeService.findAll());
    }

    @PostMapping
    public ResponseEntity create(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.save(employee));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> findById(@PathVariable Long id){
        Optional<Employee> prod = employeeService.findById(id);
        if(!prod.isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(prod.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> update(@PathVariable Long id,
                                           @RequestBody Employee employee){
        Optional<Employee> prod = employeeService.findById(id);
        if(!prod.isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(employeeService.save(employee));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Employee> delete(@RequestBody Long id){
        Optional<Employee> prod = employeeService.findById(id);
        if(!prod.isPresent()){
            ResponseEntity.badRequest().build();
        }
        employeeService.deleteById(id);
        return ResponseEntity.ok().build();
    }



}

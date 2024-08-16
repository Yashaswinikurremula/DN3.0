package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.entity.Department;
import com.example.employeemanagementsystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    // Retrieve all departments
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    // Retrieve a single department by ID
    public Optional<Department> getDepartmentById(Long id) {
        return departmentRepository.findById(id);
    }

    // Create or update a department
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    // Delete a department by ID
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}


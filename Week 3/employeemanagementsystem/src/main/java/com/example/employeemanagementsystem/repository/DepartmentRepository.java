package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Find departments with a name containing a specific substring
    @Query("SELECT d FROM Department d WHERE LOWER(d.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Department> findDepartmentsWithNameContaining(@Param("name") String name);

    // Find department by exact name
    @Query("SELECT d FROM Department d WHERE d.name = :name")
    Department findByNameExact(@Param("name") String name);
}


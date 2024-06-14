package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Derived query method
    List<Employee> findByDepartment(String department);

    // Custom query using JPQL
    @Query("SELECT e FROM Employee e WHERE e.firstName = :firstName AND e.lastName = :lastName")
    List<Employee> findByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);

    // Custom query using native SQL
    @Query(value = "SELECT * FROM Employee e WHERE e.department = :department", nativeQuery = true)
    List<Employee> findByDepartmentNative(@Param("department") String department);
}

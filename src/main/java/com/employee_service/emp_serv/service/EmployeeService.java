package com.employee_service.emp_serv.service;

import com.employee_service.emp_serv.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    //    void saveEmployees(List<Employee> employees);
    Employee getEmployeeById(Long id);

    void deleteEmployeeById(Long id);

    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}

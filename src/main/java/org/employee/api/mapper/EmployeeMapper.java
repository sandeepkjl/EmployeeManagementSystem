package org.employee.api.mapper;

import org.employee.api.entity.EmployeeEntity;
import org.employee.api.model.Department;
import org.employee.api.model.EmployeeDTO;

public class EmployeeMapper
{
    public EmployeeDTO entityTODTO(EmployeeEntity employeeEntity)
    {
        EmployeeDTO employeeDTO=getEmpDTO(employeeEntity);
        return employeeDTO;
    }

    private EmployeeDTO getEmpDTO(EmployeeEntity employeeEntity)
    {
        EmployeeDTO employeeDTO=new EmployeeDTO();
        employeeDTO.setEmpId(employeeEntity.getEmpId());
        employeeDTO.setEmpName(employeeEntity.getEmpName());
        employeeDTO.setSalary(employeeEntity.getSalary());
        employeeDTO.setDesignation(employeeEntity.getDesignation());
        employeeDTO.setDept(getDeptInfo(employeeEntity));

        return employeeDTO;
    }

    private Department getDeptInfo(EmployeeEntity employeeEntity)
    {
        Department dept=new Department();
        dept.setDeptId(employeeEntity.getEmpId().substring(0,2));
        dept.setDeptName(employeeEntity.getDeptName());
        dept.setDeptHead("defaultHead");
        return dept;
    }
}

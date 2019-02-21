package org.employee.api.mapper;

import org.employee.api.entity.EmployeeEntity;
import org.employee.api.model.EmployeeDTO;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper
{
    public EmployeeDTO entityTODTO(EmployeeEntity employeeEntity)
    {
        EmployeeDTO employeeDTO=getEmpDTO(employeeEntity);
        return employeeDTO;
    }

    public EmployeeEntity DTOTOEntity(EmployeeDTO employeeDTO)
    {
        EmployeeEntity employeeEntity=getEmpEntity(employeeDTO);
        return employeeEntity;
    }

    private EmployeeDTO getEmpDTO(EmployeeEntity employeeEntity)
    {
        EmployeeDTO employeeDTO=new EmployeeDTO();
        employeeDTO.setEmpId(employeeEntity.getEmpId());
        employeeDTO.setEmpName(employeeEntity.getEmpName());
        employeeDTO.setSalary(employeeEntity.getSalary());
        employeeDTO.setDesignation(employeeEntity.getDesignation());
        employeeDTO.setDeptId(employeeEntity.getDepId());
        employeeDTO.setSkills(employeeEntity.getSkills());

        return employeeDTO;
    }


    /*private Department getDeptInfo(EmployeeEntity employeeEntity)
    {
        Department dept=new Department();
        dept.setDeptId(employeeEntity.getEmpId().substring(0,2));
        dept.setDeptName(employeeEntity.getDeptName());
        dept.setDeptHead("defaultHead");
        return dept;
    }*/

    private EmployeeEntity getEmpEntity(EmployeeDTO employeeDTO)
    {
        EmployeeEntity employeeEntity=new EmployeeEntity();
        employeeEntity.setEmpId(employeeDTO.getEmpId());
        employeeEntity.setEmpName(employeeDTO.getEmpName());
        employeeEntity.setSalary(employeeDTO.getSalary());
        employeeEntity.setDepId(employeeDTO.getDeptId());
        employeeEntity.setDesignation(employeeDTO.getDesignation());
        employeeEntity.setSkills(employeeDTO.getSkills());
        return  employeeEntity;
    }

}

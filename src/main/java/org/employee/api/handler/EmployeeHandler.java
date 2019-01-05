package org.employee.api.handler;

//import org.employee.api.repository.DatabaseService;
import org.employee.api.entity.EmployeeEntity;
import org.employee.api.mapper.EmployeeMapper;
import org.employee.api.model.EmployeeDTO;
import org.employee.api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeHandler {

    @Autowired
    private EmployeeRepository databaseService;
    private EmployeeMapper employeeMapper;
    private EmployeeHandler employeeHandler;

    public EmployeeDTO getEmployee(String id)
    {
        EmployeeEntity employeeEntity =databaseService.findByEmpId(id);
        EmployeeDTO employeeDTO=employeeMapper.entityTODTO(employeeEntity);

        return employeeDTO;

    }



}

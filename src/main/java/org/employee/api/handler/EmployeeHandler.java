package org.employee.api.handler;

//import org.employee.api.repository.DatabaseService;
import org.employee.api.client.DeptClient;
import org.employee.api.entity.EmployeeEntity;
import org.employee.api.exception.subexception.NotFoundException;
import org.employee.api.mapper.EmployeeMapper;
import org.employee.api.model.EmployeeDTO;
import org.employee.api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeHandler {

    @Autowired
    private EmployeeRepository databaseService;
    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private DeptClient deptClient;

    @Autowired
    private  EmployeeHandler employeeHandler;

    public EmployeeDTO getEmployee(String id)
    {

        EmployeeEntity employeeEntity =databaseService.findOne(id);
        if(employeeEntity==null)
        {
            throw new NotFoundException("Employee With This Id Does not Exist");
        }
        EmployeeDTO employeeDTO=employeeMapper.entityTODTO(employeeEntity);

        return employeeDTO;

    }

    public EmployeeDTO createEmployeee(EmployeeDTO employeeDTO)
    {
        //check dept Exist or not
        String deptId = deptClient.getDepartment(employeeDTO.getDeptId());
        if(deptId==null)
        {
            // create ne dept if dept does not exist.
            deptClient.createDepartment(employeeDTO.getDeptId());
        }
        //convert into employee entity
        EmployeeEntity employeeEntity=employeeMapper.DTOTOEntity(employeeDTO);

        //save employee entity
        databaseService.save(employeeEntity);
        return employeeDTO;
    }



}

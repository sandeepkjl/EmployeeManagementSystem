package org.employee.api.controller;


import javassist.tools.web.BadHttpRequest;
import org.employee.api.entity.EmployeeEntity;
import org.employee.api.exception.subexception.BadRequestException;
import org.employee.api.handler.EmployeeHandler;
import org.employee.api.model.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class EmployeeController
{
    @Autowired
    private EmployeeHandler employeeHandler;

    @RequestMapping(value="/employee/{id}",consumes = {"application/json"}, produces = {"application/json"}, method = RequestMethod.GET)
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable("id") String empId) throws Exception
    {

        EmployeeDTO employeeDTO=employeeHandler.getEmployee(empId);


        ResponseEntity<EmployeeDTO> responseEntity=new ResponseEntity<EmployeeDTO>(employeeDTO, HttpStatus.OK);
        return responseEntity;

    }

    @RequestMapping(value = "/createEmployee", method = RequestMethod.POST, consumes = {"application/json"} , produces={"application/json"})
    public ResponseEntity<EmployeeDTO> createEmployee(@Valid @RequestBody EmployeeDTO employeeDTO, BindingResult result)
    {
        if(result.hasErrors())
        {
            throw new BadRequestException(result.getAllErrors().get(0).getDefaultMessage(),"400");
        }
        EmployeeDTO empDTO = employeeHandler.createEmployeee(employeeDTO);
        ResponseEntity responseEntity= new ResponseEntity(employeeDTO, HttpStatus.CREATED);
        return responseEntity;
    }





}

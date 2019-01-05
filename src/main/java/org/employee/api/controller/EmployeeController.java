package org.employee.api.controller;


import org.employee.api.handler.EmployeeHandler;
import org.employee.api.model.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
    @Autowired
    private EmployeeHandler employeeHandler;

    @RequestMapping(value="/employee/{id}",consumes = {"application/json"}, produces = {"application.json"}, method = RequestMethod.GET)
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable("id") String empId)
    {

        EmployeeDTO employeeDTO=employeeHandler.getEmployee(empId);

        ResponseEntity<EmployeeDTO> responseEntity=new ResponseEntity<EmployeeDTO>(employeeDTO, HttpStatus.OK);
        return responseEntity;

    }



}

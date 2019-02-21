package org.employee.api.client;

import org.employee.api.exception.subexception.BadGatewayException;
import org.employee.api.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class DeptClient  {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${dept.get.url}")
    private String getUrl;

    @Value("${dept.create.url}")
    private String createUrl;

    public String getDepartment(String deptId)
    {
        HttpHeaders headers =new HttpHeaders();
        headers.add("Content-Type" , "application/json");
        headers.add("Accept","application/json");
        HttpEntity httpEntity = new HttpEntity(headers);
        String depturl=getUrl+"/"+deptId;
        try
        {
            ResponseEntity<Department> department=restTemplate.exchange(depturl, HttpMethod.GET, httpEntity, Department.class);

            Department dept=(Department)department.getBody();

            return dept.getDeptId();
        }

        catch(HttpClientErrorException e)
        {
            if(e.getStatusCode()== HttpStatus.NOT_FOUND)
            return null;
            else{
                throw new BadGatewayException("Badgateway","502");
            }
        }
        catch(Exception e)
        {
            throw new BadGatewayException("Badgateway","502");
        }
    }

    public void createDepartment(String deptId)
    {
        HttpHeaders headers =new HttpHeaders();
        headers.add("Content-Type" , "application/json");
        headers.add("Accept","application/json");

        Department deptObj=new Department(deptId,"Unkonown Department");
        HttpEntity httpEntity = new HttpEntity(deptObj);
        try
        {
            restTemplate.exchange(createUrl, HttpMethod.POST, httpEntity, Department.class);

        }
        catch (Exception e)
        {
            throw new BadGatewayException("Bad Gateway", "502");
        }

    }
}

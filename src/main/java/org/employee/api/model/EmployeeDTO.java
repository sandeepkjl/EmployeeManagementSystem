package org.employee.api.model;


import org.employee.api.entity.SkillEntity;

import javax.validation.constraints.Size;
import java.util.List;

public class EmployeeDTO
{


    private String empId;
    private String empName;
    private Long  salary;
    private String designation;
    private String  deptId;
    private List<SkillEntity> skills;


    public EmployeeDTO() {
        super();
    }

    public EmployeeDTO(String empId, String empName, Long salary, String designation, String deptId, List<SkillEntity> skills) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.designation = designation;
        this.deptId = deptId;
        this.skills = skills;
    }


    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public List<SkillEntity> getSkills() {
        return skills;
    }

    public void setSkills(List<SkillEntity> skills) {
        this.skills = skills;
    }


    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                ", deptId='" + deptId + '\'' +
                ", skills=" + skills +
                '}';
    }
}

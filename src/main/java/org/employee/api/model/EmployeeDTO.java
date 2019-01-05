package org.employee.api.model;


public class EmployeeDTO
{

    private String empId;
    private String empName;
    private Long  salary;
    private String designation;
    private Department  dept;


    public EmployeeDTO() {
        super();
    }

    public EmployeeDTO(String empId, String empName, Long salary, String designation, Department dept) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.designation = designation;
        this.dept = dept;
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

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                ", dept=" + dept +
                '}';
    }
}

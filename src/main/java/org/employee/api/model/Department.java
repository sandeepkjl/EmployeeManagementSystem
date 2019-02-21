package org.employee.api.model;

public class Department
{
    private String deptId;
    private String deptName;

    public Department() {
        super();
    }

    public Department(String deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }


    public String getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }


    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}

package org.employee.api.model;

public class Department
{
    private  String deptId;
    private String deptName;
    private String deptHead;

    public Department() {
        super();
    }

    public Department(String deptId, String deptName, String deptHead) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptHead = deptHead;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setDeptHead(String deptHead) {
        this.deptHead = deptHead;
    }

    public String getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getDeptHead() {
        return deptHead;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", deptHead='" + deptHead + '\'' +
                '}';
    }
}

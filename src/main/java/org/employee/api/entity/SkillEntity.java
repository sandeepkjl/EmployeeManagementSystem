package org.employee.api.entity;

import org.hibernate.annotations.GeneratorType;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_Skills")
public class SkillEntity {

    @Id
    @GeneratedValue
    private long skillId;
    private String empId;
    private String skill;

    public SkillEntity() {
    }

    public SkillEntity(String skill) {
        this.skill = skill;
    }

    public long getSkillId() {
        return skillId;
    }

    public void setSkillId(long skillId) {
        this.skillId = skillId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}


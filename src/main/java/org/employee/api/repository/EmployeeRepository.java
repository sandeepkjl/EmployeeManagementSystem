package org.employee.api.repository;

import org.employee.api.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity,String> {

    @Override
    EmployeeEntity findOne(String s);

    public EmployeeEntity save(EmployeeEntity employeeEntity);

}

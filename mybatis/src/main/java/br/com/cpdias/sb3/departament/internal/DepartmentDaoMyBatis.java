package br.com.cpdias.sb3.departament.internal;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentDaoMyBatis implements  DepartmentoDao {
    @Override
    public List<Department> getAll() {
        return List.of();
    }

    @Override
    public Department write(Department department) {
        return null;
    }
}

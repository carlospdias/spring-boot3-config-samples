package br.com.cpdias.sb3.departament.internal;

import java.util.List;

public interface DepartmentoDao {

    List<Department>getAll();

    Department write(Department department);

}

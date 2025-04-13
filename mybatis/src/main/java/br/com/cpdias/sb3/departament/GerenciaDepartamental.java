package br.com.cpdias.sb3.departament;

import br.com.cpdias.sb3.departament.internal.Department;
import br.com.cpdias.sb3.departament.internal.DepartmentoDao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GerenciaDepartamental {

    private DepartmentoDao departmentDao;

    public GerenciaDepartamental(DepartmentoDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    public List<DepartamentVO> listaDepartamentos(){
        List<DepartamentVO> listaDepartamentos = new ArrayList<>();
        return listaDepartamentos;
    }
    public DepartamentVO adicionaDepartamento(DepartamentVO departamento) {
        DepartamentVO departamentCriado = null;

        return departamentCriado;

    }

}

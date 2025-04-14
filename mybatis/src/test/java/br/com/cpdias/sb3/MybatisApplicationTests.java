package br.com.cpdias.sb3;

import br.com.cpdias.sb3.departament.DepartamentVO;
import br.com.cpdias.sb3.departament.GerenciaDepartamental;
import br.com.cpdias.sb3.departament.internal.Department;
import org.assertj.core.error.ShouldNotBeNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    private GerenciaDepartamental gerenciaDepartamental;

	@Test
	void contextLoads() {
        assertThat(gerenciaDepartamental)
                .isNotNull();

	}

    @Test
    void shouldNotBeNull() {
        List<DepartamentVO>all = gerenciaDepartamental.listaDepartamentos();
        assertThat(all.size()).isEqualTo(0);
        System.out.println(all);
        System.out.println("okkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");

    }
}

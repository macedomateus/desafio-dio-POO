import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHorario(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso MySQL");
		curso2.setDescricao("Descrição curso MySQL");
		curso2.setCargaHorario(5);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devMateus = new Dev();
		devMateus.setNome("Mateus Macedo");
		devMateus.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Mateus " + devMateus.getConteudosInscritos());
		devMateus.progredir();
		System.out.println("---");
		System.out.println("Conteúdos Inscritos Mateus " + devMateus.getConteudosInscritos());
		System.out.println("---");
		System.out.println("Conteúdos Concluídos  Mateus " + devMateus.getConteudosConcluidos());
		System.out.println("---");
		System.out.println(devMateus.calcularTotalXp());
	}

}

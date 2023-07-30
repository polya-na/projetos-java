package bootcamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import bootcamp.dominio.Bootcamp;
import bootcamp.dominio.Conteudo;
import bootcamp.dominio.Curso;
import bootcamp.dominio.Desenvolvedor;
import bootcamp.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
		Curso cursoJavaBasico = new Curso();
		cursoJavaBasico.setTitulo("Java Básico");
		cursoJavaBasico.setDescricao("Aprenda os conceitos básicos de Java.");
		cursoJavaBasico.setCargaHoraria(16);
		
		Curso cursoJavaScript = new Curso();
		cursoJavaScript.setTitulo("JavaScript Básico");
		cursoJavaScript.setDescricao("Aprenda os conceitos básicos de Javascript.");
		cursoJavaScript.setCargaHoraria(10);
		
		Curso cursoJavaAvancado = new Curso();
		cursoJavaAvancado.setTitulo("Java Avançado");
		cursoJavaAvancado.setDescricao("Aprenda os conceitos avançados sobre Java.");
		cursoJavaAvancado.setCargaHoraria(46);
		
		Mentoria mentoriaJavaBasico = new Mentoria();
		mentoriaJavaBasico.setTitulo("Aprendendo Orientação a Objetos com Java");
		mentoriaJavaBasico.setDescricao("Imersão sobre os pilares da Orientação a Objetos.");
		mentoriaJavaBasico.setData(LocalDateTime.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("GFT START #2 Java");
		bootcamp.setInicio(LocalDate.now());
		bootcamp.setFim(bootcamp.getInicio().plusDays(45));
		List<Conteudo> conteudosBootcamp = Arrays.asList(cursoJavaBasico, cursoJavaAvancado, mentoriaJavaBasico);
		bootcamp.setConteudos(conteudosBootcamp);
		
		Desenvolvedor dev1 = new Desenvolvedor();
		dev1.setNome("Polyana");
		
		Desenvolvedor dev2 = new Desenvolvedor();
		dev2.setNome("Luiz");
		
		dev1.inscrever(cursoJavaScript);
		dev1.inscrever(bootcamp);
		dev1.inscrever(mentoriaJavaBasico);
		dev1.progredir();
		dev1.progredir();
		
		dev2.inscrever(bootcamp);
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
	}
}

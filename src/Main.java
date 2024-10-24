import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classes como Curso, Mentoria, Bootcamp e Dev aqui


public class Main {
    public static void main(String[] args) {
        // Criando Cursos
        Curso cursoJava = new Curso("Java Básico", "Curso introdutório de Java", 8);
        Curso cursoPOO = new Curso("POO com Java", "Curso de Programação Orientada a Objetos", 10);
        
        // Criando Mentoria
        Mentoria mentoriaJava = new Mentoria("Mentoria Java", "Dicas avançadas de Java", LocalDate.now());
        
        // Criando Bootcamp
        Bootcamp bootcampJava = new Bootcamp("Bootcamp Java Developer", "Aprenda Java e OOP do zero ao avançado!");
        bootcampJava.adicionarConteudo(cursoJava);
        bootcampJava.adicionarConteudo(cursoPOO);
        
        // Criando Devs
        Dev devJoao = new Dev("João");
        Dev devMaria = new Dev("Maria");
        
        // Inscrever Devs no Bootcamp
        bootcampJava.inscreverDev(devJoao);
        bootcampJava.inscreverDev(devMaria);
        
        // Inscrição de cursos pelos Devs
        devJoao.inscreverCurso(cursoJava);
        devMaria.inscreverCurso(cursoPOO);
        
        // Simulando progresso dos devs
        devJoao.progredir();
        devMaria.progredir();

        // Exibindo resultados
        System.out.println("Conteúdos do Bootcamp: " + bootcampJava.getConteudos());
        System.out.println("Dev João - Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Dev João - Conteúdos Concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("Dev Maria - Conteúdos Inscritos: " + devMaria.getConteudosInscritos());
        System.out.println("Dev Maria - Conteúdos Concluídos: " + devMaria.getConteudosConcluidos());
    }
}

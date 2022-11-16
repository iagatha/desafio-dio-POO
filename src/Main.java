import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso polimorfismo");
        curso2.setDescricao("descrição curso java");
        curso2.setCargaHoraria(7);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao de mentoria");
        mentoria.setData(LocalDate.now());


        /*System.out.println(mentoria);
        System.out.println(curso1);
        System.out.println(curso2);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descricao Bootcamp Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devIagatha = new Dev();
        devIagatha.setNome("iagatha");
        devIagatha.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos" + devIagatha.getConteudosInscritos());
        devIagatha.progredir();
        System.out.println("-");
        System.out.println("Conteudos Incritos" + devIagatha.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devIagatha.getConteudosConcluidos());
        System.out.println("XP: " + devIagatha.calcularTotalXp());



        Dev devAfrodite = new Dev();
        devAfrodite.setNome("Afrodite");
        devAfrodite.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos" + devIagatha.getConteudosInscritos());
        devAfrodite.progredir();
        devAfrodite.progredir();
        devAfrodite.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscrito " + devAfrodite.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + devAfrodite.getConteudosConcluidos());
        System.out.println("XP: " + devAfrodite.calcularTotalXp());



    }
}
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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


        System.out.println(mentoria);
        System.out.println(curso1);
        System.out.println(curso2);
    }
}
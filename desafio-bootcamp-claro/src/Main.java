import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);


        curso2.setTitulo("curso c#");
        curso2.setDescricao("Descrição curso c#");
        curso2.setCargaHoraria(5);

        

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev devDavid = new Dev();
        devDavid.setNome("David");
        devDavid.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devDavid.getConteudoInscritos());
        devDavid.progredir();
        devDavid.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devDavid.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos " + devDavid.getConteudosConcluidos());
        System.out.println("XP: " + devDavid.calcularTotalXp());

        System.out.println("--------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devJoao.getConteudoInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

        System.out.println("--------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devCamila.getConteudoInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());


    }
}

// 4 - Criar uma Classe para testar a aplicação, possibilitando a interação com o usuário, 
// para manipular os dados permitindo as opções para 
// (Incluir, pesquisar, alterar e excluir os dados armazenados no vetor);

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            // criador o vetor das consultas
            Vetor vetor = new Vetor(3);

            // instanciando as Consultas
            Consulta c1, c2, c3, c4, c5;
            c1 = new Consulta("Padmé Amigdala", 25, "Dermatologia", 2025, Calendar.MARCH, 12, 12, 30, "Votuporanga");
            c2 = new Consulta("Anakin Skywalker", 22, "Psiquiatria", 2025, Calendar.MARCH, 20, 9, 0, "Marília");
            c3 = new Consulta("Yoda Mandalorian", 800, "Psicologia", 2025, Calendar.APRIL, 2, 16, 45, "Nações Unidas");
            c4 = new Consulta("Lando Calrissian", 41, "Fisioterapia", 2025, Calendar.FEBRUARY, 26, 7, 00, "Interlagos");
            c5 = new Consulta("Han Solo", 35, "Ortopedia", 2025, Calendar.MARCH, 1, 15, 30, "Lapa");

            // adicionando consultas ao vetor
            vetor.adicionar(c1);
            vetor.adicionar(c2);
            vetor.adicionar(c3);
            vetor.adicionar(c4);
            vetor.adicionar(c5);

            // imprimindo o vetor
            System.out.println("Vetor de consultas:");
            System.out.println(vetor);

            // buscando uma consulta pelo índice
            System.out.println("\nConsulta no índice 1:");
            System.out.println(vetor.busca(1));

            // buscando uma consulta pelo objeto
            System.out.println("\nBuscando índice da consulta do Yoda:");
            System.out.println(vetor.busca(c3));

            // removendo uma consulta pelo índice
            System.out.println("\nRemovendo a consulta no índice 0:");
            vetor.remove(0); // remove a consulta de Padmé
            System.out.println(vetor);

            // removendo uma consulta pelo objeto
            System.out.println("\nRemovendo a consulta do Anakin:");
            vetor.remove(c2);
            System.out.println(vetor);

            // adicionando mais uma consulta ao início
            System.out.println("\nAdicionando uma nova consulta no início:");
            vetor.adicionarInicio(new Consulta("Obi-Wan Kenobi", 75, "Geriatria", 2025, Calendar.MARCH, 8, 10, 0, "Caçapava"));
            System.out.println(vetor);

            // buscando o primeiro e último elemento
            System.out.println("\nPrimeira Consulta: \n" + vetor.buscaPrimeiro());
            System.out.println("Última Consulta: \n" + vetor.buscaUltimo());

            // limpando o vetor
            vetor.limpar();
            System.out.println("\nVetor após limpeza:");
            System.out.println(vetor);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
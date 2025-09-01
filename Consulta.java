// 3 - Criar uma Classe (que terá a lista de atributos ou informações para atender a situação / e/ou problema 
// - Exemplo na aula 03 - classe contato) com todos os métodos para manipular os dados;

import java.util.Calendar;
import java.text.SimpleDateFormat;


///ERICK APARECEU AQUI 
public class Consulta {
    Calendar calendario = Calendar.getInstance();
    private String nome;
    private int idade;
    private String especialidade;
    private Calendar data;
    private String unidade;

    public Consulta(String nome, int idade, String especialidade, int ano, int mes, int dia, int hora, int minuto, String unidade) {
        this.nome = nome;
        this.idade = idade;
        this.especialidade = especialidade;
        this.unidade = unidade;

        this.data = Calendar.getInstance();
        this.data.set(ano, mes, dia, hora, minuto);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
        String dataFormatada = formatador.format(data.getTime());

        String msg = String.format("-------------------------%n" +
        "Nome do paciente: %s%n" +
        "Idade: %d%n" +
        "Especialidade: %s%n" +
        "Data: %s%n" +
        "Unidade: %s%n" +
        "-------------------------%n", nome, idade, especialidade, dataFormatada, unidade);

        return msg;
    }

}
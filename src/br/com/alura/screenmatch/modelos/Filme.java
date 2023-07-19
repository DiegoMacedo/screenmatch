package br.com.alura.screenmatch.modelos;

public class Filme {
    public String nome;
    public int anoDeLancamento;
    public boolean incluindoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    public int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public void exibeFichaTecnica(){
        System.out.println("Nome do br.com.alura.screenmatch.modelos.Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração do br.com.alura.screenmatch.modelos.Filme: " + duracaoEmMinutos);
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}

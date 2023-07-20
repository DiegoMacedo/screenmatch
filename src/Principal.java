import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Serie lost = new Serie();
        Filme filme2 = new Filme();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        meuFilme.setNome("O poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        filme2.setNome("Avatar");
        filme2.setAnoDeLancamento(2020);
        filme2.setDuracaoEmMinutos(200);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);


        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        lost.setNome("Lost");
        lost.setAnoDeLancamento(200);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodios(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        calculadora.inclui(meuFilme);
        calculadora.inclui(filme2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
    }
}

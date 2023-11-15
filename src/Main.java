// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        System.out.print("Bem vindo ao serviço de streaming de filmes");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento:" + anoDeLancamento);

        boolean incluidoNoPlano = true;

        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
        Filme Top Gun
        Filme de aventura com galã dos anos 80
        Muito bom!
        Ano de Lançamento
        """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media / 3);
        System.out.println(classificacao);

        String nome = "caiao";
        int idade = 27;
        System.out.printf("meu nome é %s, tenho %d anos.%n", nome, idade);

        System.out.println(String.format("meu nome é %s, tenho %d anos.", nome, idade));

        String textoDescricao;
        textoDescricao = """
        Meu nome é %s,
        tenho %d anos,
        estou aprendendo funcionalidades do java
        olá meu nome é caio
        """.formatted(nome,idade);
        System.out.println(textoDescricao);

    }
}

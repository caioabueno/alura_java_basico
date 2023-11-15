# Java, primeiro contato

## Conteúdo do curso:

- Configuração de ambiente;
- Introdução à IDE Intellij Community; (debbuguer, criação de projeto, classe, quickfix, idea e afins)
- Funcionalidades da linguagem;
- Declaração de variáveis e tipos de dados;
- Estrutura condicional e de loop;

Para iniciar este curso foi configurado o ambiente da seguinte forma:
Download o JDK 17(Java Development Kit);
IDE Intellij Community;
Adicionar o JDK no PATH; *caso o diretório bin do JDK não fosse adicionado ao PATH haveriam algumas inconveniencias ao compilar e executar o código, onde seria necessário sempre informar o caminho completo do programa*
Adicionar o Intellij no PATH; *nesse caso foi feito na instalação da IDE*

### Criando o primeiro projeto

![capture_231113_224612.png](Java,%20primeiro%20contato%200e2e0a846ad24c0a96b70f1f9898208c/capture_231113_224612.png)

Analisando a estrutura do projeto:

![java3.jpg](Java,%20primeiro%20contato%200e2e0a846ad24c0a96b70f1f9898208c/java3.jpg)

Estrutura inicial.

![jjass.jpg](Java,%20primeiro%20contato%200e2e0a846ad24c0a96b70f1f9898208c/jjass.jpg)

Estrutura pós compilação.

### Compilador, Debugger, logs de erro e afins

Compilador e console:

![run.jpg](Java,%20primeiro%20contato%200e2e0a846ad24c0a96b70f1f9898208c/run.jpg)

![runconsole.jpg](Java,%20primeiro%20contato%200e2e0a846ad24c0a96b70f1f9898208c/runconsole.jpg)

Recompilar: *(quando compilado, ao tentar dar “run” o programa não contará com as atualizações se não recompilado)*

![recompile.jpg](Java,%20primeiro%20contato%200e2e0a846ad24c0a96b70f1f9898208c/recompile.jpg)

Alertas:

**❗Erro / ⚠️ Aviso / ✔️ Sugestão**

![errorlog.jpg](Java,%20primeiro%20contato%200e2e0a846ad24c0a96b70f1f9898208c/errorlog.jpg)

![errorlogconsole.jpg](Java,%20primeiro%20contato%200e2e0a846ad24c0a96b70f1f9898208c/errorlogconsole.jpg)

Linha do erro:

![errorline.jpg](Java,%20primeiro%20contato%200e2e0a846ad24c0a96b70f1f9898208c/errorline.jpg)

### Exemplos práticos de sintaxe, declaração de variáveis e afins

```java
public class Main {
    public static void main(String[] args) {
        //Variações do system out
				/// Print - printa no console; Println - printa no console e quebra a linha.
				System.out.print("Bem vindo ao serviço de streaming de filmes");
        System.out.println("Filme: Top Gun: Maverick");
				//Declaração de tipos e variáveis
        int anoDeLancamento = 2022;
        ///Sintaxe Concatenação
				System.out.println("Ano de lançamento:" + anoDeLancamento);

        boolean incluidoNoPlano = true;

        double notaDoFilme = 8.1;
				//Sintaxe operação aritmética
        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);
				//Sintaxe String textbox
        String sinopse;
        sinopse = """
        Filme Top Gun
        Filme de aventura com galã dos anos 80
        Muito bom!
        Ano de Lançamento
        """ + anoDeLancamento;
        System.out.println(sinopse);
				//Sintaxe casting / conversão tipos de dados*
        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println(classificacao);
				//Sintaxe placeholders com printf **
				/// Printf p/ print de console com formatação
        String nome = "caiao";
        int idade = 27;
        System.out.printf("meu nome é %s, tenho %d anos.%n", nome, idade);
				//Sintaxe equivalente ao "printf", utilizado p formatação
        System.out.println(String.format("meu nome é %s, tenho %d anos.", nome, idade));

				//Sintaxe formatted(), alternativa ao format()
				/// Melhor legibilidade.
        String textoDescricao;
        textoDescricao = """
        Meu nome é %s,
        tenho %d anos,
        estou aprendendo funcionalidades do java
        """.formatted(nome,idade);
        System.out.println(textoDescricao);
    }
```

---

*****QuickFix do idea com a operação feita sem o casting:

antes:

![java4.jpg](Java,%20primeiro%20contato%200e2e0a846ad24c0a96b70f1f9898208c/java4.jpg)

depois:

![java5.jpg](Java,%20primeiro%20contato%200e2e0a846ad24c0a96b70f1f9898208c/java5.jpg)

******PlaceHolders de acordo com seus tipos:

- **`%s`**: Substituído por uma representação de string.
- **`%d`**: Substituído por um valor decimal.
- **`%f`**: Substituído por um valor de ponto flutuante.

**Extra**: `**%n**`, que nada mais é que a quebra de linha, porém com uma convenção global que abrange vários tipos de sistemas operacionais, por exemplo o %n no windows será substuído por '\r\n' e no linux será substituído por '\n'. Isso faz parte do paradigma java 'WOORA' (Write Once, Run Anywhere).

### Entrada de dados

```java
//Biblioteca Scanner
import java.util.Scanner;

public class Input {

    public class Leitura {
        public static void main(String[] args) {
            //Sintaxe para instanciar um novo objeto do tipo Scanner (construtor)
						Scanner leitura = new Scanner(System.in);
						//Sintaxe do uso do objeto do tipo Scanner
						/// nextLine(),nextInt(),nextDouble() - respectivamente, leitura de strings, inteiros e ponto flutuante
            System.out.println("Digite seu filme favorito");
            String filme = leitura.nextLine();
            System.out.println("Qual o ano de lançamento?");
            int anoDeLancamento = leitura.nextInt();
            System.out.println("Diga sua avaliação para o filme");
            double avaliacao = leitura.nextDouble();

            System.out.println("filme");
            System.out.println("anoDeLancamento");
            System.out.println("avaliacao");
        }
    }
}
```

### Leitura de dados, condicional e laços

Leitura de dados com Scanner:

```java
//biblioteca do construtor Scanner (a biblioteca é automaticamente importada no intellij ao usar o scanner)
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        //instancia um objeto da classe Scanner, nesse caso o objeto é "leitura" *
				Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        //lê o tipo de dado "string"
				String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento?");
        //lê o dado int
				int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga sua avaliação para o filme");
        //lê o dado double
				double avaliacao = leitura.nextDouble();

        System.out.println("filme");
        System.out.println("anoDeLancamento");
        System.out.println("avaliacao");
				//encerra o Scanner para liberar recursos
				leitura.close();
    }
}
```

Condicional com If / Else:

```java
public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (incluidoNoPlano == true || tipoPlano.equals("plus")){ // *
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
```

*****No “incluidoPlano == true” pode ser substituído por apenas “incluidoPlano”. Essa dica aparece no “warning” do intellij.

Estrutura de loop com for:

```java
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota;
        //sintaxe do for
				for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme  ");
            nota = leitura.nextDouble();
            //if verificando se a nota é valida
						if (nota > 10) {
                System.out.println("Nota invalida");
            } else {
                mediaAvaliacao += nota;
            }
        }
        System.out.println("Média de avaliações " + mediaAvaliacao/3);
				
    }
}
```

Estrutura de loop while:

```java
import java.util.Scanner;

public class Outroloop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
				int totalDeNotas = 0;
				//sintaxe while
				///enquanto 'nota diferente de -1' é o condicional para verificar se o loop irá parar de rodar
        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar  ");
            nota = leitura.nextDouble();
	          //verificação de nota valida
						if (nota > 10){
                System.out.println("Nota inválida");
            } else {
                //condicional que verifica se a nota será adicionada no total de notas e no total da media.
								if (nota != -1) {
                    //+= é equivalente à mediaAvaliacao = mediaAvaliacao + nota
										mediaAvaliacao += nota;
	                  //++ é sinal de incremento +1
										totalDeNotas++;
                }
            }
        }
        System.out.println("Média de avaliações " + mediaAvaliacao / totalDeNotas);
    }
}
```

### Desafio

![desafio.jpg](Java,%20primeiro%20contato%200e2e0a846ad24c0a96b70f1f9898208c/desafio.jpg)

Criar um sistema de banco com as funções de consulta, transferência e recebimento de valores

```java
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
```

---

Download do projeto:

[primeiroprojeto.zip](Java,%20primeiro%20contato%200e2e0a846ad24c0a96b70f1f9898208c/primeiroprojeto.zip)
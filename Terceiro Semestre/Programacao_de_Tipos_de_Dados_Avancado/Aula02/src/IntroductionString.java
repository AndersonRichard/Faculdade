/*
Aula introdutória a String e as várias possibilidades de se trabalhar com ela no dia a dia.
*/
public class IntroductionString {
    public static void main(String[] args) {
        // TODO auto-generated method stub
        String texto = "Texto 01";
        String texto2 = new String("Texto 02");
        //acessar caractere especifico dentro do texto indicado
        System.out.println(texto.charAt(1));//mostra o item na posição do array

        // obter o tamanho (quantidade de chars) do texto
        System.out.println(texto.length());
        //verificar se o texto é vazio
        System.out.println(texto == "");
        System.out.println(texto.length() == 0);
        System.out.println("".length() == 0);
        System.out.println(texto.isEmpty());

        //obter uma substring dentro do texto original definindo inico ou fim
        System.out.println(texto.substring(2));
        System.out.println(texto.substring(2,4));

        //**concatenar string
        String nome = "Marcos";
        String sobrenome = "Santos";
        String nomeCompleto = nome + sobrenome;
        String nomeCompleto2 = nome.concat(sobrenome);

        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(nomeCompleto);
        System.out.println(nomeCompleto2);

        //Imutabilidade
        // o tipo string em java é imutavel
        nome = "novonome"; // cria uma nova string e referencia na variavel
        String nam1 = "Hello";
        String nam2 = nam1;
        nam1 = "World";
        System.out.println(nam1 + nam2);

        //uper case e lower case
        String nomeMaisculo = "Marcos1111".toUpperCase();
        String nomeMinus = nomeMaisculo.toLowerCase();
        System.out.println(nomeMaisculo);
        System.out.println(nomeMinus);

        //Limpar o texto removendo os espaços em branco no inicio e no fim
        String textoSujo = "  Marcos ausgtu  ".trim();
        System.out.println(textoSujo);

        //
        String textoCompleto = "Anderson Richard da Silva";
        String nomes[] = textoCompleto.split(" ");
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        String nome2[] = textoCompleto.split("[,]");
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        // começa com e termina com
        String nomeDaPessoa = "Akemi Aparecida";
        System.out.println(nomeDaPessoa.startsWith("m"));
        System.out.println(nomeDaPessoa.startsWith("Akemi"));
        //este metodo é case sensitive, portanto diferencia maisculo dos minusculos
        System.out.println(nomeDaPessoa.endsWith("a"));
        System.out.println(nomeDaPessoa.endsWith("A"));

        //comparar duas Strings
        String exemplo1 = "Texto";
        String exemplo2 = "texto";
        //devolve 0 se são iguais ou um numero inteiro diferente de 0 para texto diferente
        //considera nimusculos e maisculos
        System.out.println(texto.compareTo(texto2));
        //naão considera minusculos e maisculos
        System.out.println(exemplo1.compareToIgnoreCase(exemplo2));
        System.out.println("Aqui aqui");
        //troca de uma string por outra dentro do texto
        String outroTexto = "Texto Qualquer";
        String novoTexto = outroTexto.replace("Texto" , "Palavra");
        System.out.println("aqui animal");
        String textoReplaceAll = outroTexto.replaceAll("[a-c]", "--");
        System.out.println(novoTexto);
        System.out.println(textoReplaceAll);

        //pesquisar o indice que esta em uma sequencia de caractere do texto
        String porca = "Novo texto";
        System.out.println(porca.indexOf("texto"));

        //separar um texto em um array de palavras
        //colocar a primeira letra de cada palavra maiscula
        //juntar todos as palavras novamente eparando por espaço
        //pegar essa parte no git
        String texto1000 = "um texto com algumas palavras";
        String[] vetorDePalavras =  texto1000.split(" ");

        /*for(int i = 0; i < vetorDePalavras.length; i++){
            char onePlavara = String.valueOf((vetorDePalavras[i].charAt(0));

            String palavraSemPrimeiraLetra = vetorDePalavras[i]. substring(1);

        }*/

        //verificar quantas vogais tem em um texto


    }
}


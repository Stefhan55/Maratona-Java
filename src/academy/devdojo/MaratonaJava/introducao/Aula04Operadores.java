package academy.devdojo.MaratonaJava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // +- / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);
        // % verifirar o resultado da divisao
        int resto = 28 % 2;
        System.out.println(resto);

        // operadores logicos sempre retornam true ou false < > ,= => == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10< 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteQueDez = 10 != 10;

        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteQueDez);
        // Operadores Logicos
        // && (And)
        // || (or)
        // logical note (!)
        int idade = 27;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 4612;
        System.out.println("isDentroDaLeiMaiorQueTrinta"+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta"+ isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation =7000f;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println(" isPlayStationCincoCompravel "+ isPlayStationCincoCompravel);

        //Operadores de Atribuição =, += -=, *=, /= %=

        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2;  //
        bonus /= 2; //
        bonus %= 2; //
        System.out.println(bonus);
        // ++ --
        int contador = 0;
        contador+= 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2= 0;

        System.out.println(contador2++);
        System.out.println(contador2);
    }
}

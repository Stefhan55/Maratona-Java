package academy.devdojo.MaratonaJava.introducao;

public class AulaEstruturasCondicionais03 {
    public static void main(String[] args) {
        double Salary = 5000;
        String mensagemDonate = "Eu vou doar 500 reais para o Devdojo";
        String mensagemNoDonate = "Ainda nao tenho condiçoes, mas vou ter!";
        String resultado = Salary > 5000 ? mensagemNoDonate : mensagemDonate;
        // OPERADOR TERNARIO
        System.out.println(resultado);
    }
}

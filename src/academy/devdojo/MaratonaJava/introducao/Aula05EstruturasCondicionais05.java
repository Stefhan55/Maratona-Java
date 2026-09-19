package academy.devdojo.MaratonaJava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        byte dia = 8;

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("escreva o numero de 1 a 7");
        }
        char sexo = 'j';
        switch (sexo){
            case 'm' :
                System.out.println("Homem");
                break;
            case 'f':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Insira um caractere valido");

        }
    }
}

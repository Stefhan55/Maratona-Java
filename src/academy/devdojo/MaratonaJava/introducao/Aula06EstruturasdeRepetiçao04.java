public class Aula06EstruturasdeRepetiçao04 {
    public static void main(String[] args) {
        // dado um valor de um carro descubra em quantas vezes ele pode ser parcelado
        // condiao valorParcela >= 1000
        double valorTotal = 30000;
        for (int parcela = 1; parcela<= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela< 1000){
                break;
            }
            System.out.println(" parcela" + parcela+ " R$ "+ valorParcela);



        }
    }
}

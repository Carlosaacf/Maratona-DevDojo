package academy.devdojo.maratonajava.introducao;

public class Aula07EstruturasDeRepeticao2 {

    public static void main(String[] args) {

        double valortotal = 30000;

        for (int parcela = 1; parcela <= valortotal; parcela++) {
            double valorParcela = valortotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
                System.out.println("parcela " + parcela + " R$ " + valorParcela);


        }


    }
}


package academy.devdojo;

public class Aula3 {


    public static void main(String[] args) {
        String nome = "Carlos Fonseca";
        String endereço = "Rua pinto junior";
        int salario = 1100;
        String dataRecebimento = "20/12/2021";
        String relatorio = "Eu " + nome + " Estou morando no endereço " + endereço + " confirmo que recebi o salario de " + salario + " na data de " + dataRecebimento;
        System.out.println(relatorio);
        if (salario < 1400) {
            System.out.println(" Precisa estudar mais ");
        } else {
            System.out.println(" Ta suave ");
        }

    }
}
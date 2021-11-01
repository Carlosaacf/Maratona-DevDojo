package academy.devdojo.maratonajava.introducao;

public class Aula5part1 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida != false) {
            System.out.println("Autorizado a comprar bebida alcolica");
        } else {
            System.out.println("Não Autorizado a comprar bebida alcolica");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não Autorizado a comprar bebida alcolica");
        }
    }
}





package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06 {

    public static void main(String[] args) {

        int count = 0;


        do {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite o numero desejado");

            count = entrada.nextInt();
        }

        while (count <= 10);


    }
}


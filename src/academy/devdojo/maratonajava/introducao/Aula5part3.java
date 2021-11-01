package academy.devdojo.maratonajava.introducao;

public class Aula5part3 {
    public static void main(String[] args) {
        double salario = 4500;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        String resultado;

        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}


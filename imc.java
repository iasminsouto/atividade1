package IMC;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = lerTeclado.nextLine();

        System.out.println("Digite seu gênero: ");
        String genero = lerTeclado.nextLine();
        char generoChar = genero.charAt(0);

        System.out.println("Digite sua altura: ");
        float altura = lerTeclado.nextFloat();

        System.out.println("Digite seu peso: ");
        int peso = lerTeclado.nextInt();
        lerTeclado.close();

        float imc = (float) (peso / Math.pow(altura, 2));

        String classificacao = "";

        if (genero.equals("M")){
            if (imc < 20){
                classificacao = "Abaixo do normal";
            } else if (imc >= 20 && imc <= 24.9){
                classificacao = "normal";
            } else if (imc >= 25 && imc <= 29.9){
                classificacao = "Obesidade Leve";
            } else if (imc >= 30 && imc <= 39.9){
                classificacao = "Obesidade Moderada";
            } else {
                classificacao = "Obesidade Mórbida";
            }
        } else {
            if (imc < 19){
                classificacao = "Abaixo do normal";
            } else if (imc >= 19 && imc <= 23.9){
                classificacao = "normal";
            } else if (imc >= 24 && imc <= 28.9){
                classificacao = "Obesidade Leve";
            } else if (imc >= 29 && imc <= 38.9){
                classificacao = "Obesidade Moderada";
            } else {
                classificacao = "Obesidade Mórbida";
            }
        }

        String textBlock = """
                RESULTADO:
                    --- Nome: %S
                    --- Gênero: %s
                    --- Altura: %.2f
                    --- Peso: %d
                    --- IMC: %.2f
                    --- Classificação: %s
                """ .formatted(nome, generoChar, altura, peso, imc, classificacao);

        System.out.println(textBlock);
    }
}

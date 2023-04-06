import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //variaveis 
        float comprimento, largura, resultado;
        Scanner teclado = new Scanner(System.in);

        //entrada 
        System.out.print("Digite o comprimento:\t");
        comprimento = teclado.nextFloat();

        System.out.print("Digite a largura:\t");
        largura = teclado.nextFloat();

        //processamento
        resultado = comprimento * largura;

        //saída
        System.out.printf("A = %.2f", resultado);
    }
}

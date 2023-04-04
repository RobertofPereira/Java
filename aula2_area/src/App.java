import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //varáveis 
        float raio, area; 
        Scanner teclado = new Scanner(System.in);
        
        //Entrada
        System.out.print("Digite o raio:\t");
        raio = teclado.nextFloat();

        //processamento
        area = (float) Math.PI * raio * raio;

        //Saida
    System.out.printf("A = %.4f",area);

    }
}

import java.util.Scanner;

public class perimetro {
    public static void main(String[] args) throws Exception {
        float raio, perimetro;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o raio:\t");
        raio = teclado.nextFloat();

        perimetro = (float) Math.PI * 2 * raio;
        
        System.out.printf("P = %.1f", perimetro);
    }
}

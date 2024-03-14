// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    calculadora calc = new calculadora();
    int n1;
    int n2;

    System.out.println("Digite o primeiro número: ");
    n1 = ler.nextInt();
    System.out.print("Insira o segundo numero: ");
    n2 = ler.nextInt();
    calc.soma(n1, n2);

  }
}
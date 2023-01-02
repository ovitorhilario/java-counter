import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("digite o primeiro numero");
        int num1 = reader.nextInt();
        System.out.println("digite o segundo numero");
        int num2 = reader.nextInt();
        reader.close();

        try {
            validateEntry(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro numero nao pode ser maior que o segundo!"); 
        }
        
    }

    public static void validateEntry(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2) throw new ParametrosInvalidosException();
        
        int count = num2 - num1;
        
        for (int i = 0; i < count; i++) {
            int counter = i + 1;
            System.out.println("imprimindo o numero: " + counter);
        }
    }
}

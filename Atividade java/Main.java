/* 
 * Classe responsável por executar o programa de calculadora.
 * 
 * @Autor: Gabriel Antunes Cunha e Luiz Felipe.
 */
import java.util.Scanner;
import strategies.Addition;
import strategies.Subtraction;
import strategies.Multiplication;
import strategies.Division;

public class Main {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.print("Digite a operação desejada (+, -, *, /): ");
            String operacao = scanner.next();

            Calculator calculadora = new Calculator();

            switch (operacao) {
                case "+":
                    calculadora.setStrategy(new Addition());
                    break;
                case "-":
                    calculadora.setStrategy(new Subtraction());
                    break;
                case "*":
                    calculadora.setStrategy(new Multiplication());
                    break;
                case "/":
                    calculadora.setStrategy(new Division());
                    break;
                default:
                    System.out.println("Operação inválida.");
                    return;
            }

            try {
                double result = calculadora.executeStrategy(num1, num2);
                System.out.println("Resultado: " + result);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

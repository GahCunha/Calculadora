/* 
 * Classe que implementa a interface OperationStrategy para realizar a operação de divisão.
 * 
 * @Autor: Gabriel Antunes Cunha e Luiz Felipe.
 */
package strategies;

public class Division implements OperationStrategy {
    public double execute(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return num1 / num2;
    }
}

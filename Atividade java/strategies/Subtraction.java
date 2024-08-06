/* 
 * Classe que implementa a interface OperationStrategy e realiza a operação de subtração
 * 
 * @Autor: Gabriel Antunes Cunha e Luiz Felipe.
 */
package strategies;

public class Subtraction implements OperationStrategy {
    public double execute(double num1, double num2) {
        return num1 - num2;
    }
}

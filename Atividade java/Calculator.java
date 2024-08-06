/* 
 * Classe que representa a calculadora, que recebe uma estratégia de operação e executa a operação com os números passados.
 * 
 * @Autor: Gabriel Antunes Cunha e Luiz Felipe.
 */
import strategies.OperationStrategy;

public class Calculator {
    private OperationStrategy strategy;

    public void setStrategy(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double num1, double num2) {
        return strategy.execute(num1, num2);
    }
}

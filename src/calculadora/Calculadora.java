package calculadora;

/**
 * Classe responsável por realizar operações matemáticas básicas
 * incluindo soma, subtração, multiplicação e divisão.
 * 
 * @author Enzo Koga
 * @version 2.0
 */
public class Calculadora {
    /**
     * Executa uma operação matemática com base no operador informado.
     * 
     * As operações disponíveis são:
     * Soma: +
     * Subtração: -
     * Multiplicação: *
     * Divisão: /
     * 
     * Caso seja informada uma divisão por zero, o método apresenta
     * uma mensagem de erro e retorna Double.NaN.
     * Para operadores inválidos, apresenta uma mensagem de erro
     * e retorna o valor inicial de resultado (0).
     *  
     * @param a primeiro número utilizado na operação matemática
     * @param b segundo número utilizado na operação matemática
     * @param op operador matemático que determina a operação desejada
     * @return resultado da operação matemática ou Double.NaN em caso
     * de divisão por zero
     */
    public double calc(double a, double b, String op) {
        switch (op) {
            case ("+"): //Caso de soma
                return a + b;

            case ("-"): //Caso de subtração
                return a - b;

            case ("*"): //Caso de multiplicação
                return a * b;

            case ("/"): //Caso de divisão
                return dividir(a, b);            

            default:
                System.out.println("Operação inválida"); //Caso de nenhum caso acima
                return 0;
        }
    }

    /**
     * Realiza a divisão entre dois números.
     * 
     * @param a dividendo
     * @param b divisor
     * @return resultado da divisão ou Double.NaN se o divisor for zero
     */

    private double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("impossível dividir por zero");
            return Double.NaN;
        }

        return a / b;
    }
}

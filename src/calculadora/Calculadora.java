package calculadora;

/**
 * Classe responsável por realizar operações matemáticas básicas
 * incluindo soma, subtração, multiplicação e divisão.
 * 
 * @author Enzo Koga
 * @version 1.0
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
        double result = 0;
        switch (op) {
            case ("+"): //Caso de soma
                result = a + b;
                break;
            case ("-"): //Caso de subtração
                result = a - b;
                break;
            case ("*"): //Caso de multiplicação
                result = a * b;
                break;
            case ("/"): //Caso de divisão
                if (b == 0) { //Verifica se o segundo número é zero
                    System.out.println("impossível divisão por zero"); //Se for zero, retorna a mensagem
                    return Double.NaN;//Retorna um NaN (Not a Number)
                } else {
                    result = a / b;
                }
                break;
            default:
                System.out.println("Operação inválida"); //Caso de nenhum caso acima
                break;
        }
        return result;
    }
}

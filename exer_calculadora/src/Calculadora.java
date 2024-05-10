public class Calculadora {

    public int num1, num2, resultado;

    public Calculadora() {

    }

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void somar() {
        resultado = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + resultado);
    }

    public void subtrair() {
        resultado = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + resultado);
    }

    public void multiplicar() {
        resultado = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + resultado);
    }

    public void dividir() {
        //f) Ao dividir um número por zero, o programa acusa um erro, já que é matematicamente impossível dividir qualquer número por zero.
        //Para contornar este problema, foi usado a estrutura condicional if.

        if (num2 == 0) {
            System.out.println("É impossível dividir qualquer número por zero (0).");
        } else {
            resultado = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + resultado);
        }

    }
}

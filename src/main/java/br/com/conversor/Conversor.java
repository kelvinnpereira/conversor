package br.com.conversor;

public class Conversor{

    public static double celsiusFahrenheit(double temperatura){
        return (1.8 * temperatura) + 32.0;
    }

    public static double fahrenheitCelsius(double temperatura){
        return (temperatura - 32.0) / 1.8;
    }

    public static double converter(double temperatura, char escalaAtual, char escalaConverter) {
        try {
            if (escalaAtual == 'c' && escalaConverter == 'f') {
                return celsiusFahrenheit(temperatura);
            } else if (escalaAtual == 'f' && escalaConverter == 'c') {
                return fahrenheitCelsius(temperatura);
            } else {
                throw new Exception("Não é possivel converter as escalas solicitadas");
            }
        } catch (Exception error) {
            System.out.println(error);
            return 0.0;
        }
    }
}

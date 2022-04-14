package br.com.conversor;

public class Main {
    public static void main(String args[]) {
        double temp = Conversor.converter(102.0, 'c', 'f');
        System.out.println(temp);
    }
}

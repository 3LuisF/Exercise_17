package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        System.out.println("ingrese el radio del circulo");
        Scanner str_Radio = new Scanner(System.in);
        double Radio = str_Radio.nextDouble();
        double Area_C = Math.PI*Math.pow(Radio, 2);
        double Long_C = Math.PI*Radio*2;
        System.out.println("El area del circulo es: "+Area_C);
        System.out.println("La longitud de la circunferencia es:"+Long_C);
    }
    
}

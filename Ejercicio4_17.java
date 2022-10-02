//Ejercicio 4.17
//calcular rendimiento.

import java.util.Scanner;

public class Ejercicio4_17{
    public static void main(String[] args) {
        int km = 0;
        int lt = 0;
        double rendimiento = 0;
        double total = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        char centinela = 's';
        
        while(centinela == 's'){
            System.out.println("Ingrese los kilometros recorridos en este viaje: ");
            km = entrada.nextInt();
            System.out.println("Ingrese los litros usados en este viaje: ");
            lt = entrada.nextInt();
            
            rendimiento = (double)km / lt;
            
            total += rendimiento;
            
            System.out.println("El rendimiento en este viaje fue de: " + rendimiento + "km/lt");
            System.out.println("¿Desea ingresar otro viaje? s/n");
            centinela = entrada.next().charAt(0);
            
        }
        
        System.out.println("El total del rendimiento en todos los viajes fue de: " + total + "km/lt");
        entrada.close();
    }
}
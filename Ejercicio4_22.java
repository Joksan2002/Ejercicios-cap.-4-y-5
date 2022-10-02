//Ejercicio 4.22

//Escriba una aplicación en Java que utilice ciclos para imprimir la siguiente tabla de valores:

//  N 10*N 100*N 1000*N
//  1 10 100 1000
//  2 20 200 2000
//  3 30 300 3000
//  4 40 400 4000
//  5 50 500 5000

public class Ejercicio4_22 {

    public static void main(String[] args) {
        int contador = 1;
        
        System.out.println("N   10*N    100*N   1000*N");
        
        while(contador <=5){
            System.out.printf("%d     %d      %d     %d%n", contador, contador*10, contador*100, contador*1000);
            contador++;
        }
    }
    
}

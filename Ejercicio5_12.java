//Ejercicio 5.12

public class Ejercicio5_12 {
    
    public static void main(String[] args) {
		
		System.out.println("Programa que calcula el producto de los enteros impares del 1 al 15");
		
		int producto = 1;
		
		for(int i = 1; i <= 15; i++) {
			
			if(i % 2 != 0) {
				System.out.printf("%d es impar%n", i);
				producto *= i;
			}
			
		}
		
		System.out.printf("El producto de los enteros impares del 1 al 15 es: %,d", producto);
		
	}
    
}

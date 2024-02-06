import java.util.InputMismatchException;
import java.util.Scanner;

/**q****
 *
 * @author mar_l
 * 
 */
public class matrizA {
    
    public static void main(String args[]){ 
        
        int matriz[][];
        int filas = 0 , columnas = 0;
        int vertice = 0;
        
        Scanner sc = new Scanner(System.in);
        try {
        System.out.print("Ingresar numero de filas: ");
        filas = sc.nextInt();
        System.out.print("Ingresar numero de columnas: ");
        columnas = sc.nextInt();
        
        
        matriz = new int [filas][columnas];
        
        System.out.println("Ingrese la matriz: ");
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(" [" +i+ "] [" +j+ "] : " );
                matriz[i][j] = sc.nextInt();
            }
        }
        
        
        
        System.out.println("Ingrese '1' si hay adyacencia y '0' si no la hay! ");
        
            for (int i = 0; i < matriz.length ; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("Existe adyacencia en la matriz en la posicion [ "+ i + " ] " + " [ " +j+ "]: ");
                    vertice = sc.nextInt();
                }
                
            }
        
        
        
        System.out.println("Mostrar la matriz: ");
        for (int i = 0; i < matriz.length; i++) { //length nos permite recuperar el tamaño de la matriz
            for (int j = 0; j < matriz[i].length; j++) {
                 System.out.print(" ["+matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        } catch (InputMismatchException  e) {
            System.out.println("Debe ingresar solo numeros enteros!!!");
        }
        
        
        System.out.println("Mostrar la adyacencia de la matriz: ");
        for (int e = 0; e < vertice ; e++) {
            for (int f = 0; f < vertice; f++) {
                System.out.print(" ["+vertice+ "] ");
                System.out.println("");
            }
        }
        
        
        
    }
    
}

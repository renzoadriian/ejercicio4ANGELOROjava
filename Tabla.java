
package ejercicio4;
import java.util.Scanner;
public class Tabla {
	    private int n;
	    private Scanner teclado;
	    public void calculo() {
	        teclado = new Scanner(System.in);
	        System.out.print("Introduce un número entero:(numero 5) ");
	        n = teclado.nextInt();
	        System.out.println("Tabla del " + n);
	        for(int i = 1; i<=10; i++){
	             System.out.println(n + " * " + i + " = " + n*i);
	        }
	    }
	        public static void main(String[]ar){
	    	Tabla tabla1;
	    	tabla1=new Tabla();
	    	tabla1.calculo();
	        }
	    }
	    



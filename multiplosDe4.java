import java.util.Scanner;

public class multiplosDe4{
	public static void main(String[] args) {
		int multiplo = 4;
		int n;
		
		//se captura n
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese n: ");
		n = sc.nextInt();
		
        System.out.print("Los multiplos de " + multiplo + " hasta " + n + " son");
        for (int i = 1; i <= n; i++){
            //cuando sea multiplo la funcion esMultiplo devuelve un true y entonces se imprime i
        	if (esMultiplo(i,multiplo)){
        		System.out.print(" " + i );
        	}
        }
	}
	
	public static boolean esMultiplo(int n1, int n2){
    	if (n1%n2==0){
    		return true;
    	}else{
    		return false;
        }
    }
}
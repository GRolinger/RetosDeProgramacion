import java.io.File;
import java.util.Scanner;

public class PrimosYPares{

	public static void main(String[] args) {
	    
	    try {
            Scanner input = new Scanner(new File("Learn.txt"));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] numero = line.split(",");
                int[] valores = new int[numero.length];
           
                int sumaPares = 0;
                int sumaPrimos = 0;
                int cantidadesPrimos = 0;
                for(int i = 0; i< valores.length; i++){
                   valores[i] = Integer.parseInt(numero[i]);
                   if(valores[i]%2 ==0){
                       sumaPares = sumaPares + valores[i];
                   }
                   for(int j = 1; j <= valores[i]; j++){
                       if(valores[i] % j == 0){
                           cantidadesPrimos++;
                       }
                   }
                   if(cantidadesPrimos == 2){
                       sumaPrimos = sumaPrimos + valores[i];
                   }
                   cantidadesPrimos = 0;
                   
                }
                System.out.println("La suma de los pares: " + sumaPares);
                System.out.println("La suma de los primos: " + sumaPrimos);
                
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
	}
}

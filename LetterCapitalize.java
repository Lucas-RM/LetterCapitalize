import java.util.Scanner;
import java.io.IOException;

public class LetterCapitalize {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner (System.in);
		String str;
		
		try {
			System.out.print("Digite uma frase: ");
			str = input.nextLine();
		
			System.out.println(LetterCapitalize(str));
		}catch (Exception erro){
			System.out.println("\nValor Inválido\nErro: "+erro.toString());
		}
	}
	
	public static String LetterCapitalize (String frase) {		
		String novaFrase = "";
	    String arr[] = frase.split(" ");
	    
	    for(String letra : arr){
	        novaFrase += letra.substring(0,1).toUpperCase() + letra.substring(1) + " ";
	    }	    
	    return novaFrase;
	}
}

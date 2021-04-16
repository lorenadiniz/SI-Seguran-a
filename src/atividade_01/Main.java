package atividade_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static String encriptar(String textoOriginal, int chave) {
	    String textoCifrado = "";
	 
	    for (int i = 0; i < textoOriginal.length(); i++) {
	        textoCifrado += encriptar(textoOriginal.charAt(i), chave);
	    }
	 
	    return textoCifrado;
	}
	 
	public static char encriptar(char charOriginal, int chave) {
	    char charCifrado;
	 
	    if (charOriginal >= 97 && charOriginal <= 122) {
	        charCifrado = (char) ((charOriginal - 97 + chave) % 26 + 97);
	    }
	    else if (charOriginal >= 65 && charOriginal <= 90) {
	        charCifrado = (char) ((charOriginal - 65 + chave) % 26 + 65);
	    }
	    else {
	        charCifrado = charOriginal;
	    }
	 
	    return charCifrado;
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		String env;
		System.out.print("\nDigite a mensagem: ");
		env = teclado.readLine();
		
		String chave;
		System.out.print("\nDigite a chave: ");
		chave = teclado.readLine();

		System.out.println(encriptar(env, Integer.parseInt(chave)));
	}
	
}

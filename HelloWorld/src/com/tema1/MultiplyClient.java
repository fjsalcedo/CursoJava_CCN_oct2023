package com.tema1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.net.Socket;

public class MultiplyClient {

	public static void main(String[] args) {
		
		String serverIP = "127.0.0.1";
		int serverPort = 12345;
		
		//Utilizamos un bloque try-catch con un try-with-resources
		//en el que creamos los cuatro objetos que permitirán
		//leer y escribir el flujo de datos en el servidor y el cliente
		
		try (
			//Creamos los objetos en el try-with-resources
				
			//Abrimos el Socket del cliente
				Socket socket = new Socket(serverIP, serverPort);
			
			//Creamos el stream de salida
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				
			//Creamos el stream de entrada
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
			//Leemos la entrada del usuario
				Scanner userIn = new Scanner(System.in);
			)
		
		{
			//Vamos a crear un bucle while que mantendrá a la espera el cliente
			//de la entrada por parte del usuario
			boolean terminar = false;
			
			while (!terminar) {
				//Pedimos la entrada al usuario
				System.out.println("Introduzca un número (o exit para terminar): ");
				
				//Guardamos la entrada del usuario en un objeto String que, luego, el servidor convertirá a Long
				//para multiplicar
				String userInput = userIn.nextLine();
				
				if ("exit".equals(userInput)) {
					terminar = true;
				} else {
					//Enviamos el número al servidor
					out.println(userInput);
					//Asimismo, leemos la respuesta de entrada desde el servidor y la imprimimos
					System.out.println("Respuesta del servidor: " + in.readLine());
				}
			}
			
		} catch (IOException e) {
			//Capturamos la excepción de E/S
			System.out.println("Se ha producido un error: " + e.getMessage());
		}

	}

}

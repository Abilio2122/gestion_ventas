package gestion_ventas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class gestion_ventas {

	public static void main(String[] args)throws IOException {
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("------------------------------");
		System.out.println("|      EventSales Pro        |");
		System.out.println("------------------------------");
		
		System.out.println("Iniciar sesion");
		System.out.println("");
		System.out.println("Nombre");
		String name = lector.readLine();
		System.out.println("");
		System.out.println("Edad");
		int age = Integer.parseInt(lector.readLine());
		System.out.println("");
		System.out.println("Rut");
		String i_d = lector.readLine();
		System.out.println("");
		System.out.println("Contraseña");
		String contra = lector.readLine();
		System.out.println("");
		
		Cliente cliente = new Cliente(i_d);

		while(true) {
			System.out.println("------------------------------");
			System.out.println("|    Seleccione una opcion   |");
			System.out.println("------------------------------");
			
			System.out.println("- Ver Perfil (1)");
			System.out.println("- Ver Eventos Disponibles (2)");
			System.out.println("- Ver Recomendaciones (3)");
			System.out.println("- Ver Regiones (4)");
			System.out.println("- Cerrar Sesion (5)");
			int opc = Integer.parseInt(lector.readLine());
			
			switch(opc) {
				case 1:
					System.out.println("------------------------------");
					System.out.println("|           Perfil           |");
					System.out.println("------------------------------");
						
					System.out.println("<"+name+">");
					System.out.println("<"+age+">");
					System.out.println("<"+i_d+">");
					//Historial de compra
					break;
					
				case 2:
					System.out.println("------------------------------");
					System.out.println("|           Eventos          |");
					System.out.println("------------------------------");
					//
					break;
					
				case 3:
					System.out.println("------------------------------");
					System.out.println("|        Recomendaciones     |");
					System.out.println("------------------------------");
					System.out.println("Segun tu edad, estos son los eventos qeu te recomendamos");
					//Deaspues hacemos lo de los rango de edad para las recomendaciones
					break;
					
				case 4:
					System.out.println("------------------------------");
					System.out.println("|           Regiones         |");
					System.out.println("------------------------------");
					
					System.out.println("Ingrese la region en la que desea buscar eventos");
					String reg = lector.readLine();
					break;
					
				case 5:
					System.out.println("------------------------------");
					System.out.println("|            Adios           |");
					System.out.println("------------------------------");
					System.out.println("");
					System.out.println("Muchas Gracias Por Preferirnos");
					System.out.println("------------------------------");
					return;
					
				default:
					System.out.println("Ingrese una opcion valida");
					break;
			}
		}
	}
}

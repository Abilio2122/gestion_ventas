package gestion_ventas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.*;


public class gestion_ventas {
    

    public static void verPerfil(Cliente cliente) {
        System.out.println("------------------------------");
        System.out.println("|           Perfil           |");
        System.out.println("------------------------------");
        
        if (cliente != null) {
            // Cliente encontrado, puedes trabajar con él
            System.out.println("Cliente encontrado:");
            System.out.println(cliente.mostrarPerfil());
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
   
    
    public static void main(String[] args)throws IOException, excepcionPersonalizada {
    	Admin admin = new Admin("2122", "C:\\Users\\sebas\\git\\gestion_ventas\\Eventos.csv"); // Cambia la contraseña y la ruta del archivo CSV según tus necesidades
        gestionEventos gestionEventos = new gestionEventos();
        gestionCliente gestionCliente = new gestionCliente();
        gestionEventos.importarEventosDesdeCSV("D:\\sebas\\Documentos\\NetBeansProjects\\gestion_ventas\\Eventos.csv");//aqui hay que poner la ruta en la que tengan el archivo csv
        gestionPago gestionPago = new gestionPago();
        Recomendacion recomendador = new Recomendacion();
        
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        
        
        gestionEventos.agregarEvento(new Eventos("2345", "One piece", "31 de agosto", "Viña del Mar", 1, "1-90"));

         
        Cliente clienteActual = null; // Variable para el cliente logueado
        boolean salir = false;

  
        while(!salir) {      
            
            int opc2;

            if (clienteActual == null) {
                
                System.out.println("------------------------------");
                System.out.println("|      EventSales Pro        |");
                System.out.println("------------------------------");
                
                System.out.println("- Registrarse (1)");
                System.out.println("- Salir (2)");
                opc2 = Integer.parseInt(lector.readLine());

                switch (opc2) {
                    case 1:
                        clienteActual = Cliente.registrar();
                        Cliente clienteExistente = gestionCliente.buscarClientePorRut(clienteActual.getRut());

                        if (clienteExistente != null) {
                            clienteActual = clienteExistente;
                            System.out.println("Has Iniciado sesión, bienvenido.");
                        } else {
                            gestionCliente.agregarCliente(clienteActual);
                            System.out.println("Registrado con éxito.");
                        }
                        break;
                    case 2:
                        System.out.println("------------------------------");
                        System.out.println("|            Adios           |");
                        System.out.println("------------------------------");
                        System.out.println("");
                        System.out.println("Muchas Gracias Por Preferirnos");
                        System.out.println("------------------------------");
                        salir = true;
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;
                }
            } else {

                System.out.println("------------------------------");
                System.out.println("|    Seleccione una opcion   |");
                System.out.println("------------------------------");

                System.out.println("- Ver Perfil (1)");
                System.out.println("- Ver Eventos Disponibles (2)");
                System.out.println("- Ver Recomendaciones (3)");
                System.out.println("- Ver Regiones (4)");
                System.out.println("- (Admin)-Agregar Evento(5)");
                System.out.println("- (Admin)-Listar(6)");
                System.out.println("- Cerrar Sesion (7)");


                opc2 = Integer.parseInt(lector.readLine());
            
                switch (opc2) {

                    case 1:
                        verPerfil(clienteActual);
                        break;

                    case 2:
                        System.out.println("------------------------------");
                        System.out.println("|           Eventos          |");
                        System.out.println("------------------------------");
                        gestionEventos.listarEventos();
                        System.out.println("");

                        System.out.println("Ingrese la Id del evento al que desea asistir");
                        String i_d = lector.readLine();
                        Eventos encontrado = gestionEventos.buscarEventoPorID(i_d);
                        if (encontrado != null) {
                            System.out.println("");
                            System.out.println("Evento encontrado:");
                            System.out.println(encontrado.mostrarEventos());

                            //aqui trabajo con limite de entradas por evento
                            if (encontrado.verificarLimiteEntradaEvento()) {
                                System.out.println("Cupos suficientes para compra:");
                                System.out.println("Quieres comprar?");
                                System.out.println("<1> Si    <2> No ");

                                int opc3 = Integer.parseInt(lector.readLine());             ///Efectua el pago
                                switch (opc3) {
                                    case 1:
                                        System.out.println("Ingrese su Rut:");
                                        String idPago = lector.readLine();

                                        gestionPago.efectuarPago(idPago);

                                        int cantE = encontrado.getCantEntradasEvento();
                                        cantE--;
                                        encontrado.setCantEntradasEvento(cantE);

                                        System.out.println("Compra efectuada con éxito!!");
                                        System.out.println("");

                                        //almaceno al cliente su evento en historial compra
                                        Cliente cliente = (Cliente) gestionCliente.buscarClientePorRut(idPago);
                                        cliente.agregarCompra(encontrado.getNombreEvento());
                                        break;

                                    case 2:
                                        break;

                                }

                            } else {
                                System.out.println("Cupos insuficientes para compra:");
                            }

                        } else {
                            System.out.println("El id ingresado no existe");
                        }
                        break;

                    case 3:
                        System.out.println("------------------------------");
                        System.out.println("|        Recomendaciones     |");
                        System.out.println("------------------------------");
                        System.out.println("Segun tu edad, estos son los eventos que te recomendamos");
                        recomendador.recomendacion(clienteActual, gestionEventos);
                        break;

                    case 4:
                        System.out.println("------------------------------");
                        System.out.println("|           Regiones         |");
                        System.out.println("------------------------------");

                        System.out.println("Ingrese la region en la que desea buscar eventos");
                        String reg = lector.readLine();
                        ArrayList<Eventos> eventos;
                        eventos = (ArrayList<Eventos>) gestionEventos.obtenerEventosPorRegion(reg);
                        if (eventos.isEmpty()) {
                            System.out.println("No se encontraron eventos en la región: " + reg);
                        } else {
                            System.out.println("Eventos en la región " + reg + ":");
                            for (Eventos evento : eventos) {
                                System.out.println(evento.mostrarEventos());
                                System.out.println(); // Salto de línea entre eventos
                            }
                        }
                        break;

                    case 5:
                        // Solicitar la contraseña del administrador
                        System.out.println("Ingrese contraseña de admin:");
                        String contrasenaAdmin = lector.readLine();

                        // Verificar la contraseña del administrador
                        if (admin.verificarContrasena(contrasenaAdmin)) {
                            System.out.println("Ingrese el id del evento:");
                            String idEvento = lector.readLine();

                            System.out.println("Ingrese el nombre del evento:");
                            String nombreEvento = lector.readLine();

                            System.out.println("Ingrese la fecha del evento:");
                            String fechaEvento = lector.readLine();

                            System.out.println("Ingrese la región del evento:");
                            String regionEvento = lector.readLine();

                            System.out.println("Ingrese la cantidad de entradas que tendrá el evento:");
                            int cantidadEntrada = Integer.parseInt(lector.readLine());

                            System.out.println("Ingrese un rango etario (1-100)");
                            String rangoEtario = lector.readLine();

                            Eventos nuevoEvento = new Eventos(idEvento, nombreEvento, fechaEvento, regionEvento, cantidadEntrada, rangoEtario);
                            admin.agregarEvento(nuevoEvento);

                        } else {
                            // Contraseña incorrecta, mostrar un mensaje de error
                            System.out.println("Contraseña de administrador incorrecta. No tiene permiso para agregar eventos.");
                        }
                        break;
                    
                    case 6:
                        // Solicitar la contraseña del administrador
                        System.out.println("Ingrese contraseña de admin:");
                        String contrasenaAdmin2 = lector.readLine();

                        // Verificar la contraseña del administrador
                        if (admin.verificarContrasena(contrasenaAdmin2)) {
                            gestionCliente.listar();
                        }else{
                            // Contraseña incorrecta, mostrar un mensaje de error
                            System.out.println("Contraseña de administrador incorrecta. No tiene permiso para agregar eventos.");
                        }
                        break;

                        
                    case 7:
                        System.out.println("------------------------------");
                        System.out.println("|            Adios           |");
                        System.out.println("------------------------------");
                        System.out.println("");
                        System.out.println("Muchas Gracias Por Preferirnos");
                        System.out.println("------------------------------");
                        clienteActual = null; // Cerrar sesión
                        break;

                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;

                }
            }
            
        }
        
    }
    
}

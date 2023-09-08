package gestion_ventas;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author karth
 */
public class gestionCliente {
    
    private ArrayList<Cliente> listaCliente;
    
    public gestionCliente() {
    	listaCliente = new ArrayList<>();
    }
    
    // Método para agregar un cliente a la lista
    public void agregarCliente(Cliente cliente) {
        listaCliente.add(cliente);
    }

    // Método para buscar un cliente por su RUT  //hacer el agregar y buscar por Hashmap RECORDAR!!

    public void listar() {
    	for(Cliente cliente : listaCliente) {
    		System.out.println(cliente.mostrarPerfil());
    	}
    }
}

package gestion_ventas;

import java.util.ArrayList;

/**
 *
 * @author karth
 */
public class gestionCliente {
    
    private ArrayList<Cliente> listaCliente = new ArrayList<>();
    
    // Método para agregar un cliente a la lista
    public void agregarCliente(Cliente cliente) {
        listaCliente.add(cliente);
    }

    // Método para buscar un cliente por su RUT
    /*public Cliente buscarClientePorRut(String rut) {
        for (Cliente cliente : listaCliente) {
            if (cliente.getRut().equals(rut)) {
                return cliente; // Devuelve el cliente encontrado
            }
        }
        return null; // Cliente no encontrado
    }*/
    public void listar() {
    	for(Cliente cliente : listaCliente) {
    		System.out.println(cliente.mostrarPerfil());
    	}
    }
}

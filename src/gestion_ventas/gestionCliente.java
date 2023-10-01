package gestion_ventas;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author karth
 */
public class gestionCliente {
    private ArrayList<Cliente> listaCliente;
    private HashMap<String, Cliente> mapaClientesPorRut;

    public gestionCliente() {
    	listaCliente = new ArrayList<>();
    	mapaClientesPorRut = new HashMap<>();

    }
    
    // Método para agregar un cliente a la lista
    public void agregarCliente(Cliente cliente) {
        listaCliente.add(cliente);
        mapaClientesPorRut.put(cliente.getRut(), cliente);

    }

    public Cliente buscarClientePorRut(String rut) {
        return mapaClientesPorRut.get(rut);
    }
    
    public void listar() {
    	for(Cliente cliente : listaCliente) {
    		System.out.println(cliente.mostrarPerfil() + "\n\n");  
    	}
    }
    
}

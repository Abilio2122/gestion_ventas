    package Ventanas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerCsv extends JFrame {
    
	public VerCsv() {
        // Definir los títulos de las columnas
        String[] columnas = {"ID", "Nombre", "Fecha", "Región", "Entradas Disponibles", "Rango Etario"};

        // Crear un modelo de tabla con las columnas especificadas
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0); // 0 filas inicialmente

        // Crear la tabla con el modelo de datos
        JTable tabla = new JTable(modelo);

        // Agregar la tabla a un panel con barra de desplazamiento
        JScrollPane scrollPane = new JScrollPane(tabla);

        // Configurar el tamaño de la ventana
        setSize(800, 551);

        // Configurar la operación de cierre de la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Configurar la ubicación de la ventana (opcional)
        setLocationRelativeTo(null);

        // Crear un panel para los elementos de entrada
        JPanel inputPanel = new JPanel();
        
        // Agregar un campo de texto para ingresar la ID del evento
        JTextField idEventoTextField = new JTextField(10);

		inputPanel.add(new JLabel("Ingrese la ID del evento al que desea asistir:"));
        inputPanel.add(idEventoTextField);
        
        // Botón para ingresar
        JButton ingresarButton = new JButton("Ingresar");
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idEvento = idEventoTextField.getText();
                // Aquí puedes realizar acciones basadas en la ID del evento ingresada
                System.out.println("ID del evento ingresada: " + idEvento);
                // Puedes agregar lógica adicional aquí
            }
        });
        inputPanel.add(ingresarButton);

        // Configurar el gestor de diseño de la ventana (BorderLayout)
        setLayout(new BorderLayout());

        // Agregar el panel de tabla al centro de la ventana
        add(scrollPane, BorderLayout.CENTER);
        
        // Agregar el panel de entrada de texto en la parte inferior de la ventana
        add(inputPanel, BorderLayout.SOUTH);
    }

    // Otros métodos y lógica específica de VerCsv si es necesario
}
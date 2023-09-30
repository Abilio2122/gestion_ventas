package Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gestion_ventas.Cliente;
import gestion_ventas.gestionCliente;

public class MenuPrincipal extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private Cliente cliente;
    private gestionCliente gestionCliente;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MenuPrincipal frame = new MenuPrincipal(null, null);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public MenuPrincipal(Cliente cliente, gestionCliente gestionCliente) {
        this.cliente = cliente;
        this.gestionCliente = gestionCliente;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();

        // Cambia el LayoutManager a null para controlar la posición manualmente
        contentPane.setLayout(null);

        setContentPane(contentPane);

        JLabel lblNewLabel = new JLabel("EventSales Pro");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(168, 11, 111, 14);
        contentPane.add(lblNewLabel);

        JButton btnNewButton = new JButton("Salir");
        btnNewButton.setBounds(335, 227, 89, 23);
        contentPane.add(btnNewButton);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea salir de la aplicación?", "Salir",
                        JOptionPane.YES_NO_OPTION);
                if (confirmacion == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Muchas Gracias Por Preferirnos");
                    System.exit(0);
                }
            }
        });

        JButton btnNewButton_1 = new JButton("Ver Perfil");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (cliente != null && cliente.getNombre() != null && !cliente.getNombre().isEmpty()
                        && cliente.getRut() != null && !cliente.getRut().isEmpty() && cliente.getEdad() > 0) {
                    String mensaje = cliente.mostrarPerfil();
                    JOptionPane.showMessageDialog(null, mensaje, "Perfil del Cliente", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Los datos del cliente no se cargaron correctamente", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnNewButton_1.setBounds(10, 45, 89, 23);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Ver Eventos Disponibles");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VerCsv ventanaVerCsv = new VerCsv();
                ventanaVerCsv.setVisible(true);
            }
        });
        btnNewButton_2.setBounds(10, 79, 149, 23);
        contentPane.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Recomendaciones");
        btnNewButton_3.setBounds(10, 113, 132, 23);
        contentPane.add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("Ver Regiones");
        btnNewButton_4.setBounds(10, 147, 105, 23);
        contentPane.add(btnNewButton_4);

        JButton btnNewButton_5 = new JButton("Admin");
        btnNewButton_5.setBounds(10, 181, 89, 23);
        contentPane.add(btnNewButton_5);
    }
}

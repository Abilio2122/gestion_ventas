/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package Ventanas;
import java.awt.event.ActionEvent;
import java.io.IOException;

import gestion_ventas.*;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Font;

/**
 *
 * @author karth
 */
public class MenuRegistrarse extends javax.swing.JFrame {
	gestionCliente gestionCliente = new gestionCliente();
    /**
     * Creates new form MenuRegistrarse
     */
    public MenuRegistrarse() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registrarse = new javax.swing.JButton();
        Registrarse.setText("Registrarse");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton1ActionPerformed(evt,txtNombre,txtEdad,txtRut,passwordField);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
        txtNombre = new JTextField();
        txtNombre.setColumns(10);
        
        txtEdad = new JTextField();
        txtEdad.setColumns(10);
        
        txtRut = new JTextField();
        txtRut.setHorizontalAlignment(SwingConstants.LEFT);
        txtRut.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Nombre:");
        
        JLabel lblNewLabel_1 = new JLabel("Edad:");
        
        JLabel lblNewLabel_2 = new JLabel("Rut:");
        
        JLabel lblNewLabel_3 = new JLabel("Contraseña:");
        
        passwordField = new JPasswordField();
        
        lblNewLabel_4 = new JLabel("EventSales Pro");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(286, Short.MAX_VALUE)
        			.addComponent(Registrarse)
        			.addGap(32))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(30)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(lblNewLabel_3)
        					.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
        					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(lblNewLabel_1)
        					.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
        					.addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(lblNewLabel)
        					.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
        					.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(lblNewLabel_2)
        					.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
        					.addComponent(txtRut, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(217, GroupLayout.PREFERRED_SIZE))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(175)
        			.addComponent(lblNewLabel_4)
        			.addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblNewLabel_4)
        			.addGap(31)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblNewLabel))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblNewLabel_1))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtRut, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblNewLabel_2))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblNewLabel_3))
        			.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
        			.addComponent(Registrarse)
        			.addGap(39))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt, JTextField txtNombre,JTextField txtEdad, JTextField txtRut, JPasswordField passwordField)throws IOException {//GEN-FIRST:event_jButton1ActionPerformed
    	String nombre = txtNombre.getText();
        String rut = txtRut.getText();
        char[] password = passwordField.getPassword(); // Obtén la contraseña como arreglo de caracteres
        int edad;

        try {
            edad = Integer.parseInt(txtEdad.getText());
        } catch (NumberFormatException e) {
            // Maneja la excepción en caso de que la edad no sea un número válido
            JOptionPane.showMessageDialog(this, "Edad no válida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validación de la contraseña utilizando la excepción contrasenaInvalida
        try {
            validarContraseña(password);
        } catch (contrasenaInvalida e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Cliente cliente = new Cliente(rut, nombre, new String(password), edad);

        gestionCliente.agregarCliente(cliente);
        String mensaje = "Cliente agregado:\n" +
                "Nombre: " + cliente.getNombre() + "\n" +
                "RUT: " + cliente.getRut() + "\n" +
                "Edad: " + cliente.getEdad();
        JOptionPane.showMessageDialog(null, mensaje, "Cliente Agregado", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void validarContraseña(char[] contraseña) throws contrasenaInvalida {
        if (contraseña.length < 2) {
            throw new contrasenaInvalida("La contraseña ingresada no es válida: Longitud insuficiente");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRegistrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrarse;
    private final Action action = new SwingAction();
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtRut;
    private JPasswordField passwordField;
    private JLabel lblNewLabel_4;
    // End of variables declaration//GEN-END:variables

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}

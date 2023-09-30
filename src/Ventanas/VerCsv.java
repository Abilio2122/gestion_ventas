package Ventanas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerCsv extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VerCsv frame = new VerCsv();
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
    public VerCsv() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 500); // 
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null); // 

        
        String[] columnNames = {"ID", "Nombre", "Fecha", "Región", "Entradas Disponibles", "Rango Etario"};

      
        Object[][] data = new Object[20][6];

       
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 10, 760, 340); 
        contentPane.add(scrollPane);

        
        JLabel lblMensaje = new JLabel("Ingrese la ID del evento al que desea asistir:");
        lblMensaje.setBounds(10, 360, 300, 20);
        contentPane.add(lblMensaje);

        
        textField = new JTextField();
        textField.setBounds(310, 360, 100, 20);
        contentPane.add(textField);

        
        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBounds(420, 360, 100, 20);
        contentPane.add(btnConfirmar);

        
        btnConfirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                String idIngresada = textField.getText();
                
            }
        });

       
        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(530, 360, 100, 20);
        contentPane.add(btnVolver);

        
        btnVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                dispose();
            }
        });
    }
}

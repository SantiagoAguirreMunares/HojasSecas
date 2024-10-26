/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frontend;

/**
 *
 * @author santi
 */
import Backend.Empleado;
import Backend.Persona;
import Backend.Propietario;
import Controlador.Control;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JTextField idField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private Control controlador;

    public LoginFrame(Control controlador) {
        this.controlador = controlador;

        setTitle("Login Conjunto Residencial");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);

        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("ID:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        idField = new JTextField(20);
        idField.setBounds(100, 20, 165, 25);
        panel.add(idField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 50, 165, 25);
        panel.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        String id = idField.getText();
        String password = new String(passwordField.getPassword());

        if (!id.matches("\\d+")) { 
            JOptionPane.showMessageDialog(null, "El ID debe contener solo números.");
            return;
        }
        Persona usuario = controlador.login(id, password);
        if (usuario != null) {
            if (usuario instanceof Empleado) {
                new EmpleadoFrame((Empleado) usuario, controlador);
            } else if (usuario instanceof Propietario) {
                new PropietarioFrame((Propietario) usuario, controlador);
            }
            dispose(); 
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
        }
    }
});
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frontend;

import Backend.Empleado;
import Backend.Propietario;
import Controlador.Control;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author santi
 */
public class EmpleadoFrame extends JFrame {
    private Empleado empleado;
    private Control controlador;

    public EmpleadoFrame(Empleado empleado, Control controlador) {
        this.empleado = empleado;
        this.controlador = controlador;

        setTitle("Menú de Empleado");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);

        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JButton consultarPropietarioBtn = new JButton("Consultar Propietario");
        consultarPropietarioBtn.setBounds(50, 30, 200, 25);
        panel.add(consultarPropietarioBtn);

        JButton facturacionBtn = new JButton("Facturar Costos");
        facturacionBtn.setBounds(50, 60, 200, 25);
        panel.add(facturacionBtn);

        JButton multaBtn = new JButton("Multar Propietario");
        multaBtn.setBounds(50, 90, 200, 25);
        panel.add(multaBtn);

        consultarPropietarioBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idPropietario = JOptionPane.showInputDialog("Ingrese ID del Propietario:");
                Propietario propietario = controlador.buscarPropietario(idPropietario);
                if (propietario != null) {
                    JOptionPane.showMessageDialog(null, "Propietario encontrado: " + propietario.getNombre());
                } else {
                    JOptionPane.showMessageDialog(null, "Propietario no encontrado.");
                }
            }
        });

        // Puedes implementar acciones similares para los otros botones
    }
}


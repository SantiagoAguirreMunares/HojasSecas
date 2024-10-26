/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frontend;
import Backend.Factura;
import Backend.Propietario;
import Controlador.Control;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
/**
 *
 * @author santi
 */
public class PropietarioFrame extends JFrame {
    private Propietario propietario;
    private Control controlador;

    public PropietarioFrame(Propietario propietario, Control controlador) {
        this.propietario = propietario;
        this.controlador = controlador;

        setTitle("Menú de Propietario");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);

        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JButton consultarFacturasBtn = new JButton("Consultar Facturas");
        consultarFacturasBtn.setBounds(50, 30, 200, 25);
        panel.add(consultarFacturasBtn);

        JButton pagarFacturasBtn = new JButton("Pagar Facturas");
        pagarFacturasBtn.setBounds(50, 60, 200, 25);
        panel.add(pagarFacturasBtn);

        consultarFacturasBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementar consulta de facturas
                List<Factura> facturas = controlador.obtenerFacturasPropietario(propietario);
                if (!facturas.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (Factura factura : facturas) {
                        sb.append(factura.getInfoPago()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "No tienes facturas pendientes.");
                }
            }
        });
    }
}


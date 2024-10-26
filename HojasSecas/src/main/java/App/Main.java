/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import Controlador.Control;
import Frontend.LoginFrame;

/**
 *
 * @author santi
 */
public class Main {
    public static void main(String[] args) {
        Control controlador = new Control();
        new LoginFrame(controlador);
    }
}


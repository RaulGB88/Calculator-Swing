package org.granel.calculator.app;

import org.granel.calculator.forms.GUI;

import java.awt.*;

public class App {
    // Entrada al Mecanismo Funcional
    public void launchApp() {
        // Lanzar GUI
        launchGUI();
    }

    // Lanzar Interfaz Grafico de Usuario
    public void launchGUI() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Instancia la ventana
                GUI gui = new GUI();

                // Muestra la ventana
                gui.setVisible(true);
            }
        });
    }
}

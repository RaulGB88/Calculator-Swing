package org.granel.calculator.events;

import org.granel.calculator.forms.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AEM implements ActionListener {

    // Referencia al igu
    private final GUI gui;

    public AEM(GUI gui) {
        this.gui = gui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Analizar evento

        // LLamar a algún método de GUI
        gui.marcaNumero(e);
    }

}

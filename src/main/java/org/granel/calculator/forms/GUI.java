package org.granel.calculator.forms;

import org.granel.calculator.events.AEM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

    // Tamaño de la ventana
    public static final int VENTANA_ANC = 600;
    public static final int VENTANA_ALT = 400;

    int uno;
    int dos;
    int tres;
    int cuatro;
    int cinco;
    int seis;

    JPanel pnlPpal;
    JPanel pnlSec;
    JLabel lblResul;
    JButton btn0;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btnSum;
    JButton btnRes;
    JButton btnX;
    JButton btnDiv;
    JButton btnEq;
    JButton btnAc;

    public GUI() {
        // Inicialización PREVIA
        beforeInit();

        // Creación del interfaz
        initComponents();

        // Inicialización POSTERIOR
        afterInit();
    }

    // Construcción del IGU
    private void initComponents() {

        Dimension dimSec = new Dimension(150, 100);
        Dimension dimPal = new Dimension(400, 250);

        AEM aem = new AEM(this);

        // Botón resultado.
        lblResul = new JLabel("0");
        lblResul.setPreferredSize(dimSec);
        lblResul.setHorizontalAlignment(JLabel.CENTER);

        // Botones
        btn0 = new JButton("0");
        btn0.addActionListener(aem);
        btn1 = new JButton("1");
        btn1.addActionListener(aem);
        btn2 = new JButton("2");
        btn2.addActionListener(aem);
        btn3 = new JButton("3");
        btn3.addActionListener(aem);
        btn4 = new JButton("4");
        btn4.addActionListener(aem);
        btn5 = new JButton("5");
        btn5.addActionListener(aem);
        btn6 = new JButton("6");
        btn6.addActionListener(aem);
        btn7 = new JButton("7");
        btn7.addActionListener(aem);
        btn8 = new JButton("8");
        btn8.addActionListener(aem);
        btn9 = new JButton("9");
        btn9.addActionListener(aem);
        btnSum = new JButton("+");
        btnSum.addActionListener(aem);
        btnRes = new JButton("-");
        btnRes.addActionListener(aem);
        btnX = new JButton("*");
        btnX.addActionListener(aem);
        btnDiv = new JButton("/");
        btnDiv.addActionListener(aem);
        btnEq = new JButton("=");
        btnEq.addActionListener(aem);
        btnAc = new JButton("AC");
        btnAc.addActionListener(aem);

        // Panel Secundario
        pnlSec = new JPanel();
        GridLayout layout = new GridLayout(4, 4);
        pnlSec.setLayout(layout);
        System.out.println(pnlSec.getLayout());

        pnlSec.add(btn7);
        pnlSec.add(btn8);
        pnlSec.add(btn9);
        pnlSec.add(btnX);

        pnlSec.add(btn4);
        pnlSec.add(btn5);
        pnlSec.add(btn6);
        pnlSec.add(btnRes);

        pnlSec.add(btn1);
        pnlSec.add(btn2);
        pnlSec.add(btn3);
        pnlSec.add(btnSum);

        pnlSec.add(btn0);
        pnlSec.add(btnDiv);
        pnlSec.add(btnEq);
        pnlSec.add(btnAc);

        // Panel Principal
        pnlPpal = new JPanel();
        pnlPpal.setLayout(new BorderLayout());
        pnlPpal.add(lblResul, BorderLayout.NORTH);
        pnlPpal.add(pnlSec, BorderLayout.CENTER);

        // Ventana principal
        setTitle("Calculadora");
        setContentPane(pnlPpal);
//        setResizable(false);
        setSize(VENTANA_ANC, VENTANA_ALT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Inicialización antes del IGU
    private void beforeInit() {

    }

    // Inicialización después del IGU
    private void afterInit() {

    }

    private void meterBoton(String numero) {

        JButton boton = new JButton(numero);
        pnlPpal.add(boton);
    }

    public void marcaNumero(ActionEvent e) {

        if (e.getSource().equals(btn0)) {
            uno = Integer.parseInt(btn0.getText());
            lblResul.setText(btn1.getText());
        } else if (e.getSource().equals(btn1)) {
            uno = Integer.parseInt(btn1.getText());
            lblResul.setText(btn1.getText());
        } else if (e.getSource().equals(btn2)) {
            dos = Integer.parseInt(btn2.getText());
            lblResul.setText(btn2.getText());
        } else if (e.getSource().equals(btn3)) {
            tres = Integer.parseInt(btn3.getText());
            lblResul.setText(btn3.getText());
        } else if (e.getSource().equals(btn4)) {
            cuatro = Integer.parseInt(btn4.getText());
            lblResul.setText(btn4.getText());
        } else if (e.getSource().equals(btn5)) {
            cinco = Integer.parseInt(btn5.getText());
            lblResul.setText(btn5.getText());
        } else if (e.getSource().equals(btn6)) {
            seis = Integer.parseInt(btn6.getText());
            lblResul.setText(btn6.getText());
        } else if (e.getSource().equals(btn7)) {
            uno = Integer.parseInt(btn7.getText());
            lblResul.setText(btn7.getText());
        } else if (e.getSource().equals(btn8)) {
            dos = Integer.parseInt(btn8.getText());
            lblResul.setText(btn8.getText());
        } else if (e.getSource().equals(btn9)) {
            dos = Integer.parseInt(btn9.getText());
            lblResul.setText(btn9.getText());
        } else if (e.getSource().equals(btnSum)) {
            lblResul.setText(btnSum.getText());
        } else if (e.getSource().equals(btnRes)) {
            lblResul.setText(btnRes.getText());
        } else if (e.getSource().equals(btnX)) {
            lblResul.setText(btnX.getText());
        } else if (e.getSource().equals(btnDiv)) {
            lblResul.setText(btnDiv.getText());
        } else if (e.getSource().equals(btnEq)) {
            lblResul.setText(btnEq.getText());
        } else if (e.getSource().equals(btnAc)) {
            lblResul.setText("");
        }
    }
}

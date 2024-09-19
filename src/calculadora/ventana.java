package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana extends JFrame {

    JPanel panel = new JPanel();
    JTextField txtvalor = new JTextField();
    JLabel lblresultado = new JLabel();
    int valor = 0;
    char simbolos = ' ';

    public ventana() {
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void inserpanel() {
        this.getContentPane().add(panel);
        panel.setLayout(null);

    }

    public void textos() {
        txtvalor.setBounds(50, 50, 400, 70);
        panel.add(txtvalor);
        txtvalor.repaint();
    }

    public void botones() {

        JButton btn1 = new JButton("1");
        btn1.setBounds(55, 180, 70, 30);
        panel.add(btn1);
        btn1.repaint();
        ActionListener agregar1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtvalor.getText() + "1";
                txtvalor.setText(union);
            }
        };
        btn1.addActionListener(agregar1);

        JButton btn2 = new JButton("2");
        btn2.setBounds(155, 180, 70, 30);
        panel.add(btn2);
        btn2.repaint();
        ActionListener agregar2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtvalor.getText() + "2";
                txtvalor.setText(union);
            }
        };
        btn2.addActionListener(agregar2);

        JButton btn3 = new JButton("3");
        btn3.setBounds(255, 180, 70, 30);
        panel.add(btn3);
        btn3.repaint();
        ActionListener agregar3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtvalor.getText() + "3";
                txtvalor.setText(union);
            }
        };
        btn3.addActionListener(agregar3);

        JButton btn4 = new JButton("4");
        btn4.setBounds(55, 230, 70, 30);
        panel.add(btn4);
        btn4.repaint();
        ActionListener agregar4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtvalor.getText() + "4";
                txtvalor.setText(union);
            }
        };
        btn4.addActionListener(agregar4);

        JButton btn5 = new JButton("5");
        btn5.setBounds(155, 230, 70, 30);
        panel.add(btn5);
        btn5.repaint();
        ActionListener agregar5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtvalor.getText() + "5";
                txtvalor.setText(union);
            }
        };
        btn5.addActionListener(agregar5);

        JButton btn6 = new JButton("6");
        btn6.setBounds(255, 230, 70, 30);
        panel.add(btn6);
        btn6.repaint();
        ActionListener agregar6 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtvalor.getText() + "6";
                txtvalor.setText(union);
            }
        };
        btn6.addActionListener(agregar6);

        JButton btn7 = new JButton("7");
        btn7.setBounds(55, 280, 70, 30);
        panel.add(btn7);
        btn7.repaint();
        ActionListener agregar7 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtvalor.getText() + "7";
                txtvalor.setText(union);
            }
        };
        btn7.addActionListener(agregar7);

        JButton btn8 = new JButton("8");
        btn8.setBounds(155, 280, 70, 30);
        panel.add(btn8);
        btn8.repaint();
        ActionListener agregar8 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtvalor.getText() + "8";
                txtvalor.setText(union);
            }
        };
        btn8.addActionListener(agregar8);

        JButton btn9 = new JButton("9");
        btn9.setBounds(255, 280, 70, 30);
        panel.add(btn9);
        btn9.repaint();
        ActionListener agregar9 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtvalor.getText() + "9";
                txtvalor.setText(union);
            }
        };
        btn9.addActionListener(agregar9);

        JButton btn0 = new JButton("0");
        btn0.setBounds(155, 330, 70, 30);
        panel.add(btn0);
        btn0.repaint();
        ActionListener agregar0 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtvalor.getText() + "0";
                txtvalor.setText(union);
            }
        };
        btn0.addActionListener(agregar0);

        JButton btnpun = new JButton(".");
        btnpun.setBounds(255, 330, 70, 30);
        panel.add(btnpun);
        btnpun.repaint();
        ActionListener punto = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtvalor.getText() + ".";
                txtvalor.setText(union);
            }
        };
        btnpun.addActionListener(punto);

        JButton btnsum = new JButton("+");
        btnsum.setBounds(355, 180, 70, 30);
        panel.add(btnsum);
        btnsum.repaint();
        ActionListener sumando = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtvalor.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "ingrese el valor");
                } else {
                    valor += Integer.parseInt(txtvalor.getText());
                    simbolos = '+';

                    txtvalor.setText("");
                }
            }
        };
        btnsum.addActionListener(sumando);

        JButton btnresta = new JButton("_");
        btnresta.setBounds(355, 230, 70, 30);
        panel.add(btnresta);
        btnresta.repaint();
        ActionListener resta = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtvalor.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "ingrese el valor");
                } else {
                    if (valor == 0) {
                        valor = Integer.parseInt(txtvalor.getText());
                    } else {
                        valor -= Integer.parseInt(txtvalor.getText());
                    }
                    simbolos = '-';
                    txtvalor.setText("");
                }
            }
        };
        btnresta.addActionListener(resta);

        JButton btnmultiplicar = new JButton("x");
        btnmultiplicar.setBounds(355, 280, 70, 30);
        panel.add(btnmultiplicar);
        btnmultiplicar.repaint();
        ActionListener multiplicacion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtvalor.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "ingrese el valor");
                } else {

                    if (valor == 0) {
                        valor = 0;

                    } else {
                        valor *= Integer.parseInt(txtvalor.getText());

                    }
                    simbolos = '*';
                    txtvalor.setText("");

                }
            }
        };
        btnmultiplicar.addActionListener(multiplicacion);

        JButton btndiv = new JButton("%");
        btndiv.setBounds(355, 330, 70, 30);
        panel.add(btndiv);
        btndiv.repaint();
        ActionListener divicion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtvalor.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "ingrese el valor");
                } else {
                    if (Double.parseDouble(txtvalor.getText()) >= 0) {
                        double total = Math.sqrt(Double.parseDouble(txtvalor.getText()));
                        txtvalor.setText(String.valueOf(total));
                        valor = 0;
                    } else {
                        JOptionPane.showMessageDialog(null, "error");
                    }
                    simbolos = '/';
                    txtvalor.setText("");
                }
            }
        };
        btndiv.addActionListener(divicion);

        JButton btnigual = new JButton("=");
        panel.add(btnigual);
        btnigual.setBounds(55, 380, 270, 30);
        btnigual.repaint();
        ActionListener resul;
        resul = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double resultado = 0;
                if (simbolos == '+') {
                    resultado = valor + Double.parseDouble(txtvalor.getText());
                } else if (simbolos == '-') {
                    resultado = valor - Double.parseDouble(txtvalor.getText());
                } else if (simbolos == '%') {
                    resultado = valor / Double.parseDouble(txtvalor.getText());
                } else if (simbolos == 'x') {
                    resultado = valor * Double.parseDouble(txtvalor.getText());

                }
                txtvalor.setText(String.valueOf(resultado));
                valor = 0;
            }
        };
        btnigual.addActionListener(resul);

        JButton btnBorrar = new JButton("<<<");
        panel.add(btnBorrar);
        btnBorrar.setBounds(355, 380, 70, 30);

        ActionListener borraruno = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String espacio = "";
                for (int i = 0; i < txtvalor.getText().length() - 1; i++) {
                    espacio = espacio + txtvalor.getText().charAt(i);
                }

                txtvalor.setText(espacio);

            }
        };

        btnBorrar.addActionListener(borraruno);

    }
}

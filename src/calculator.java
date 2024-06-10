
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class close extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

}

class cal implements ActionListener {

    Frame frame1;
    Panel panel1, panel2;
    TextField txtField1;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25;

    String fv, sv, op, ft, lt, sq;
    double num1, num2, total, sqd;

    cal() {

        frame1 = new Frame();

        frame1.addWindowListener(new close());
        frame1.setBounds(300, 100, 350, 550);
        frame1.setTitle("Calculator");

        MenuBar mBar = new MenuBar();

        MenuItem mode1 = new MenuItem("Dark");
        MenuItem mode2 = new MenuItem("Light");
        MenuItem mItem1 = new MenuItem("Copy");
        MenuItem mItem2 = new MenuItem("Paste");
        MenuItem mItem3 = new MenuItem("Help");
        MenuItem mItem4 = new MenuItem("About");

        Menu menu1 = new Menu("Theme");
        menu1.add(mode1);
        menu1.add(mode2);

        Menu menu2 = new Menu("Format");
        menu2.add(mItem1);
        menu2.add(mItem2);

        Menu menu3 = new Menu("Help");
        menu3.add(mItem3);
        menu3.add(mItem4);

        mBar.add(menu1);
        mBar.add(menu2);
        mBar.add(menu3);

        mode1.addActionListener(this);
        mode2.addActionListener(this);

        frame1.setMenuBar(mBar);

        txtField1 = new TextField(17);
        Font txtFont = new Font("Cambria Math", Font.BOLD, 30);
        txtField1.setFont(txtFont);
        txtField1.setEditable(false);

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("0");
        b11 = new Button(".");
        b12 = new Button("C");
        b13 = new Button("+");
        b14 = new Button("-");
        b15 = new Button("x");
        b16 = new Button("/");
        b17 = new Button("=");
        b18 = new Button("<--");
        b19 = new Button("%");
        b20 = new Button("\u221A");
        b21 = new Button("MC");
        b22 = new Button("MS");
        b23 = new Button("M+");
        b24 = new Button("M-");

        Font font1 = new Font("Cambria Math", Font.BOLD, 19);
        Font font2 = new Font("Cambria Math", Font.BOLD, 21);

        b1.setFont(font2);
        b2.setFont(font2);
        b3.setFont(font2);
        b4.setFont(font2);
        b5.setFont(font2);
        b6.setFont(font2);
        b7.setFont(font2);
        b8.setFont(font2);
        b9.setFont(font2);
        b10.setFont(font2);
        b11.setFont(font1);
        b12.setFont(font1);
        b13.setFont(font1);
        b14.setFont(font1);
        b15.setFont(font1);
        b16.setFont(font1);
        b17.setFont(font1);
        b18.setFont(font1);
        b19.setFont(font1);
        b20.setFont(font1);
        b21.setFont(font1);
        b22.setFont(font1);
        b23.setFont(font1);
        b24.setFont(font1);

        panel1 = new Panel();
        panel2 = new Panel();

        GridLayout gLayout = new GridLayout(6, 10, 4, 4);

        panel1.add(txtField1);

        panel2.setLayout(gLayout);
        panel2.add(b21);
        panel2.add(b22);
        panel2.add(b23);
        panel2.add(b24);
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b13);
        panel2.add(b4);
        panel2.add(b5);
        panel2.add(b6);
        panel2.add(b14);
        panel2.add(b7);
        panel2.add(b8);
        panel2.add(b9);
        panel2.add(b15);
        panel2.add(b11);
        panel2.add(b10);
        panel2.add(b18);
        panel2.add(b16);
        panel2.add(b19);
        panel2.add(b20);
        panel2.add(b12);
        panel2.add(b17);

        frame1.add(panel1, BorderLayout.NORTH);
        frame1.add(panel2, BorderLayout.CENTER);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);

        frame1.setVisible(true);

        txtField1.setBackground(Color.WHITE);
        txtField1.setForeground(Color.BLACK);
        frame1.setBackground(Color.WHITE);
        panel1.setBackground(Color.WHITE);
        panel2.setBackground(Color.WHITE);
        b21.setBackground(Color.darkGray);
        b22.setBackground(Color.darkGray);
        b23.setBackground(Color.darkGray);
        b24.setBackground(Color.GREEN);
        b13.setBackground(Color.GREEN);
        b14.setBackground(Color.GREEN);
        b15.setBackground(Color.GREEN);
        b16.setBackground(Color.GREEN);
        b17.setBackground(Color.GREEN);
        b1.setBackground(Color.LIGHT_GRAY);
        b2.setBackground(Color.LIGHT_GRAY);
        b3.setBackground(Color.LIGHT_GRAY);
        b4.setBackground(Color.LIGHT_GRAY);
        b5.setBackground(Color.LIGHT_GRAY);
        b6.setBackground(Color.LIGHT_GRAY);
        b7.setBackground(Color.LIGHT_GRAY);
        b8.setBackground(Color.LIGHT_GRAY);
        b9.setBackground(Color.LIGHT_GRAY);
        b10.setBackground(Color.LIGHT_GRAY);
        b11.setBackground(Color.LIGHT_GRAY);
        b12.setBackground(Color.LIGHT_GRAY);
        b18.setBackground(Color.LIGHT_GRAY);
        b19.setBackground(Color.LIGHT_GRAY);
        b20.setBackground(Color.LIGHT_GRAY);

    }

    @Override
    public void actionPerformed(ActionEvent aEvt) {
        String label = aEvt.getActionCommand();
        Object obj = aEvt.getSource();

        switch (label) {

            case "Dark":

                txtField1.setBackground(Color.GRAY);
                txtField1.setForeground(Color.WHITE);
                frame1.setBackground(Color.BLACK);
                panel1.setBackground(Color.BLACK);
                panel2.setBackground(Color.BLACK);
                b21.setBackground(Color.BLUE);
                b22.setBackground(Color.BLUE);
                b23.setBackground(Color.BLUE);
                b24.setBackground(Color.YELLOW);
                b13.setBackground(Color.YELLOW);
                b14.setBackground(Color.YELLOW);
                b15.setBackground(Color.YELLOW);
                b16.setBackground(Color.YELLOW);
                b17.setBackground(Color.YELLOW);
                b1.setBackground(Color.LIGHT_GRAY);
                b2.setBackground(Color.LIGHT_GRAY);
                b3.setBackground(Color.LIGHT_GRAY);
                b4.setBackground(Color.LIGHT_GRAY);
                b5.setBackground(Color.LIGHT_GRAY);
                b6.setBackground(Color.LIGHT_GRAY);
                b7.setBackground(Color.LIGHT_GRAY);
                b8.setBackground(Color.LIGHT_GRAY);
                b9.setBackground(Color.LIGHT_GRAY);
                b10.setBackground(Color.LIGHT_GRAY);
                b11.setBackground(Color.LIGHT_GRAY);
                b12.setBackground(Color.LIGHT_GRAY);
                b18.setBackground(Color.LIGHT_GRAY);
                b19.setBackground(Color.LIGHT_GRAY);
                b20.setBackground(Color.LIGHT_GRAY);

                break;
            case "Light":

                txtField1.setBackground(Color.WHITE);
                txtField1.setForeground(Color.BLACK);
                frame1.setBackground(Color.WHITE);
                panel1.setBackground(Color.WHITE);
                panel2.setBackground(Color.WHITE);
                b21.setBackground(Color.darkGray);
                b22.setBackground(Color.darkGray);
                b23.setBackground(Color.darkGray);
                b24.setBackground(Color.GREEN);
                b13.setBackground(Color.GREEN);
                b14.setBackground(Color.GREEN);
                b15.setBackground(Color.GREEN);
                b16.setBackground(Color.GREEN);
                b17.setBackground(Color.GREEN);
                b1.setBackground(Color.LIGHT_GRAY);
                b2.setBackground(Color.LIGHT_GRAY);
                b3.setBackground(Color.LIGHT_GRAY);
                b4.setBackground(Color.LIGHT_GRAY);
                b5.setBackground(Color.LIGHT_GRAY);
                b6.setBackground(Color.LIGHT_GRAY);
                b7.setBackground(Color.LIGHT_GRAY);
                b8.setBackground(Color.LIGHT_GRAY);
                b9.setBackground(Color.LIGHT_GRAY);
                b10.setBackground(Color.LIGHT_GRAY);
                b11.setBackground(Color.LIGHT_GRAY);
                b12.setBackground(Color.LIGHT_GRAY);
                b18.setBackground(Color.LIGHT_GRAY);
                b19.setBackground(Color.LIGHT_GRAY);
                b20.setBackground(Color.LIGHT_GRAY);

                break;

        }

        if (obj.equals(b1)) {
            txtField1.setText(txtField1.getText() + b1.getLabel());
        } else if (obj.equals(b2)) {
            txtField1.setText(txtField1.getText() + b2.getLabel());
        } else if (obj.equals(b3)) {
            txtField1.setText(txtField1.getText() + b3.getLabel());
        } else if (obj.equals(b4)) {
            txtField1.setText(txtField1.getText() + b4.getLabel());
        } else if (obj.equals(b5)) {
            txtField1.setText(txtField1.getText() + b5.getLabel());
        } else if (obj.equals(b6)) {
            txtField1.setText(txtField1.getText() + b6.getLabel());
        } else if (obj.equals(b7)) {
            txtField1.setText(txtField1.getText() + b7.getLabel());
        } else if (obj.equals(b8)) {
            txtField1.setText(txtField1.getText() + b8.getLabel());
        } else if (obj.equals(b9)) {
            txtField1.setText(txtField1.getText() + b9.getLabel());
        } else if (obj.equals(b10)) {
            txtField1.setText(txtField1.getText() + b10.getLabel());
        } else if (obj.equals(b13)) {
            fv = txtField1.getText();
            txtField1.setText("");
            op = b13.getLabel();
        } else if (obj.equals(b14)) {
            fv = txtField1.getText();
            txtField1.setText("");
            op = b14.getLabel();
        } else if (obj.equals(b15)) {
            fv = txtField1.getText();
            txtField1.setText("");
            op = b15.getLabel();
        } else if (obj.equals(b16)) {
            fv = txtField1.getText();
            txtField1.setText("");
            op = b16.getLabel();
        } else if (obj.equals(b19)) {
            fv = txtField1.getText();
            txtField1.setText("");
            op = b19.getLabel();
        } else if (obj.equals(b17)) {
            sv = txtField1.getText();
            num1 = Double.parseDouble(fv);
            num2 = Double.parseDouble(sv);

            if (op.equals("+")) {
                total = num1 + num2;
                txtField1.setText(total + "");
            } else if (op.equals("-")) {
                total = num1 - num2;
                txtField1.setText(total + "");
            } else if (op.equals("x")) {
                total = num1 * num2;
                txtField1.setText(total + "");
            } else if (op.equals("/")) {
                total = num1 / num2;
                txtField1.setText(total + "");
            } else if (op.equals("%")) {
                total = (num1 * num2) / 100;
                txtField1.setText(total + "");
            }

        } else if (obj.equals(b12)) {
            num1 = 0;
            num2 = 0;
            op = "";
            total = 0;
            txtField1.setText("");
        } else if (obj.equals(b18)) {
            ft = txtField1.getText();

            try {
                lt = ft.substring(0, ft.length() - 1);
            } catch (StringIndexOutOfBoundsException f) {
                return;
            }

            txtField1.setText(lt);

        } else if (obj.equals(b20)) {
            sq = txtField1.getText();
            sqd = Double.parseDouble(sq);
            double square = Math.sqrt(sqd);
            txtField1.setText(Double.toString(square));
        }

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

public class calculator {

    public static void main(String[] args) {

        new cal();

    }

}

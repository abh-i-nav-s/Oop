import java.awt.*;
import java.awt.event.*;

public class CalcAWT extends Frame implements ActionListener {
    TextField t1, t2, t3;
    Button add, sub, mul, div;

    CalcAWT() {
        setLayout(new FlowLayout());

        add(new Label("Enter two numbers:"));

        t1 = new TextField(5);
        t2 = new TextField(5);
        t3 = new TextField(10);

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        add(t1); add(t2);
        add(add); add(sub); add(mul); add(div);
        add(t3);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setSize(300,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        double res = 0;

        if(e.getSource()==add) res = a+b;
        if(e.getSource()==sub) res = a-b;
        if(e.getSource()==mul) res = a*b;
        if(e.getSource()==div) res = a/b;

        t3.setText("Result = " + res);
    }

    public static void main(String args[]) {
        new CalcAWT();
    }
}

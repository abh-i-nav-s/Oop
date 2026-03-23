import java.awt.*;
import java.awt.event.*;

public class MaxAWT extends Frame implements ActionListener {
    TextField t1, t2, t3, t4;
    Button b;

    MaxAWT() {
        setLayout(new FlowLayout());

        add(new Label("Enter 3 numbers:"));

        t1 = new TextField(5);
        t2 = new TextField(5);
        t3 = new TextField(5);
        t4 = new TextField(10);

        b = new Button("Find Max");

        add(t1); add(t2); add(t3);
        add(b);
        add(t4);

        b.addActionListener(this);

        setSize(300,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b1 = Integer.parseInt(t2.getText());
        int c = Integer.parseInt(t3.getText());

        int max = Math.max(a, Math.max(b1, c));
        t4.setText("Max = " + max);
    }

    public static void main(String args[]) {
        new MaxAWT();
    }
}

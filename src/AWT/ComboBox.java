package AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBox extends JFrame implements ItemListener {

    JComboBox box;
    JLabel lbl;
    @Override
    public void itemStateChanged(ItemEvent e) {
        Container c = getContentPane();
        c.setLayout(null);

        box = new JComboBox();

        box.addItem("India");
        box.addItem("America");
        //box.add
    }
}

package AWT;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox {
    //private static final int EXIT_ON_CLOSE = 0;
    JFrame f;
    JLabel label;
    JCheckBox cb1,cb2,cb3;
    JButton b;
    void checkBoxExp(){
        label = new JLabel("Your order reciept..");
        f=new JFrame("Food Ordering system.");
        label.setBounds(50,50,300,20);
        cb1 = new JCheckBox("Pizza @ 100");
        cb1.setBounds(100,100,150,20);
        cb2 = new JCheckBox("Burger @ 30");
        cb2.setBounds(100,150,150,20);
        cb3 = new JCheckBox("Tea @ 10");
        cb3.setBounds(100,200,150,20);

        b = new JButton("Order");
        b.setBounds(100,250,80,30);
        f.add(label); f.add(cb1); f.add(cb2); f.add(cb3); f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        //f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               float amount =0;
               String s="";
               if(cb1.isSelected());
                {
                    amount+=100;
                    s+= "Pizza";
                }
                if(cb2.isSelected());
                {
                    amount+=30;
                    s+= "Burger";
                }
                if(cb3.isSelected());
                {
                    amount+=10;
                    s+= "Tea";
                }
                JOptionPane.showMessageDialog(f,amount + " "+ s);
            }
        });

    }
    public  static void main(String... args){
        CheckBox ch = new CheckBox();
        ch.checkBoxExp();
    }
}

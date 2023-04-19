package java_basics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {
    public  static  void main(String... args){
        JFrame frame = new JFrame("Login Page");
        JLabel l1 = new JLabel();
        l1.setBounds(20, 150,200,50);
        JPasswordField value = new  JPasswordField();
        value.setBounds(120,75,100,30);

        JLabel name = new JLabel("username");
        name.setBounds(20,20,80,30);

        JLabel password = new JLabel("password");
        password.setBounds(20,75,80,30);

        JTextField txtUserName = new JTextField();
        txtUserName.setBounds(120,20,100,30);

        JButton b = new JButton("Submit");
        b.setBounds(100, 200, 100, 30);

        frame.add(l1);
        frame.add(value);
        frame.add(name);
        frame.add(password);
        frame.add(txtUserName);
        //frame.add(txtPassword);
        frame.add(b);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "user name " + txtUserName.getText();
                data+= "password "+ new String(value.getPassword());
                l1.setText(data);
            }
        });
    }
}

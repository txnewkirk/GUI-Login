package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

            //user label created
            userLabel = new JLabel("User");
            userLabel.setBounds(10, 20, 80, 25);
            panel.add(userLabel); //add label to the panel

            //create user TextField and add it to the panel
            userText = new JTextField(20);
            userText.setBounds(100, 20, 165, 25);
            panel.add(userText); //add text field to the panel

            //password label created
            passwordLabel = new JLabel("Password");
            passwordLabel.setBounds(10, 50, 80, 25);
            panel.add(passwordLabel); //add password label to the panel

            //password text field created
            passwordText = new JPasswordField();
            passwordText.setBounds(100, 50, 165, 25);
            panel.add(passwordText); // add password text field to the panel

            //login button created
            button = new JButton("Login");
            button.setBounds(10, 80, 80, 25);
            button.addActionListener(new GUI()); //add buttons action event listener.
            panel.add(button);  //add login button to the panel

            //success label created
            success = new JLabel("");
            success.setBounds(10, 110, 300, 25);
            panel.add(success); // add success label to the panel

            frame.setVisible(true); //display gui
        }
        @Override
    /*
       once login button is clicked, username and password is checked for verification.
     */
        public void actionPerformed (ActionEvent e){
            String user = userText.getText();
            String password = passwordText.getText();

            //if verified, success label is set to login successful.
            if (user.equals("Xavier") && password.equals("CodeTalk123!")) {
                success.setText("Login Successful!");
            }
        }
    }


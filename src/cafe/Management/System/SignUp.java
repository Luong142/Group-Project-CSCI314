package Cafe.Management.System;

import javax.swing.*;
import javax.swing.ImageIcon;

import Model.Role;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame
{
    public JPanel jPanelSignUp;
    private JLabel cafeLabel;
    private JLabel usernameLabel;
    private JTextField usernameInput;
    private JPasswordField passwordInput;
    private JButton loginButton;
    private JComboBox<Role> comboBox1; // the user can select the role in this box
    private JLabel clickableRegister; // for clickable label

    private JFrame backgroundImage;

    public SignUp(String title)
    {
        super(title);
        this.setContentPane(jPanelSignUp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        /*
        JLabel backgroundImage = new JLabel();
        Icon image = new ImageIcon("Cafe.Management.System/src/Images/cafe.jpg");
        backgroundImage.setIcon(image);
        backgroundImage.setBounds(0, 0, 600, 500);
        this.add(backgroundImage);

         */

        // should activate the log in function in controller class
        loginButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    // testing purpose
    public static void main(String[] args)
    {
        SignUp signUpPage = new SignUp("Cafe Management System");
        // size here
        signUpPage.setSize(600, 500);
        signUpPage.getContentPane().setBackground(Color.MAGENTA);

        signUpPage.setVisible(true);
    }
}




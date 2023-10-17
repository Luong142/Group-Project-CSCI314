package Cafe.Management.System;

import javax.swing.*;
public class MainMenuPage extends JFrame
{
    private JPanel jPanel;

    public MainMenuPage(String title)
    {
        super(title);
        this.setContentPane(jPanel);
        this.setSize(600, 800);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        this.setVisible(true);
    }

}

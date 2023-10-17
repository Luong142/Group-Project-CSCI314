package Cafe.Management.System;

import java.awt.*;

public class Main
{
    // testing purpose
    public static void main(String[] args)
    {
        // run here
        LogInPage logInPage = new LogInPage("Cafe Management System");
        // size here
        logInPage.setSize(600, 500);
        logInPage.getContentPane().setBackground(Color.MAGENTA);

        logInPage.setVisible(true);
    }
}

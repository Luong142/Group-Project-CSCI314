package Cafe.Management.System;

import java.awt.*;

public class Main
{
    // testing purpose
    public static void main(String[] args)
    {
        // run here
        LogInPage signUpPage = new LogInPage("Cafe Management System");
        // size here
        signUpPage.setSize(600, 500);
        signUpPage.getContentPane().setBackground(Color.MAGENTA);

        signUpPage.setVisible(true);
    }

}


import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.*;

class PersonInfo
{
    protected String name;
    protected String title;
    protected String imageFile;

    public PersonInfo(String name, String title, String imageFile)
    {
        this.name = name;
        this.title = title;
        this.imageFile = imageFile;
    }

    public PersonInfo(PersonInfo pi)
    {
        this (pi.name, pi.title, pi.imageFile);
    }

    public String getName()
    {
        return name;
    }

    public String getTitle()
    {
        return title;
    }

    // important here the file should be heng.jpg or 1.jpg and onward.
    public String getImageFile()
    {
        return imageFile;
    }

    public void setInfo(String name, String title, String ImageFile)
    {

        this.name = name;
        this.title = title;
        this.imageFile = ImageFile;
    }

    public String toString()
    {
        return String.format("%s%n%s%n", name, title);
    }
}

class Student extends PersonInfo
{
    private String group;
    private String demoWhat;

    public Student(String name, String title, String imageFile, String group, String demoWhat)
    {
        super(name, title, imageFile);
        this.group = group;
        this.demoWhat = demoWhat;
    }

    public String getGroup()
    {
        return group;
    }

    public String getDemoWhat()
    {
        return demoWhat;
    }

    public void setInfo(String name, String title, String imageFile, String group, String demoWhat)
    {
        super.name = name;
        super.title = title;
        super.imageFile = imageFile;
        this.group = group;
        this.demoWhat = demoWhat;
    }

    public String toString()
    {
        return String.format("Hi sir, I am %sI am from group %s%nI wish to demo %s", super.toString() , group, demoWhat);
    }
}

class Lecturer extends PersonInfo
{
    private ArrayList<String> message;

    public Lecturer(String name, String title, String imageFile, ArrayList<String> message)
    {
        super(name, title, imageFile);
        this.message = message;
    }

    public Lecturer(Lecturer lect)
    {
        this (lect.name, lect.title, lect.imageFile, lect.message);
    }

    public ArrayList<String> getMessage()
    {
        return message;
    }

    public void setInfo(String name, String title, String imageFile, ArrayList<String> message)
    {
        super.name = name;
        super.title = title;
        super.imageFile = imageFile;
        this.message = message;
    }

    public String toString()
    {
        return String.format("%s", super.toString());
    }
}

class Demo_Start extends JFrame
{
    public Demo_Start()
    {
        super("Let us start");
        setLayout(null);
        // get the pane and set background color to it.
        getContentPane().setBackground(Color.pink);

        // calling a constructor from font class with three parameters (name, a constant from Font class, size)
        Font GenericFont = new Font("Font size matters", Font.BOLD, 25);

        JLabel welcome = new JLabel("Welcome to CSIT 121 demo system");
        welcome.setForeground(Color.blue);
        welcome.setFont(GenericFont);
        welcome.setBounds(100, 0, 450, 30);
        add(welcome);

        JLabel image_gif = new JLabel();
        // using Objects.requireNonNull method to secure the program.
        // copy and paste the portion below to the Icon object to display the gif.
        //
        Icon gif = new ImageIcon(Objects.requireNonNull(getClass().getResource("welcome-hello.gif")));
        image_gif.setBounds(0, 10, 600, 300);
        image_gif.setIcon(gif);
        add(image_gif);

        JButton jButton_next = new JButton("Ok");
        jButton_next.setFont(GenericFont);
        jButton_next.setBounds(255, 320, 100, 40);
        // Lambda expression.
        // next step the button should open a new window and then display all info from objects below.
        jButton_next.addActionListener(e ->
        {
            // dispose method is to get rid of this Demo_Start class before opening the new frame in Demo class.
            dispose();
            Demo demo = new Demo();
        });
        add(jButton_next);
    }
}

// for JavaFX
// My Virtual Machine has some problem with JavaFX.
class Test
{

}

public class Main
{
    public static void main(String [] args)
    {
        Demo_Start demo = new Demo_Start();
        demo.setSize(614, 400);
        demo.setLocationRelativeTo(null);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


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

// a class to add refresh button
class Demo extends JFrame
{
    private List<Student> alist;
    private final String [] nameArray = {"Lexus", "Mercedes", "Ferrari", "Mazda", "Honda", "Toyota"};
    private final String [] message = {
            "Bad Indentation", "Full mark 6/6 immediately", "Statements too long", "Well done", "Overall design ok", "Overused comments", "Hashset is not allowed to use"};
    private JTextArea studentInfo;
    private JFrame jFrame_Student;
    private JFrame jFrame_end;
    private final Font font = new Font("Generic", Font.BOLD, 20);

    public Demo()
    {
        // display the Demo
        super("Welcome to 121 Demo System");
        this.setSize(700, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        getContentPane().setBackground(Color.MAGENTA);

        JLabel logo = new JLabel();
        //
        Icon image = new ImageIcon(Objects.requireNonNull(getClass().getResource("download.png")));
        logo.setIcon(image);
        logo.setBounds(250, 0,250,250);
        this.add(logo);

        JButton refresh = new JButton("Refresh button to get the next student");
        refresh.setBounds(150, 300, 400,50);
        refresh.setFont(font);

        // Loading new Student object to the alist.
        load();

        // shuffle the list
        Collections.shuffle(alist);

        refresh.addActionListener(e ->
        {
            if (!alist.isEmpty())
            {
                // we can't use enhanced for loop as it might cause Concurrent Modification Exception.

                for (int i = 0; true;) {
                    jFrame_Student = new JFrame();
                    jFrame_Student.setTitle(String.format("Let us welcome %s", alist.get(i).getName()));
                    jFrame_Student.setLayout(new FlowLayout());

                    JLabel numberID = new JLabel();
                    numberID.setFont(font);
                    numberID.setForeground(Color.cyan);
                    numberID.setBackground(Color.blue);
                    numberID.setText(String.format("Student number %s", alist.size()));
                    jFrame_Student.add(numberID);
                    // picture file here for demo
                    //
                    Icon imageIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource(alist.get(i).getImageFile())));
                    JLabel displayImage = new JLabel();
                    displayImage.setIcon(imageIcon);
                    jFrame_Student.add(displayImage);


                    studentInfo = new JTextArea(alist.get(i).toString());
                    studentInfo.setFont(font);
                    studentInfo.setBackground(Color.green);
                    studentInfo.setFocusable(false);

                    jFrame_Student.add(studentInfo);
                    jFrame_Student.getContentPane().setBackground(Color.pink);

                    JButton comment = new JButton("Ok");
                    comment.setFont(font);
                    jFrame_Student.add(comment);

                    comment.addActionListener(a ->
                    {
                        JFrame lecturer = new JFrame();
                        lecturer.setTitle(String.format("Hi %s, my comment to your " + alist.get(i).getDemoWhat(), alist.get(i).getName()));
                        lecturer.getContentPane().setBackground(Color.pink);
                        lecturer.setSize(600, 400);
                        lecturer.setLocationRelativeTo(null);
                        lecturer.setVisible(true);
                        lecturer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        lecturer.setLayout(new FlowLayout());

                        // close the jFrame_Student
                        jFrame_Student.setVisible(false);

                        // a message from the lecturer.
                        JTextArea message = new JTextArea();
                        for (String messages : getMessageList())
                        {
                            if (!messages.equals(getMessage()))
                            {
                                message.setText(String.format("My suggestion, if any:\n- %s\n- %s", messages, getMessage()));
                                Collections.shuffle(getMessageList());
                            }
                            else if (messages.equals(getMessage()))
                            {
                                Collections.shuffle(getMessageList());
                                Collections.shuffle(getMessageList());
                            }
                            break;
                        }
                        message.setForeground(Color.DARK_GRAY);
                        message.setBackground(Color.pink);
                        message.setFont(font);
                        message.setFocusable(false);

                        // signature from the lecturer.
                        JTextArea lecturer_signature = new JTextArea();
                        lecturer_signature.setText(String.format("%s", getLecturer()));

                        lecturer_signature.setBackground(Color.cyan);
                        lecturer_signature.setForeground(Color.blue);
                        lecturer_signature.setFocusable(false);
                        lecturer_signature.setFont(font);

                        // button to close the message.
                        JButton close = new JButton("Close");
                        close.addActionListener(e1 ->
                                lecturer.setVisible(false));
                        close.setFont(font);

                        // img of the lecturer.
                        //
                        Icon lecturer_img = new ImageIcon(Objects.requireNonNull(getClass().getResource("download.png")));
                        JLabel lecturer_display = new JLabel();
                        lecturer_display.setIcon(lecturer_img);

                        lecturer.add(lecturer_display);
                        lecturer.add(lecturer_signature);
                        lecturer.add(message);
                        lecturer.add(close);
                        // remove the first element of a list.
                        removeFirstElement(alist);
                    });
                    break;
                }
                jFrame_Student.setSize(950, 650);
                jFrame_Student.setLocationRelativeTo(null);
                jFrame_Student.setVisible(true);
                jFrame_Student.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            else
            {
                JLabel message = new JLabel("No more student, hope you enjoy my system");
                message.setFont(font);
                message.setForeground(Color.BLUE);

                // img file for demo
                //
                Icon thank = new ImageIcon(Objects.requireNonNull(getClass().getResource("thank.jpg")));
                JLabel thank_display = new JLabel();
                thank_display.setIcon(thank);

                jFrame_end = new JFrame("Thank you!");
                jFrame_end.add(thank_display);
                jFrame_end.setLayout(new FlowLayout());
                jFrame_end.getContentPane().setBackground(Color.pink);
                jFrame_end.add(message);
                jFrame_end.setSize(500, 450);
                jFrame_end.setLocationRelativeTo(null);
                jFrame_end.setVisible(true);
                jFrame_end.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
        add(refresh);
    }

    private void removeFirstElement(List<Student> alist)
    {
        alist.remove(0);
    }

    // return part-time or full time student. (from title attribute)
    private String getFTPT()
    {
        String [] FTPT = {"Full Time Student", "Part Time Student"};
        int index = (int) (Math.random() * FTPT.length);
        return FTPT[index];
    }

    // use for loop to extract data and return each of them in here.
    private String getGroup()
    {
        String [] group = {"T01", "T02", "T03", "T04", "T05"};
        int index = (int) (Math.random() * group.length);
        return group[index];
    }

    private String getDemoWhat()
    {
        String [] demoWhat = {"Assignment 1", "Assignment 2", "Assignment 3", "Lab 1", "Lab 2", "Lab 3", "Lab 4"};
        int index = (int) (Math.random() * demoWhat.length);
        return demoWhat[index];
    }

    // the third parameter is image file src.
    private void load()
    {
        alist = new ArrayList<>();
        for (String s : nameArray) {
            Student student = new Student(s, getFTPT(), getImageFile(), getGroup(), getDemoWhat());
            alist.add(student);
        }
    }

    private String getImageFile()
    {
        String [] image = {"2.jpg", "1.jpg", "3.jpg", "4.jpg"};
        int index = (int) (Math.random() * image.length);
        return image[index];
    }


    private String getMessage()
    {
        // this message is still have some duplicate
        int index = (int) (Math.random() * message.length);
        return message[index];
    }

    private ArrayList<String> getMessageList()
    {
        ArrayList<String> message_array = new ArrayList<>();
        if (!getMessage().equals(getMessage()))
        {
            message_array.add("Nice feature to use");
            message_array.add("Great code structure");
            message_array.add("Duplicate is everywhere");
            message_array.add("Too many if-else statement");
            message_array.add("Choose a proper name for each declaration");
            message_array.add("Clear comment");
            Collections.shuffle(message_array);
        }
        else
        {
            message_array.add("Clear comment");
            message_array.add("Nice feature to use");
            message_array.add("Great code structure");
            message_array.add("Duplicate is everywhere");
            message_array.add("Too many if-else statement");
            message_array.add("Choose a proper name for each declaration");
            Collections.shuffle(message_array);
        }
        return message_array;
    }

    private Lecturer getLecturer()
    {
        return new Lecturer("Heng AK", "Lecturer", "download.png", getMessageList());
    }
}

// for JavaFX
// My Virtual Machine has some problem with JavaFX.
class LuongMinhLuong_206_A3_FX
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

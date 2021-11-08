package pl.rou.programmingLanguages;
//korzystam z fragmentów kodu z zajęć
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.HashMap;

public class MainWindow extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainWindow window = new MainWindow("logowanie");
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }
   public MainWindow() throws HeadlessException {
        this("undefined");
   }
    public MainWindow(String title) throws HeadlessException {
        super(title);
        UsersData usersData = new UsersData();
        buildFrame(usersData.getLoginInfo());
    }
    protected void buildFrame(HashMap <String, String> loginInfo){

        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton login = new JButton("Log in");
        JButton cancel = new JButton("Cancel");

        JTextField userNameField = new JTextField();
        JPasswordField userPasswordField = new JPasswordField();

        JLabel userLoginLabel = new JLabel("Login: ");
        JLabel userPasswordLabel = new JLabel("Password: ");
        JLabel messageLabel = new JLabel();
        setLayout(null); // czy tego potrzebuję?


        userLoginLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);
        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));
        login.setBounds(125,200,100,25);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login = userNameField.getText();
                String password = String.valueOf(userPasswordField.getPassword());

                if(loginInfo.containsKey(login)){
                    if(loginInfo.get(login).equals(password)){
                        //ustawia kolor tła na zielony, który nie razi aż tak w oczy
                        getContentPane().setBackground(new Color(0x00CC66));
                    }
                    else  getContentPane().setBackground(new Color(0xCC0000));
                }
                else  getContentPane().setBackground(new Color(0xCC0000));
            }
        });
        cancel.setBounds(225,200,100,25);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userNameField.setText("");
                userPasswordField.setText("");
            }
        });
        login.setFocusable(false);
        cancel.setFocusable(false);
        userNameField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        add(userLoginLabel);
        add(userPasswordLabel);
        add(userNameField);
        add(userPasswordField);
        add(messageLabel);
        add(login);
        add(cancel);
    }
}
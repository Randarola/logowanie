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
                    MainWindow window = new MainWindow("uciekajacy przycisk");
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }
    public MainWindow(String title) throws Exception {
        super(title);

        buildFrame();
    }
    protected void buildFrame(){

        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton login = new JButton("Log in");
        JButton cancel = new JButton("Cancel");


        JLabel userLoginLabel = new JLabel("Login: ");

        setLayout(null);

        //ustalanie wielkości oraz rozmieszczania przycisków
        userLoginLabel.setBounds(50,100,75,25);
        login.setBounds(125,200,100,25);

        //sprawdzanie czy użytkownik podał wprowadził dane należące do bazy
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        cancel.setBounds(225,200,100,25);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        add(userLoginLabel);
        add(login);
        add(cancel);
    }
}
package pl.rou.programmingLanguages;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

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

    protected void buildFrame() {
        setBounds(100, 100, 900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel info = new JLabel("Naciśnij start :)");
        JButton run = new JButton("Start");
        JButton reset = new JButton("Reset");


        setLayout(null);

        info.setBounds(250, 100, 400, 25);
        run.setBounds(200, 250, 100, 25);
        reset.setBounds(500, 250, 100, 25);


        run.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent event){
                super.mouseEntered(event);
                if(event.getX() < run.getX() - 60) {
                    run.setLocation(new Random().nextInt(800) ,new Random().nextInt(500));
                }
            }
            public void mouseClicked(MouseEvent event){
                super.mouseClicked(event);
                info.setVisible(false);
                run.setVisible(false);
                reset.setVisible(false);

               remove(info);
                remove(run);
                remove(reset);


                Canvas kanwa = new Canvas();
                setBounds(100, 100, 500, 500);
                kanwa.setFocusable(true);
                kanwa.setVisible(true);

                add(kanwa);
                kanwa.requestFocusInWindow();

            }
        });

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                run.setLocation(200,250);
            }
        });

        add(info);
        add(run);
        add(reset);
    }
}
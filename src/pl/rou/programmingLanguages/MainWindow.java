package pl.rou.programmingLanguages;
//korzystam z fragmentów kodu z zajęć

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

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
// !!!  dopasuj lepsze parametry, wyskakujące okno jest za małe !!!
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel info = new JLabel("Tu będzie się znajdował komunikat odnośnie działania programu");
        JButton run = new JButton("Start");
        JButton reset = new JButton("Reset");


        setLayout(null);

        //ustalanie wielkości oraz rozmieszczania przycisków
        // !!!  dopasuj lepsze parametry, słabe rozmieszczenie przycisków!!!
        info.setBounds(50, 100, 400, 25);
        run.setBounds(125, 200, 100, 25);
        reset.setBounds(225, 200, 100, 25);

        //sprawdzanie
        run.addMouseListener(new MouseAdapter() {
//hmmm użytkownik ma przycisk nacisnąć czy na niego najechać?
/*
przy najechaniu myszą na przycisk od "złej" strony ta ucieka, jak najedziesz od dobrej strony i przyciśniesz lewy przycisk myszy, pojawia się kanwa
 */
        });


        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //  !!! Pamiętaj o zmianie wartości x,y !!!
                run.setLocation(125,200);
            }
        });

        add(info);
        add(run);
        add(reset);
    }
}
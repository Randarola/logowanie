package pl.rou.programmingLanguages;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

public class Canvas extends JPanel implements MouseInputListener {
    public Canvas(){
        setBounds(100, 100, 900, 600);
        setBackground(Color.black);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                super.keyPressed(e);

                if (e.getKeyCode() == KeyEvent.VK_K)
                {
                    sq = true;
                 ;
                } else if(e.getKeyCode() == KeyEvent.VK_O)
                {
                    cir = true;
                }
                updateUI();
            }
        });
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }



    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }


    Boolean sq = false, cir = false;
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLUE);
        double X = MouseInfo.getPointerInfo().getLocation().getX();
        double Y = MouseInfo.getPointerInfo().getLocation().getY();
        double width = 50;

        if(sq == true){
            Rectangle2D rect = new Rectangle2D.Double(X,Y,width, width);
            g2d.draw(rect);
            g2d.fill(rect);
            sq = false;
        }
        else if(cir == true){
            Ellipse2D eli = new Ellipse2D.Double(X, Y, width, width);
            g2d.draw(eli);
            g2d.fill(eli);
            cir = false;

        }

    }

}

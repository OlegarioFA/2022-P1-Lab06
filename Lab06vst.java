// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet {

    public void paint(Graphics g) {
        // Draw Grid
        g.drawRect(10, 10, 780, 580);
        g.drawLine(400, 10, 400, 590);
        g.drawLine(10, 300, 790, 300);

        Random rand = new Random();

        // Draw Random Line

        for (int k = 0; k < 100; k++) {
            int x1 = rand.nextInt(390);
            int y1 = rand.nextInt(290);
            int x2 = rand.nextInt(390);
            int y2 = rand.nextInt(290);
            int c = rand.nextInt(255);
            int c2 = rand.nextInt(255);
            int c3 = rand.nextInt(255);


            g.setColor(new Color(c, c2, c3));
            g.drawLine(x1 + 10, y1 + 10, x2 + 10, y2 + 10);
        }
        // Draw Random Squares

        for (int k = 0; k < 100; k += 1) {
            int x1 = rand.nextInt(340);
            int y1 = rand.nextInt(240);
            int c = rand.nextInt(255);
            int c2 = rand.nextInt(255);
            int c3 = rand.nextInt(255);

            g.setColor(new Color(c, c2, c3));
            g.fillRect(x1 + 400, y1 + 10, 50, 50);
        }

        // Draw Random Circles

        for (int k = 0; k < 100; k += 1) {
            int width = rand.nextInt(200);
            int x1 = rand.nextInt(380 - width) + 10;
            int y1 = rand.nextInt(280 - width) + 10;

            int c = rand.nextInt(255);
            int c2 = rand.nextInt(255);
            int c3 = rand.nextInt(255);

            g.setColor(new Color(c, c2, c3));
            g.drawOval(x1 + 10, y1 + 300, width, width);
        }

        // Draw 3-D Box
        for (int k = 0; k < 1; k += 1) {
            int c = rand.nextInt(255);
            int c2 = rand.nextInt(255);
            int c3 = rand.nextInt(255);

            g.setColor(new Color(c, c2, c3));

            g.fillRect(550, 400, 100, 100);
        }
        for (int k = 0; k < 1; k += 1) {
            int c = rand.nextInt(255);
            int c2 = rand.nextInt(255);
            int c3 = rand.nextInt(255);

            g.setColor(new Color(c, c2, c3));

            Polygon penta = new Polygon();
            penta.addPoint(550, 400);
            penta.addPoint(500, 350);
            penta.addPoint(600, 350);
            penta.addPoint(650, 400);
            g.fillPolygon(penta);
        }

        for (int k = 0; k < 1; k += 1) {
            int c = rand.nextInt(255);
            int c2 = rand.nextInt(255);
            int c3 = rand.nextInt(255);

            g.setColor(new Color(c, c2, c3));

            Polygon penta2 = new Polygon();
            penta2.addPoint(650, 400);
            penta2.addPoint(600, 350);
            penta2.addPoint(600, 400);
            g.fillPolygon(penta2);
        }

        for (int k = 0; k < 1; k += 1) {
            int c = rand.nextInt(255);
            int c2 = rand.nextInt(255);
            int c3 = rand.nextInt(255);

            g.setColor(new Color(c, c2, c3));

            Polygon penta3 = new Polygon();
            penta3.addPoint(500, 350);
            penta3.addPoint(500, 450);
            penta3.addPoint(550, 500);
            penta3.addPoint(550, 400);
            g.fillPolygon(penta3);
        }
    }

}



    
 
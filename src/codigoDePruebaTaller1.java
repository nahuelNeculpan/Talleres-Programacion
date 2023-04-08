import edu.princeton.cs.stdlib.StdDraw;
import java.awt.*;
public class codigoDePruebaTaller1 {
    public static void main(String[] args) {
        double min = -1.0;
        double max = 1.0;
        StdDraw.setXscale(min,max);
        StdDraw.setYscale(min,max);
        StdDraw.enableDoubleBuffering();
        //Variables para linea numero 1.
        double x0 = min + (max-min) * Math.random();
        double y0 = min + (max-min) * Math.random();
        double x1 = min + (max-min) * Math.random();
        double y1 = min + (max-min) * Math.random();
        double velocidadX0 = Math.random() / 250;
        double velocidadY0 = Math.random() / 250;
        double velocidadX1 = Math.random() / 250;
        double velocidadY1 = Math.random() / 250;
        //Variables para linea numero 2.
        double x2 = x0-x0/100;
        double y2 = y0-x0/100;
        double x3 = x1-x0/100;
        double y3 = y1-x0/100;
        double velocidadX2 = velocidadX0;
        double velocidadY2 = velocidadY0;
        double velocidadX3 = velocidadX1;
        double velocidadY3 = velocidadY1;
        //Variables para linea numero 3.
        double x4 = x0-x0/100*2;
        double y4 = y0-y0/100*2;
        double x5 = x1-x1/100*2;
        double y5 = y1-x1/100*2;
        double velocidadX4 = velocidadX2;
        double velocidadY4 = velocidadY2;
        double velocidadX5 = velocidadX3;
        double velocidadY5 = velocidadY3;
        //Variables para linea numero 4.
        double x6 = x0-x0/100*3;
        double y6 = y0-y0/100*3;
        double x7 = x1-x1/100*3;
        double y7 = y1-x1/100*3;
        double velocidadX6 = velocidadX4;
        double velocidadY6 = velocidadY4;
        double velocidadX7 = velocidadX5;
        double velocidadY7 = velocidadY5;
        //Variables para linea numero 5.
        double x8 = x0-x0/100*4;
        double y8 = y0-y0/100*4;
        double x9 = x1-x1/100*4;
        double y9 = y1-x1/100*4;
        double velocidadX8 = velocidadX6;
        double velocidadY8 = velocidadY6;
        double velocidadX9 = velocidadX7;
        double velocidadY9 = velocidadY7;
        //Variables para linea numero 6.
        double x10 = x0-x0/100*5;
        double y10 = y0-y0/100*5;
        double x11 = x1-x1/100*5;
        double y11 = y1-x1/100*5;
        double velocidadX10 = velocidadX8;
        double velocidadY10 = velocidadY8;
        double velocidadX11 = velocidadX9;
        double velocidadY11 = velocidadY9;

        double longitudLinea = 0.05;

        while(true) {
            if (Math.abs(x0 + velocidadX0) > 1.0 - longitudLinea) {
                velocidadX0 = -velocidadX0;
            }
            if (Math.abs(y0 + velocidadY0) > 1.0 - longitudLinea) {
                velocidadY0 = -velocidadY0;
            }
            if (Math.abs(x1 + velocidadX1) > 1.0 - longitudLinea) {
                velocidadX1 = -velocidadX1;
            }
            if (Math.abs(y1 + velocidadY1) > 1.0 - longitudLinea) {
                velocidadY1 = -velocidadY1;
            }
            x0 += velocidadX0;
            y0 += velocidadY0;
            x1 += velocidadX1;
            y1 += velocidadY1;
            if (Math.abs(x2 + velocidadX2) > 1.0 - longitudLinea) {
                velocidadX2 = -velocidadX2;
            }
            if (Math.abs(y2 + velocidadY2) > 1.0 - longitudLinea) {
                velocidadY2 = -velocidadY2;
            }
            if (Math.abs(x3 + velocidadX3) > 1.0 - longitudLinea) {
                velocidadX3 = -velocidadX3;
            }
            if (Math.abs(y3 + velocidadY3) > 1.0 - longitudLinea) {
                velocidadY3 = -velocidadY3;
            }
            x2 += velocidadX2;
            y2 += velocidadY2;
            x3 += velocidadX3;
            y3 += velocidadY3;
            if (Math.abs(x4 + velocidadX4) > 1.0 - longitudLinea) {
                velocidadX4 = -velocidadX4;
            }
            if (Math.abs(y4 + velocidadY4) > 1.0 - longitudLinea) {
                velocidadY4 = -velocidadY4;
            }
            if (Math.abs(x5 + velocidadX5) > 1.0 - longitudLinea) {
                velocidadX5 = -velocidadX5;
            }
            if (Math.abs(y5 + velocidadY5) > 1.0 - longitudLinea) {
                velocidadY5 = -velocidadY5;
            }
            x4 += velocidadX4;
            y4 += velocidadY4;
            x5 += velocidadX5;
            y5 += velocidadY5;
            if (Math.abs(x6 + velocidadX6) > 1.0 - longitudLinea) {
                velocidadX6 = -velocidadX6;
            }
            if (Math.abs(y6 + velocidadY6) > 1.0 - longitudLinea) {
                velocidadY6 = -velocidadY6;
            }
            if (Math.abs(x7 + velocidadX7) > 1.0 - longitudLinea) {
                velocidadX7 = -velocidadX7;
            }
            if (Math.abs(y7 + velocidadY7) > 1.0 - longitudLinea) {
                velocidadY7 = -velocidadY7;
            }
            x6 += velocidadX6;
            y6 += velocidadY6;
            x7 += velocidadX7;
            y7 += velocidadY7;
            if (Math.abs(x8 + velocidadX8) > 1.0 - longitudLinea) {
                velocidadX8 = -velocidadX8;
            }
            if (Math.abs(y8 + velocidadY8) > 1.0 - longitudLinea) {
                velocidadY8 = -velocidadY8;
            }
            if (Math.abs(x9 + velocidadX9) > 1.0 - longitudLinea) {
                velocidadX9 = -velocidadX9;
            }
            if (Math.abs(y9 + velocidadY9) > 1.0 - longitudLinea) {
                velocidadY9 = -velocidadY9;
            }
            x8 += velocidadX8;
            y8 += velocidadY8;
            x9 += velocidadX9;
            y9 += velocidadY9;
            if (Math.abs(x10 + velocidadX10) > 1.0 - longitudLinea) {
                velocidadX10 = -velocidadX10;
            }
            if (Math.abs(y10 + velocidadY10) > 1.0 - longitudLinea) {
                velocidadY10 = -velocidadY10;
            }
            if (Math.abs(x11 + velocidadX11) > 1.0 - longitudLinea) {
                velocidadX11 = -velocidadX11;
            }
            if (Math.abs(y11 + velocidadY11) > 1.0 - longitudLinea) {
                velocidadY11 = -velocidadY11;
            }
            x10 += velocidadX10;
            y10 += velocidadY10;
            x11 += velocidadX11;
            y11 += velocidadY11;
            StdDraw.setPenColor(Color.BLUE);
            StdDraw.line(x0,y0,x1,y1);
            StdDraw.setPenColor(Color.GREEN);
            StdDraw.line(x2,y2,x3,y3);
            StdDraw.setPenColor(Color.CYAN);
            StdDraw.line(x4,y4,x5,y5);
            StdDraw.setPenColor(Color.YELLOW);
            StdDraw.line(x6,y6,x7,y7);
            StdDraw.setPenColor(Color.GRAY);
            StdDraw.line(x8,y8,x9,y9);
            StdDraw.setPenColor(Color.MAGENTA);
            StdDraw.line(x10,y10,x11,y11);
            StdDraw.show();
            StdDraw.clear();
        }
    }
}
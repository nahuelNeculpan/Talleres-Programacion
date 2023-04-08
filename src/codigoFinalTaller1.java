import edu.princeton.cs.stdlib.StdDraw;
import java.awt.*;
public class codigoFinalTaller1 {
    public static void main(String[] args) {
        //Variables para definir la pantalla del StdDraw.
        double min = -1.0;
        double max = 1.0;
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        StdDraw.enableDoubleBuffering();
        //Variables para crear de manera random la linea lider de las demas.
        double x0 = min + (max - min) * Math.random();
        double y0 = min + (max - min) * Math.random();
        double x1 = min + (max - min) * Math.random();
        double y1 = min + (max - min) * Math.random();
        //Las velocidades las dividi en 20 ya que al ser random podria dar una velocidad excesiva, esto lo regula.
        double velocidadX0 = Math.random()/20;
        double velocidadY0 = Math.random()/20;
        double velocidadX1 = Math.random()/20;
        double velocidadY1 = Math.random()/20;
        //Defini los colores para cada linea en el vector colors
        Color[] colors = {Color.BLUE, Color.CYAN, Color.GREEN, Color.ORANGE, Color.MAGENTA, Color.RED};
        while (true) {
            if (Math.abs(x0 + velocidadX0) > 1.0) {
                velocidadX0 = -velocidadX0;
            }
            if (Math.abs(y0 + velocidadY0) > 1.0) {
                velocidadY0 = -velocidadY0;
            }
            if (Math.abs(x1 + velocidadX1) > 1.0) {
                velocidadX1 = -velocidadX1;
            }
            if (Math.abs(y1 + velocidadY1) > 1.0) {
                velocidadY1 = -velocidadY1;
            }
            x0 += velocidadX0;
            y0 += velocidadY0;
            x1 += velocidadX1;
            y1 += velocidadY1;
            //Subprograma que crea las demas lineas, ademas de darle el color a las mismas.
            lineasFinales(x0, y0, x1, y1, velocidadX0, velocidadY0, velocidadX1, velocidadY1, colors);
            StdDraw.show();
            StdDraw.clear();
        }
    }
    private static void lineasFinales (double x0, double y0, double x1, double y1, double velocidadX0, double velocidadY0,
                                       double velocidadX1, double velocidadY1, Color[] colores) {
        for (int i = 0; i < 6; i++) { //Ciclo para poder crear y mostrar las demas lineas.
            if (Math.abs(x0 + velocidadX0) > 1.0) {
                velocidadX0 = -velocidadX0;
            }
            if (Math.abs(y0 + velocidadY0) > 1.0) {
                velocidadY0 = -velocidadY0;
            }
            if (Math.abs(x1 + velocidadX1) > 1.0) {
                velocidadX1 = -velocidadX1;
            }
            if (Math.abs(y1 + velocidadY1) > 1.0) {
                velocidadY1 = -velocidadY1;
            }
            x0 += velocidadX0;
            y0 += velocidadY0;
            x1 += velocidadX1;
            y1 += velocidadY1;
            StdDraw.setPenColor(colores[i]); //De esta manera le di un color definido a las lineas.
            StdDraw.line(x0, y0, x1, y1);
            StdDraw.pause(5);
        }
    }
}
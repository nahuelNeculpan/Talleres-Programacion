import edu.princeton.cs.stdlib.StdDraw;
import java.awt.*;
public class codigo2DePruebaTaller1 {
    public static void main(String[] args) {
        //Varibales y codigo para definir la ventana.
        double min = -1.0;
        double max = 1.0;
        StdDraw.setXscale(min,max);
        StdDraw.setYscale(min,max);
        StdDraw.enableDoubleBuffering();
        //Variables para linea numero 1 la cual sera tambien la que se usara de ejemplo para las demas.
        double x0 = min + (max-min) * Math.random();
        double y0 = min + (max-min) * Math.random();
        double x1 = min + (max-min) * Math.random();
        double y1 = min + (max-min) * Math.random();
        /*En las siguientes variables dividi por el numero 200 para que la velocidad al azar que se le pueda otorgar
        no sea tan rapida y se pueda mostrar bien las lineas*/
        double velocidadX0 = Math.random() / 200;
        double velocidadY0 = Math.random() / 200;
        double velocidadX1 = Math.random() / 200;
        double velocidadY1 = Math.random() / 200;
        double longitudLinea = 0.05;
        //Ciclo para mostrar y ejecutar la primera linea.
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
            /*La variable "numero" la defini para poder cambiar las posiciones de las lineas, es la forma que encontre
            para poder usar las mismas variables y tenerlas en posiciones distinas.*/
            StdDraw.setPenColor(Color.BLUE);
            StdDraw.line(x0,y0,x1,y1);
            StdDraw.setPenColor(Color.GREEN);
            lineaFinal(x0,y0,x1,y1,velocidadX0,velocidadY0,velocidadX1,velocidadY1,10,longitudLinea);
            StdDraw.setPenColor(Color.CYAN);
            lineaFinal(x0,y0,x1,y1,velocidadX0,velocidadY0,velocidadX1,velocidadY1,20,longitudLinea);
            StdDraw.setPenColor(Color.YELLOW);
            lineaFinal(x0,y0,x1,y1,velocidadX0,velocidadY0,velocidadX1,velocidadY1,30,longitudLinea);
            StdDraw.setPenColor(Color.GRAY);
            lineaFinal(x0,y0,x1,y1,velocidadX0,velocidadY0,velocidadX1,velocidadY1,40,longitudLinea);
            StdDraw.setPenColor(Color.MAGENTA);
            lineaFinal(x0,y0,x1,y1,velocidadX0,velocidadY0,velocidadX1,velocidadY1,50,longitudLinea);
            /*Los colores ya que tienen que ser distintos pero no se especifica si al azar, deje cada linea con
            un color predefinido.*/
            StdDraw.show();
            StdDraw.clear();
        }
    }
    static void lineaFinal (double x0,double y0,double x1,double y1,double vx0,double vy0,double vx1,double vy1,
                            double numero,double longitudLinea){
        //El subprograma que use crea las lineas con similitud a la primera pero cambiando un poco el tamaño de la misma.
        double x2 = x0 - x0/100*numero;
        double y2 = y0 - y0/100*numero;
        double x3 = x1 - x1/100*numero;
        double y3 = y1 - y1/100*numero;
        if (Math.abs(x2 + vx0) > 1.0 - longitudLinea) {
            vx0 = -vx0;
        }
        if (Math.abs(y2 + vy0) > 1.0 - longitudLinea) {
            vy0 = -vy0;
        }
        if (Math.abs(x3 + vx1) > 1.0 - longitudLinea) {
            vx1 = -vx1;
        }
        if (Math.abs(y3 + vy1) > 1.0 - longitudLinea) {
            vy1 = -vy1;
        }
        /*Se usan los datos de la primera linea pero cambiando algunos datos como la posicion, pero manteniendo
        la velocidad de esta.*/
        x2 += vx0;
        y2 += vy0;
        x3 += vx1;
        y3 += vy1;
        StdDraw.line(x2,y2,x3,y3);
        //La linea queda lista para poder ser mostrada por el main.
    }
}
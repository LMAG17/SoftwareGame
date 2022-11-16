/**
* Clase usada para el objeto botón personalizado como modelo
*En: Nov 15 de 2022
*@autor: Luis Miguel Álvarez, Cristian Mesa
*@documentador: Fabián Melo, Andres Mauricio Silva
*@QA: Martha Mera, Luz Molina
*/
package SoftwareGame.Models;
/**
 * Pertenece al paquete models
 */


import javax.swing.*;
import java.awt.*;
/**
 * Usa las librerías de Java para manejo de interfaces gráficas
 */

public  class CustomButton extends JButton {
    public CustomButton(String text) {
        super(text);
        setContentAreaFilled(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setPaint(new GradientPaint(
                new Point(0, 0),
                getBackground(),
                new Point(0, getHeight()/3),
                Color.WHITE));
        g2.fillRect(0, 0, getWidth(), getHeight()/3);
        g2.setPaint(new GradientPaint(
                new Point(0, getHeight()/3),
                Color.WHITE,
                new Point(0, getHeight()),
                getBackground()));
        g2.fillRect(0, getHeight()/3, getWidth(), getHeight());
        g2.dispose();

        super.paintComponent(g);
    }
}
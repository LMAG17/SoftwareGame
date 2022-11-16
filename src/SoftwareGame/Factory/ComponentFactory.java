/**
 * Clase que se encarga de administrar los componentes mediante getter de las constantes
 *En: Nov 14 de 2022
 *@autor: Luis Miguel Álvarez, Cristian Mesa
 *@documentador: Fabián Melo, Andres Mauricio Silva
 *@QA: Martha Mera, Luz Molina
 *Desc: En esta clase se almacenan los componentes a ser usados en la interfaz del juego
 */

package SoftwareGame.Factory;

/**
 * Se encuentra dentro del paquete Factory
 */

import SoftwareGame.Constants.Fonts;
import SoftwareGame.Constants.Labels;

/**
 * Usa las librerías propias del juego
 */

import javax.swing.*;
import java.awt.*;

/**
 * Usa las librerías de Java para manejo de interfaces gráficas
 */

public class ComponentFactory {

    public static JLabel getTitle(String titleText) {
        JLabel title = new JLabel(titleText);
        title.setFont(Fonts.title);
        title.setForeground(Color.white);
        return title;
    }
    /**
     * Gestiona todos los componentes de tipo Etiqueta para ser usado en las demás clases de Título
     * @param titleText
     * @return
     */


    public static JLabel getSubTitle(String subTitleText) {
        JLabel title = new JLabel(subTitleText);
        title.setFont(Fonts.subTitle);
        title.setForeground(Color.white);
        return title;
    }
    /**
     * Gestiona todos los componentes de tipo Etiqueta para ser usado en las demás clases de subtítulo
     * @param subTitleText
     * @return
     */

    public static JLabel getDescription(String descriptionText) {
        JLabel title = new JLabel(descriptionText);
        title.setFont(Fonts.description);
        title.setForeground(Color.white);
        return title;
    }

    /**
     * Gestiona todos los componentes de tipo Etiqueta para ser usado en las demás clases de Descripción
     * @param descriptionText
     * @return
     */

    public static JFrame presentInNewFrame(JPanel panel) {
        JFrame frame = new JFrame();
        if (panel != null) {
            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle(Labels.gameTitle);
            frame.getContentPane().setBackground(new Color(112, 177, 181));
            frame.pack();
            frame.setVisible(true);
        }
        return frame;
    }

    /**
     * Gestiona todos los componentes de tipo Etiqueta para ser usado en las demás clases de Panel
     * @param panel
     * @return
     */
}

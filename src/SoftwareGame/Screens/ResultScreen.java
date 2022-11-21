/**
 * Método Main
 * En: Nov 21 de 2022
 *
 * @autor: Luis Miguel Álvarez
 */

package SoftwareGame.Screens;

import SoftwareGame.Constants.Colors;
import SoftwareGame.Constants.Labels;
import SoftwareGame.Factory.ComponentFactory;
import SoftwareGame.Models.Player;

import javax.swing.*;
import java.awt.*;

import static SoftwareGame.Data.Data.rightAnswerPoints;
import static SoftwareGame.Data.Data.wrongAnswerPoints;

/**
 * Clase para mostrar el resultado de la respuesta
 */
public class ResultScreen {
    static JFrame frame;//Marco que muestra la informacion
    static JPanel panel = new JPanel();//Panel que se muestra en el marco
    static JLabel title = ComponentFactory.getTitle("");//Titulo que comunica el resultado
    static JLabel points = ComponentFactory.getSubTitle("");//Puntos obtenidos

    /**
     * Método que muestra el resultado de la respuesta
     */
    public static void show(Player player, boolean itsOkay) {
        panel.removeAll();//Se remueven los elementos para evitar duplicidad
        panel.setBackground(Colors.backgroundColor);//Se setea el color del fondo
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));//Se le da un espacio en blanco al reder
        panel.setLayout(new GridLayout(0, 1));//Se setea el tipo de layout

        title.setText(itsOkay ? Labels.resumeRightAnswer : Labels.resumeWrongAnswer); //Se valida el resultado de la pregunta para mostrar un mensaje o el otro
        panel.add(title);//Se agrega el mensaje al panel
        points.setText(player.getName() + Labels.obtain + (itsOkay ? rightAnswerPoints : wrongAnswerPoints) + Labels.point);//muestra los puntos obtenidos
        panel.add(points);//añade la vista de los puntos
        frame = ComponentFactory.presentInNewFrame(panel);//presenta el pane generado
    }

    /**
     * Oculta la pantalla de resumen
     */
    public static void dispose() {
        frame.dispose();
    }
}

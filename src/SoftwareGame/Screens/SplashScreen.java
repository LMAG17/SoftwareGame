/**
 * Clase con la pantalla de Bienvenida
 * En: Nov 12 de 2022
 *
 * @autor: Luis Miguel Álvarez, Cristian Mesa
 * @documentador: Fabián Melo, Andres Mauricio Silva
 * @QA: Martha Mera, Luz Molina
 */

/**
 * Pertenece al paquete de Screens que incluye las pantallas del juego
 */
package SoftwareGame.Screens;
/**
 * Clase que muestra la pantalla inicial del juego haciendo uso de librerías de Java para manejo de interfaces gráficas
 */
import SoftwareGame.Constants.Colors;
import SoftwareGame.Constants.Labels;
import SoftwareGame.Factory.ComponentFactory;
import SoftwareGame.Navigation.NavigationManager;

import javax.swing.*;
import java.awt.*;

public class SplashScreen {
    static JFrame frame; //Componente de la librería Swing que crea una ventana
    static JPanel setupGamePanel = new JPanel(); //Contenedor de objetos de interfaz gráfica

    public static JPanel setupGame() {
        setupGamePanel.removeAll();
        JButton initButton = new JButton(Labels.initGame); //Se crea un nuevo objeto llamado initButton de tipo Botón
        initButton.addActionListener(e -> { //el botón estará pendiente de alguna acción con el Listener
            NavigationManager.initGame(); //Inicia el juego
        });

        setupGamePanel.setBackground(Colors.backgroundColor); //Establece el color de fondo de la pantalla
        setupGamePanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50)); //Establece los bordes
        setupGamePanel.setLayout(new GridLayout(0, 1)); //Distribuye el contenido del panel

        setupGamePanel.add(ComponentFactory.getTitle(Labels.gameTitle)); //se agrega el título a través del gestor de componentes
        setupGamePanel.add(initButton); //agrega el botón de iniciar

        frame = ComponentFactory.presentInNewFrame(setupGamePanel); //Presenta la nueva pantalla

        return setupGamePanel; //Devuelve el botón y el título
    }
    /**Este método hace que se desaparezca la pantalla cuando el usuario interactua con otra.*/
    public static void hideSplashScreen() {
        frame.dispose();
    }

}

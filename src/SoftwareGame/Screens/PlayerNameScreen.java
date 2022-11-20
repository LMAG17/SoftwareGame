/**
* Clase con las pantallas de selección de jugadores
*En: Nov 15 de 2022
*@autor: Luis Miguel Álvarez, Cristian Mesa
*@documentador: Fabián Melo, Andres Mauricio Silva
*@QA: Martha Mera, Luz Molina
*/

package SoftwareGame.Screens;
/**
 * Pertenece al paquete de Screens que incluye las pantallas del juego
 */

import SoftwareGame.Constants.Colors;
import SoftwareGame.Factory.ComponentFactory;
import SoftwareGame.Models.Player;
import SoftwareGame.Navigation.NavigationManager;

/**
 * Usa las librerías propias del juego
 */



import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Usa las librerías de Java para manejo de interfaces gráficas
 */

public class PlayerNameScreen { 
    static JPanel panel = new JPanel(); //Inserta un nuevo panel
    static TextField playerOneTextField = new TextField(); //Genera un campo tipo texto para jugador uno
    static TextField playerTwoTextField = new TextField(); //Genera un campo tipo texto para jugador dos

    static JFrame frame; //Genera un nuevo frame

    public static void getPlayersName(int players) { //método que establece la cantidad de jugadores  y sus nombres

        JLabel title = ComponentFactory.getTitle("Escoge un nombre para los jugadores"); //Establece el nombre de los jugadores
        panel.add(title); 

        playerOneTextField.setText("Jugador 1"); //Establece el nombre del jugador uno (defecto Jugador 1)
        panel.add(playerOneTextField);

        if (players == 2) {
            playerTwoTextField.setText("Jugador 2"); //Establece el nombre del jugador uno (defecto Jugador 1)
            panel.add(playerTwoTextField);
        }

        JButton submitButton = new JButton("Aceptar"); //Crea el botón aceptar para confirmar el número de jugadores
        submitButton.addActionListener(e -> { //Genera el evento que estará atento al click en el botón
            NavigationManager.setPLayersName(setPlayersName(players)); //Establece los nombres 
        });

        panel.add(submitButton); //Añade el botón de confirmar 

        panel.setBackground(Colors.backgroundColor); //Establece el fondo
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50)); //Establece laas dimensiones a partir de los bordes
        panel.setLayout(new GridLayout(0, 1)); 
        frame = ComponentFactory.presentInNewFrame(panel); 

    }
    

    public static void dispose() {
        frame.dispose(); //se deshace de la vista
    }

    public static ArrayList<Player> setPlayersName(int players) { //almacena en un array la cantidad de jugadores
        ArrayList<Player> pls = new ArrayList<>();
        pls.add(new Player(playerOneTextField.getText()));
        if (players == 2) { //condición para dos jugadores
            pls.add(new Player(playerTwoTextField.getText()));
        }
        return pls;
    }

}

/**
 * Método Main
 * En: Nov 12 de 2022
 *
 * @autor: Luis Miguel Álvarez
 */

package SoftwareGame;

import SoftwareGame.Models.Player;
import SoftwareGame.Navigation.NavigationManager;

import java.util.ArrayList;

/**
 *Clase principal del juego
 */

public class Main {
    /**Define una lista de jugadores*/
    public static ArrayList<Player> players;
    /**Identifica el jugador actual*/
    public static int currentPlayer = 0;
    /**
     *Metodo que ejecuta el juego
     */
    public static void main(String[] args) {
        /**Llama al gestor de navegacion e inicia el juego*/
        NavigationManager.showSplashScreen();
    }
}

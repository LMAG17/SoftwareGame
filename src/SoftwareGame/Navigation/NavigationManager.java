/**
*Clase Navigation Manager
*En: Nov 12 de 2022
*@autor: Luis Miguel Álvarez, Cristian Mesa
*@documentador: Fabián Melo, Andres Mauricio Silva
*@QA: Martha Mera, Luz Molina
 */
package SoftwareGame.Navigation;
/**
 * Perteneciente al paquete Software Game
 */


import SoftwareGame.Main;
import SoftwareGame.Models.Player;
import SoftwareGame.Screens.PlayerNameScreen;
import SoftwareGame.Screens.PlayersScreen;
import SoftwareGame.Screens.QuestionScreen;
import SoftwareGame.Screens.SplashScreen;

/**
 * Importa librerías propias del juego
 */

import java.util.ArrayList;

/**
 * Importa las librerías de Java para manejo de arreglos
 */

public class NavigationManager {
    public static void showSplashScreen() {
        SplashScreen.setupGame();
    }

    /**
     * Muestra la pantalla principal
     */

    public static void initGame() {
        SplashScreen.hideSplashScreen();
        PlayersScreen.showPlayerSelection();
    }

    /**
     * Muestra la pantalla de selección de jugadores
     * @param players
     */

    public static void setPlayers(int players) {
        PlayersScreen.dispose();
        PlayerNameScreen.getPlayersName(players);
    }

    /**
     * Establece la cantidad de jugadores (1 o 2)
     * @param players
     */

    /*
    * setPlayers es una funcion que se debe ejecutar cuando ya tengamos definidos los nombres
    * de los jugadores
    * {}
     * @param players debe ser un arreglo de jugadores con el nombre
     * @throws falla siempre que no reciba la lista de jugadores
     *
     */
    public static void setPLayersName(ArrayList<Player> players) {
        Main.players = players;
        PlayerNameScreen.dispose();
        QuestionScreen.showQuestion();
    }

    /**
     * Establece el nombre del jugador o jugadores
     */


}

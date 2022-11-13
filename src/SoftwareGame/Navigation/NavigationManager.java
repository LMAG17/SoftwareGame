package SoftwareGame.Navigation;

import SoftwareGame.Main;
import SoftwareGame.Models.Player;
import SoftwareGame.Screens.PlayerNameScreen;
import SoftwareGame.Screens.PlayersScreen;
import SoftwareGame.Screens.QuestionScreen;
import SoftwareGame.Screens.SplashScreen;

import java.util.ArrayList;

public class NavigationManager {
    public static void showSplashScreen() {
        SplashScreen.setupGame();
    }

    public static void initGame() {
        SplashScreen.hideSplashScreen();
        PlayersScreen.showPlayerSelection();
    }

    public static void setPlayers(int players) {
        PlayersScreen.dispose();
        PlayerNameScreen.getPlayersName(players);
    }

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


}

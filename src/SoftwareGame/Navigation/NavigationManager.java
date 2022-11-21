/**
 * Clase Navigation Manager
 * En: Nov 12 de 2022
 *
 * @autor: Luis Miguel Álvarez, Cristian Mesa
 * @documentador: Fabián Melo, Andres Mauricio Silva
 * @QA: Martha Mera, Luz Molina
 */
package SoftwareGame.Navigation;

import SoftwareGame.Main;
import SoftwareGame.Models.Player;
import SoftwareGame.Screens.*;

import java.util.ArrayList;

import static SoftwareGame.Data.Data.*;
import static SoftwareGame.Utils.Timeout.setTimeout;

/**
 * Importa las librerías de Java para manejo de arreglos
 */

public class NavigationManager {

    /**
     * Muestra la pantalla principal
     */
    public static void showSplashScreen() {
        SplashScreen.setupGame();
    }

    /**
     * Inicializa el juego
     */
    public static void initGame() {
        SplashScreen.hideSplashScreen();
        PlayersScreen.showPlayerSelection();
    }

    /**
     * Establece la cantidad de jugadores
     *
     * @param players
     */
    public static void setPlayers(int players) {
        PlayersScreen.dispose();
        PlayerNameScreen.getPlayersName(players);
    }

    /**
     * Gestiona los jugadores despues de seleccionada la cantidad
     *
     * @param players
     */
    public static void setPLayersName(ArrayList<Player> players) {
        Main.players = players;
        PlayerNameScreen.dispose();
        QuestionScreen.showQuestion();
    }

    /**
     * Gestiona las respuestas de los usuarios
     *
     * @param isRightAnswer
     * @param currentQuestion
     */
    public static void submitAnswer(boolean isRightAnswer, int currentQuestion) {
        QuestionScreen.questions.remove(currentQuestion);
        Player player = Main.players.get(Main.currentPlayer);
        int currentPoints = player.getPoints() + rightAnswerPoints;

        QuestionScreen.dispose();

        if (Main.players.size() > 1 && currentPoints >= multiplayerPoints) {
            GameOverScreen.show(player, true);
        } else if (Main.players.size() == 1 && currentPoints >= individualPoints) {
            GameOverScreen.show(player, true);
        } else if (Main.players.size() == 1 && !isRightAnswer) {
            GameOverScreen.show(player, false);
        } else {
            if (isRightAnswer) {
                Main.players.get(Main.currentPlayer).setPoints(currentPoints);
            } else {
                Main.players.get(Main.currentPlayer).setPoints(player.getPoints() + wrongAnswerPoints);
            }

            if (Main.players.size() > 1) {
                Main.currentPlayer = Main.currentPlayer == 0 ? 1 : 0;
            }

            ResultScreen.show(player, isRightAnswer);
            setTimeout(() -> {
                ResultScreen.dispose();
                QuestionScreen.showQuestion();
            }, 2000);
        }
    }

}

/**
* Clase usada para el objeto jugador personalizado como modelo
*En: Nov 15 de 2022
*@autor: Luis Miguel Álvarez, Cristian Mesa
*@documentador: Fabián Melo, Andres Mauricio Silva
*@QA: Martha Mera, Luz Molina
*/
package SoftwareGame.Models;

public class Player {
    public int points; //crea el atributo puntaje del jugador
    private String name;

    public Player(String name) { //crea el atributo nombre del jugador
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}

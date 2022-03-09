/**
 * NOTE:
 * This is a class representing a Player
 * in a team (of players).
 */
package Lab_05;

import java.util.ArrayList;

public class Player extends ArrayList<Player> {
    /**
     * Our class will have two fields.
     * Both are set to private and will be
     * provided getters and setters for
     * usability in the program.
     */
    private String playerName;
    private int playerPosition;

    /**
     * Our class will be built with
     * two constructors:
     *
     *  + One that takes no arguments
     *  and sets a default name and position.
     *  + And another one that takes a String name
     *  and an integer position as parameters.
     */
    public Player(){
        this.playerName = "Default";
        this.playerPosition = 0;
    }

    /**
     * Player class second constructor
     * @param name
     * @param position
     */
    public Player(String name, int position){
        this.playerName = name;
        this.playerPosition = position;
    }

    /**
     * getter for the private name of the player.
     * @return name of the player
     */
    public String getPlayerName(){
        return playerName;
    }

    /**
     * setter for the private name of the player.
     * @param name
     */
    public void setPlayerName(String name){
        this.playerName = name;
    }

    /**
     * getter for the private position of the player.
     * @return position of the position.
     */
    public int getPlayerPosition(){
        return playerPosition;
    }

    /**
     * setter for the private position of the player.
     * @param position
     */
    public void setPlayerPosition(int position){
        this.playerPosition = position;
    }

    /**
     * Method to check if two players are EQUAL.
     * Comparison is based on name and position of the player.
     * @param o
     * @return True or False
     */
    @Override
    public boolean equals(Object o){

        if (o instanceof Player) {
            if (((Player) o).getPlayerName() == this.getPlayerName()
                    && ((Player) o).getPlayerPosition() == this.getPlayerPosition()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /**
     * toString method to showcase our players.
     * @return player's name and position.
     */
    @Override
    public String toString(){
        return "\nPlayer's name: " + this.playerName + ",\tPosition: " + this.playerPosition;
    }

}



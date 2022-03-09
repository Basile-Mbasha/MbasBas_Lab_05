/**
 * NOTE:
 *  This is a class representing a Team
 *  of players. It will extend our previous
 *  class 'Player' method and fields.
 */
package Lab_05;

import java.util.*;

public class Team extends Player {
    /**
     * Our class will have three fields.
     * + Two are private, getters and setters
     *  will be provided.
     * + One is a final variable to avoid changes.
     */

    final int MAX_PLAYERS = 17;
    private String teamName;
    private ArrayList<Player> players = new ArrayList<Player>( MAX_PLAYERS );

    /**
     * Just like 'Player', this class too will have two constructors.
     * One will no arguments and one with a String name parameter.
     *
     * NOTE:
     *  + When an argument is passed it becomes a PARAMETER.
     */

    /**
     * Team class first constructor
     */
    public Team() {
        this.teamName = "Default";
    }

    /**
     * Team class second constructor
     * @param name
     */
    public Team(String name) {
        this.teamName = name;
    }

    /**
     * getter for private field teamName
     * @return name of the team.
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * setter for private field teamName
     * @param team
     */
    public void setTeamName(String team) {
        this.teamName = team;
    }

    /**
     * setter for private field List of players.
     * @param players
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * getter for private field List of players.
     * @return List of players.
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * Method to check if a player
     * is within a particular Team.
     * @param p, Player p.
     * @return true or false.
     */
    public boolean contains(Player p) {
        Iterator<Player> it = players.iterator();

        while (it.hasNext()) {
            Player i = it.next();
            if (i.getPlayerPosition() == p.getPlayerPosition()
                    && i.getPlayerName() == p.getPlayerName())
                return true;
        }
        return false;
    }

    /**
     * Method to insert/add a Player in a Team.
     * @param player
     *
     * NOTE:
     *  + Players in a team cannot exceed 17.
     *  + Two players cannot be added in the same team.
     */
    public void insert(Player player) {

            if ((!(players.contains( player ))) && players.size() < MAX_PLAYERS) {
                players.add( player );
            } else {
                try {
                    boolean b = (players.contains( player )) && players.size() > MAX_PLAYERS;
                    //int result = players.size() - 17;
                    makeError();
                    //System.out.println("\n"+ result + " players in excess :( ");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
    }

    /**
     * Method to catch an error if set conditions are not met.
     * @throws Exception
     */
    public void makeError() throws Exception {
        throw new Exception( "\nThis is an exception message." );
    }

    /**
     * Method to display our players in a particular Team.
     * @return List of players.
     */
    @Override
    public Iterator<Player> iterator() {
        Iterator<Player> it = players.iterator();

        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
        return it;
    }

    /**
     * toString method to display content
     * of a particular Team.
     * @return name of the team, list of players,
     * and other information about the team.
     */
    @Override
    public String toString() {
        int count = 0;
        int numPlayers = 0;
        for (int i = 0; i < players.size(); i++) {
            count++;
            numPlayers = count;
        }
        return "\nTeam = " + teamName +
                ",\nPlayers = " + players +
                "\nNumber of players in this team = " + numPlayers +
                "\nA team cannot have more than " + MAX_PLAYERS + " players";
    }

}


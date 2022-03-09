/**
 * Name: Basile Mbasha
 * Date: March 6th, 2022
 * Description: This program will:
 *      - create a set of players
 *      - create a team of players
 *      - create a testing class
 *      for code testing.
 *
 *      * a note will be provided in
 *      each class' first line to
 *      describe what it is does and how.
 *
 * NOTE:
 *  + Program is divided in three classes,
 *    all stored in library (Lab_05).
 *    1.Player - players in a team
 *    2.Team - team of players
 *    3.Test - test class for code testing.
 *
 *  + Players in this program are
 *   assumed to be 'basketball players'.
 *
 */
package Lab_05;

public class Test {
    /**
     * main method for testing method implementation
     * in previous classes: 'Team' and 'Player'.
     */
    public static void main(String[] args) {

        /**
         * Let us start by creating
         * an object of both classes
         * Player and Team.
         *
         * And add/insert players in
         * both Teams A and B for testing.
         */

        Player p = new Player();
        Player p0 = new Player();
        Player p1 = new Player( "Lebron James", 1 );
        Player p2 = new Player( "Stephen Curry", 2 );
        Player p3 = new Player( "D. Wayne Wade", 3 );
        Player p4 = new Player( "Oscar Robertson", 4 );
        Player p5 = new Player( "Bradley Beal ", 5 );
        Player p6 = new Player( "Kevin Durant", 6 );
        Player p7 = new Player( "Anthony Davis", 7 );
        Player p8 = new Player( "Westbrook R.", 8 );
        Player p9 = new Player( "Kyrie Irving", 9 );
        Player p10 = new Player( "James Harden", 10 );

        Team teamA = new Team( "Tigers");
        Team teamB = new Team();

        /**
         * Now let's test
         * the insert method on TeamB.
         */
        teamB.insert( p1 );
        teamB.insert( p2 );
        teamB.insert( p3 );
        teamB.insert( p4 );
        teamB.insert( p5 );
        teamB.insert( p6 );
        teamB.insert( p7 );
        teamB.insert( p8 );
        teamB.insert( p9 );
        teamB.insert( p10 );

        // display the whole team
        System.out.println("\n \" Team content \" ");
        System.out.println( teamB );

        /**
         * When two players built with a default constructor
         * are added to the same team, regardless of its name.
         * An exception will be generated since both have
         * the same default name & position = 0.
         *
         * NOTE:
         *    + Two instances of Player are
         *      equal when the name and position
         *      matches/are equal.
         */

        teamA.insert( p );
        teamA.insert( p0 );
        System.out.println(teamA);


        /**
         * Remember teamB has 11 players already?
         * Now let's add more than 17 players
         * in it and see what happens.
         *
         */

        // first create additional players
        Player p11 = new Player( "Kevin Garnett", 11 );
        Player p12 = new Player( "Blake Griffin", 12 );
        Player p13 = new Player( "Derrick Rose", 13 );
        Player p14 = new Player( "Jayson Tatum", 14 );
        Player p15 = new Player( "Kyle Lowry ", 15 );
        Player p16 = new Player( "Patrick Ewing", 16 );
        Player p17 = new Player( "Steven Adams", 17 );
        Player p18 = new Player( "Julius Erving", 18 );
        Player p19 = new Player( "Jamal Murray", 19 );
        Player p20 = new Player( "Dwight Howard", 20 );

        // insert 20 players
        teamA.insert( p1 );
        teamA.insert( p2 );
        teamA.insert( p3 );
        teamA.insert( p4 );
        teamA.insert( p5 );
        teamA.insert( p6 );
        teamA.insert( p7 );
        teamA.insert( p8 );
        teamA.insert( p9 );
        teamA.insert( p10 );
        teamA.insert( p11 );
        teamA.insert( p12 );
        teamA.insert( p13 );
        teamA.insert( p14 );
        teamA.insert( p15 );
        teamA.insert( p16 );
        teamA.insert( p17 );
        teamA.insert( p18 );
        teamA.insert( p19 );
        teamA.insert( p20 );


        /**
         * Now TeamA has 20 PLAYERS which goes against the rules.
         * Each team cannot have more than 17 players.
         *
         * NOTE:
         *  + The first 17 players will be inserted in the team.
         *  + The program will generate an exception for each
         *      insertion passed the limit (>17).
         */
        // let's print and see
        System.out.println(teamA);

        /**
         * Now let's test contains method.
         */
        boolean b = teamB.contains( p3 );
        System.out.println("\nPlayer is in the team = " + b);  // true

        /**
         * Iterator to display our players.
         */
        teamB.iterator(); // display all players in the team



    }
}


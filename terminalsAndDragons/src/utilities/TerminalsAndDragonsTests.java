package utilities;

import Model.Enemy;
import Model.Player;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class TerminalsAndDragonsTests {

    public static void testPlayer() {
        Player player = new Player();
        player.setName("Alice");
        player.setAge(30);
        System.out.println("This is a player: " + player);
    }

    public static void testEnemy() {
        Enemy enemy = new Enemy();
        enemy.setType("Orc");
        enemy.setLevel(5);
        System.out.println("This is an enemy: " + enemy);
    }

    public static void listPlayers() {
        Player player1 = new Player();
        player1.setName("Alice");
        player1.setAge(30);

        Player player2 = new Player();
        player2.setName("Bob");
        player2.setAge(25);

        ArrayList <Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        System.out.println("List of players: " + players);
    }

    public static void writePlayer() {
        Player player1 = new Player();
        player1.setName("Alice");
        player1.setAge(30);

        Player player2 = new Player();
        player2.setName("Bob");
        player2.setAge(25);

        ArrayList <Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        String file = "characters.txt";

        try (Writer writer = new FileWriter(file)) {
            for (Player player : players) {
                writer.write(player.getName() + ", " + player.getAge() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readPlayers() {
        String file = "characters.txt";
        ArrayList<Player> players = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(", ");
                if (parts.length == 2) {
                    Player player = new Player();
                    player.setName(parts[0]);
                    player.setAge(Integer.parseInt(parts[1]));
                    players.add(player);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Players read from file: " + players);
    }
}

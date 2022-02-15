package lesson1;

import lesson1.Course;
import lesson1.Player;
import lesson1.Team;

public class Main {

    public static void main(String[] args) {
        Player[] player = new Player[4];
        player[0] = new Player("Flash", 300, 3, 50);
        player[1] = new Player("Crash", 170, 5, 40);
        player[2] = new Player("Trash", 450, 4, 80);
        player[3] = new Player("Nash", 350, 2, 100);
        Team team = new Team("SimpleTeam", player);

        Course course = new Course(250, 3, 50);
        String result = course.doIt(team);
        System.out.println(result);

    }
}

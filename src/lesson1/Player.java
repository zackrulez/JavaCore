package lesson1;
//создан класс участников
public class Player {
    private String name;
    private int runDistance;
    private int jumpDistance;
    private int swimDistance;

    public Player(String name, int runDistance, int jumpDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpDistance = jumpDistance;
        this.swimDistance = swimDistance;
    }
    public String getName() {
        return name;
    }
    public int getRunDistance() {
        return runDistance;
    }

    public int getJumpDistance() {
        return jumpDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }
}

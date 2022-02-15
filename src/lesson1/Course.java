package lesson1;

public class Course {
    String result;
    private int run;
    private int jump;
    private int swim;

    public Course(int run, int jump, int swim) {
        this.run = run;
        this.jump = jump;
        this.swim = swim;
    }
    public String doIt(Team team) {
        result = "Team: " + team.getName() + " " + '\n';
        for(Player player: team.getPlayers()) {
            result += "Player: " + player.getName() + " " + '\n';
            int valueRun = player.getRunDistance();
            int valueJump = player.getJumpDistance();
            int valueSwim = player.getSwimDistance();
            testRun(valueRun);
            testJump(valueJump);
            testSwim(valueSwim);
        }
            return result;
    }
    private void testRun(int valueRun) {
        if(valueRun>run) result += "Succsefully ran " + '\n';
    }

    private void testJump(int valueJump) {
        if(valueJump>jump) result += "Succsefully jumped " + '\n';
    }
    private void testSwim(int valueSwim) {
        if(valueSwim>swim) result += "Succsefully swum " + '\n';
    }
}

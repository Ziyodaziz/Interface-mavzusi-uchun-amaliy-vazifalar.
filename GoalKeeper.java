package InterfaceTask;

public class GoalKeeper extends FootballPlayer{

    public void countOfSaves(){
        System.out.println("countOfSaves -> 12");
    }


    public static void main(String[] args) {
        GoalKeeper goalKeeper = new GoalKeeper();
        goalKeeper.getInfo();
        goalKeeper.getTeamName();
        goalKeeper.countOfRedCard();
        goalKeeper.countOfYellowCard();
        goalKeeper.countOfGoals();
        goalKeeper.countOfSaves();

    }
}

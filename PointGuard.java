package InterfaceTask;

public class PointGuard extends BasketballPlayer{

    public void countOfGuard(){
        System.out.println("countOfGuard -> 18");
    }


    public static void main(String[] args) {
        PointGuard pointGuard = new PointGuard();
        pointGuard.getInfo();
        pointGuard.getTeamName();
        pointGuard.numberOfGoals();
        pointGuard.countOfGuard();
    }

}

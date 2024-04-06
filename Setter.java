package InterfaceTask;

public class Setter extends VolleyBallPlayer{

    public void countOfSets(){
        System.out.println("countOfSets -> 14");
    }


    public static void main(String[] args) {
        Setter setter = new Setter();
        setter.getInfo();
        setter.getTeamName();
        setter.countOfPoints();
        setter.countOfSets();

    }

}

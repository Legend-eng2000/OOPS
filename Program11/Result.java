
package Program11;

public class Result extends Student implements Sports{
    int sportsScore;
    Result(int rollNo, int academicScore, int sportsScore) {
        super(rollNo, academicScore);
        this.sportsScore = sportsScore;
    }
    public void showSportsScore() {
        System.out.println("Sports Score: " + sportsScore);
    }
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Academic Score: " + academicScore);
        showSportsScore();
    }
}
package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        if (12 == monthNumber || 0 < monthNumber && monthNumber <= 2) {
            System.out.println("Winter");
        } else if (2 < monthNumber && monthNumber <= 5) {
            System.out.println("Spring");
        } else if (5 < monthNumber && monthNumber <= 8) {
            System.out.println("Summer");
        } else if (9 < monthNumber && monthNumber <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Wrong month number");
        }
    }
}

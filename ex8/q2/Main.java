// Main class
public class Main {
    public static void main(String[] args) {
        FootballScore scoreBoard = new FootballScore();

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            System.out.print("Enter Score: ");
            String score = scanner.nextLine();
            if (score.isEmpty())
                break;
            scoreBoard.setScore(score);
        }
        scanner.close();
    }
}
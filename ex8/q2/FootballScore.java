import java.util.ArrayList;
import java.util.List;

class FootballScore {
    private List<Observer> observers = new ArrayList<>();
    private String score;

    public FootballScore() {
        // Initialize with predefined observers
        observers.add(new Fan("Fan 1"));
        observers.add(new Fan("Fan 2"));
    }

    public void setScore(String score) {
        this.score = score;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(score);
        }
    }
}
package labwork3_2135155_it1;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}

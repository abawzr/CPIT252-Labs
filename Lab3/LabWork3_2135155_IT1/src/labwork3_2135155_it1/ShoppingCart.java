package labwork3_2135155_it1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Subject {

    private List<Observer> observers;
    private List<String> items;

    public ShoppingCart() {
        observers = new ArrayList<>();
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
        notifyObservers();
    }

    public void removeItem(String item) {
        items.remove(item);
        notifyObservers();
    }

    public List<String> getItems() {
        return items;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }

    }
}

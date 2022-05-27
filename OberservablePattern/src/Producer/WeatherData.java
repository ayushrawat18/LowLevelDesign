package Producer;

import Consumers.composition.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer ob) {
        this.observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        int idx = observers.indexOf(ob);
        if (idx != -1)
            observers.remove(idx);
    }

    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            ob.update();
        }
    }


    public void weatherChangeDetected(){
        notifyObservers();
    }
}

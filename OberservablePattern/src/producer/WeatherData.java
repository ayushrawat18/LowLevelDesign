package producer;

import java.util.Observable;

public class WeatherData extends Observable {

    public void informExternalApplications() {
        System.out.println("i am here");
        notifyObservers();
    }

}

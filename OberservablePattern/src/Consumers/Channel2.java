package Consumers;

import Consumers.composition.DisplayElement;
import Consumers.composition.Observer;
import Producer.WeatherData;

public class Channel2 implements Observer, DisplayElement {

    WeatherData wd;
    public Channel2(WeatherData weatherData) {
        this.wd = weatherData;
        wd.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Channel 2 has been notified ");
    }

    @Override
    public void display() {
        System.out.println("Displaying the data via channel 2");
    }
}

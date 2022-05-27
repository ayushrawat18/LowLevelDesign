import Consumers.Channel1;
import Consumers.Channel2;
import Consumers.Channel3;
import Producer.WeatherData;

public class Main {

    public static void main(String args[]) {
        WeatherData wd = new WeatherData();
        Channel1 channel1 = new Channel1(wd);
        Channel2 channel2 = new Channel2(wd);
        Channel3 channel3 = new Channel3(wd);
        wd.weatherChangeDetected();
    }
}

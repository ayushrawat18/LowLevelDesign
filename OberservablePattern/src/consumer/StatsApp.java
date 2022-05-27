package consumer;

import java.util.Observable;
import java.util.Observer;

public class StatsApp implements Observer {


    Observable ob;
    public StatsApp(Observable observable) {
        this.ob = observable;
        ob.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        System.out.println("I am a message send by producer ");
    }
}

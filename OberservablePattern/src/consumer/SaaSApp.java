package consumer;

import java.util.Observable;
import java.util.Observer;

public class SaaSApp implements Observer {

    Observable ob;
    public SaaSApp(Observable observable) {
        this.ob = observable;
        ob.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("I am a message send by producer ");
    }
}

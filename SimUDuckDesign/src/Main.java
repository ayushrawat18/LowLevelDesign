import model.Duck;
import model.extensions.MallardDuck;
import model.extensions.ModelDuck;


/**
 * This example is taken from Head First Design Patterns
 * Beautiful example of strategy pattern
 * Encapsulate that varies
 * Always favor composition/interface over inheritance
 * Program to interface not implementation
 *
 * Keeping the behavior as separate entity, include those behaviors into entities(duck in this case)!
 */
public class Main {

    public static void main(String args[]) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}

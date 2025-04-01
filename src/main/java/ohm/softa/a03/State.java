package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Klass State
public abstract class State {
    protected static final Logger logger = LogManager.getLogger();
    private int t;
    private final int duration;

    State tick(Cat cat) {
        return null;
    }


    abstract State successor(Cat cat);

    public int getTime() {
        return t;
    };

    public int getDuration() {
        return duration;
    }
}
package localhost.game2;

public class Model {

    private int value = 0;

    public void addValue(int delta) {
        value += delta;
    }
    public int getValue() {
        return value;
    }
}

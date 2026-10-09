package localhost.game2;

public class View {
    private Model model;

    public View(Model model) {
        this.model = model;
    }

    void show() {
        var value = model.getValue();
        System.out.println(value);
    }
}

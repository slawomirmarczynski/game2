package localhost.game2;

import java.util.Scanner;

public class Controller {

    private final View view;
    private final Model model;
    private final Scanner input = new Scanner(System.in);

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    void update() {
        int delta = input.nextInt();
        model.addValue(delta);
        view.show();
    }
}

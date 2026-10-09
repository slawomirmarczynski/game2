package localhost.game2;

public class Program implements Runnable {
    public static void main(String[] args) {

    }

    @Override
    public void run() {
        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model, view);

        view.show();
        try {
            while(true) {
                controller.update();
            }
        } catch (Exception e) {
        }
    }
}

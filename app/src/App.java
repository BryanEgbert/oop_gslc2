import view.View;
import view.Terminal;

public class App {
    public static void main(String[] args) throws Exception {
        View view = new Terminal();

        view.show();
    }
}

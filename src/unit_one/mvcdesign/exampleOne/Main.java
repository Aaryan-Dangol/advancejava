package unit_one.mvcdesign.exampleOne;

public class Main {
    public static void main(String[] args) {
        CounterModel model = new CounterModel();
        CounterView view = new CounterView();
        new CounterController(model, view);
        view.setVisible(true);
    }
}


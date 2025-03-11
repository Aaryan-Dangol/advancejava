package unit_one.mvc;

public class MVCExample1 {
    public static void main(String[] args) {
        ListModel model = new ListModel();
        ListView view = new ListView();
        new ListController(model, view); // No need to store the controller
        view.show();
    }
}
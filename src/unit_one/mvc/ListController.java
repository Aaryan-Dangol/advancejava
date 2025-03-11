package unit_one.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListController {
    private final ListModel model;
    private final ListView view;

    public ListController(ListModel model, ListView view) {
        this.model = model;
        this.view = view;

        // Add item when button is clicked
        view.getAddButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addItem("New Item");
            }
        });

        // Update view when model changes
        model.addListener(new ModelListener() {
            @Override
            public void onModelChanged() {
                view.updateList(model.getItems());
            }
        });
    }
}

package unit_one.mvc;

import java.util.ArrayList;
import java.util.List;

public class ListModel {
    private final List<String> items = new ArrayList<>();
    private final List<ModelListener> listeners = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
        notifyListeners();
    }

    public List<String> getItems() {
        return new ArrayList<>(items); // Return a copy to prevent modification
    }

    public void addListener(ModelListener listener) {
        listeners.add(listener);
    }

    private void notifyListeners() {
        for (ModelListener listener : listeners) {
            listener.onModelChanged();
        }
    }
}
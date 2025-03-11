package unit_one.mvcdesign.exampleOne;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterController {
    private CounterModel model;
    private CounterView view;

    public CounterController(CounterModel model, CounterView view) {
        this.model = model;
        this.view = view;

        // Register event handlers
        this.view.addIncrementListener(new IncrementListener());
        this.view.addResetListener(new ResetListener());
        this.view.addDecrementListener(new DecrementListener());
        this.view.incrementByTwoListener(new IncrementByTwoListener());
    }

    class IncrementListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.increment();
            view.setCounterValue(model.getCount());
        }
    }

    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.reset();
            view.setCounterValue(model.getCount());
        }
    }

    class DecrementListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.decrement();
            view.setCounterValue(model.getCount());
        }
    }

    class IncrementByTwoListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.incrementByTwo();
            view.setCounterValue(model.getCount());
        }
    }
}
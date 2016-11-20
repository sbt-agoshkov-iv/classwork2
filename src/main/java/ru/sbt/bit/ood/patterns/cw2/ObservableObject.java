package ru.sbt.bit.ood.patterns.cw2;

import ru.sbt.bit.ood.patterns.cw2.events.DummyListener;
import ru.sbt.bit.ood.patterns.cw2.events.HomeEventListener;

public class ObservableObject {
    private HomeEventListener listener = new DummyListener();

    public void setListener(HomeEventListener listener) {
        this.listener = listener;
    }

    protected HomeEventListener getListener() {
        return listener;
    }
}

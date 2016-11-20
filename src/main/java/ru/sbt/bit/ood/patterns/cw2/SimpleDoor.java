package ru.sbt.bit.ood.patterns.cw2;

import ru.sbt.bit.ood.patterns.cw2.events.DoorCloseEvent;
import ru.sbt.bit.ood.patterns.cw2.events.DoorOpenEvent;
import ru.sbt.bit.ood.patterns.cw2.objects.Door;
import ru.sbt.bit.ood.patterns.cw2.objects.DoorType;

public class SimpleDoor extends ObservableObject implements Door {
    private final DoorType doorType;
    private boolean isOpen = false;

    public SimpleDoor(DoorType doorType) {
        this.doorType = doorType;
    }

    @Override
    public void open() {
        isOpen = true;
        getListener().onEvent(new DoorOpenEvent(this));
    }

    @Override
    public void close() {
        isOpen = false;
        getListener().onEvent(new DoorCloseEvent(this));
    }

    @Override
    public boolean isOpen() {
        return isOpen;
    }

    @Override
    public DoorType getType() {
        return doorType;
    }

}

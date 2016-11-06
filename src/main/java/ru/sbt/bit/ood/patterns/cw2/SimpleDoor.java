package ru.sbt.bit.ood.patterns.cw2;

public class SimpleDoor implements Door {
    private boolean isOpen = false;
    private final DoorType doorType;

    public SimpleDoor(DoorType doorType) {
        this.doorType = doorType;
    }

    @Override
    public void open() {
        isOpen = true;
    }

    @Override
    public void close() {
        isOpen = false;
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

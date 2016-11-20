package ru.sbt.bit.ood.patterns.cw2.objects;

public interface Door {
    void open();
    void close();
    boolean isOpen();
    DoorType getType();
}

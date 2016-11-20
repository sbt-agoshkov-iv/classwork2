package ru.sbt.bit.ood.patterns.cw2.events;

import ru.sbt.bit.ood.patterns.cw2.objects.Door;

public class DoorCloseEvent extends HomeEvent {

    private Door door;

    public DoorCloseEvent(Door door) {
        this.door = door;
    }

    public Door getDoor() {
        return door;
    }
}

package ru.sbt.bit.ood.patterns.cw2.events;

import ru.sbt.bit.ood.patterns.cw2.objects.Light;

public class LightOnEvent extends HomeEvent {
    private final Light light;

    public LightOnEvent(Light light) {
        this.light = light;
    }
}

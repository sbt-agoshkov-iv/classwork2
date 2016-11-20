package ru.sbt.bit.ood.patterns.cw2.events;

import ru.sbt.bit.ood.patterns.cw2.objects.Light;

public class LightOffEvent extends HomeEvent {
    private final Light light;

    public LightOffEvent(Light light) {
        this.light = light;
    }
}

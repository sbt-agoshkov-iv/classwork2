package ru.sbt.bit.ood.patterns.cw2;

public class SimpleLight implements Light {
    LightState state = LightState.OFF;
    private final LightLocation location;

    public SimpleLight(LightLocation location) {
        this.location = location;
    }

    @Override
    public void turnOff() {
        state = LightState.OFF;
    }

    @Override
    public void turnOn() {
        state = LightState.ON;
    }

    @Override
    public LightState getState() {
        return state;
    }

    @Override
    public LightLocation getLocation() {
        return location;
    }
}

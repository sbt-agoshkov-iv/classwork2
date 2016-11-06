package ru.sbt.bit.ood.patterns.cw2;

public interface Light {
    void turnOff();
    void turnOn();
    LightState getState();
    LightLocation getLocation();
}

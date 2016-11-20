package ru.sbt.bit.ood.patterns.cw2.objects;

public interface Alarm {
    AlarmState getState();
    void activate();
    void deactivate();
    void alarm();
}

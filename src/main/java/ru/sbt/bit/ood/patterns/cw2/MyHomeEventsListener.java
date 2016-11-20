package ru.sbt.bit.ood.patterns.cw2;

import ru.sbt.bit.ood.patterns.cw2.events.DoorCloseEvent;
import ru.sbt.bit.ood.patterns.cw2.events.HomeEvent;
import ru.sbt.bit.ood.patterns.cw2.events.HomeEventListener;
import ru.sbt.bit.ood.patterns.cw2.objects.DoorType;

public class MyHomeEventsListener implements HomeEventListener {

    private final SmartHome smartHome;

    public MyHomeEventsListener(SmartHome smartHome) {
        this.smartHome = smartHome;
    }

    @Override
    public void onEvent(HomeEvent event) {
        if (event instanceof DoorCloseEvent) {
            DoorCloseEvent doorCloseEvent = (DoorCloseEvent) event;
            if (doorCloseEvent.getDoor().getType() == DoorType.ENTRANCE) {
                smartHome.turnOffTheLights();
            }
        }
    }
}

package ru.sbt.bit.ood.patterns.cw2;

import org.junit.Test;
import ru.sbt.bit.ood.patterns.cw2.objects.DoorType;
import ru.sbt.bit.ood.patterns.cw2.objects.Light;
import ru.sbt.bit.ood.patterns.cw2.objects.LightLocation;
import ru.sbt.bit.ood.patterns.cw2.objects.LightState;

import java.util.Collection;
import static junit.framework.TestCase.assertEquals;

public class TestSmartHome {

    @Test
    public void testTurnOffTheLights() {
        // setup
        SimpleLight testLight = createAndTurnOnTheLight();
        SmartHome home = createSmartHomeWithSingleLight(testLight);
        // exercise
        home.turnOffTheLights();
        // assert
        assertLightsAreOff(home.getLights());
    }

    @Test
    public void testTurnsOffTheLightsWhenEntranceDoorIsClosed() {
        // setup
        SmartHome home = new SmartHome();
        home.addLight(createAndTurnOnTheLight());
        home.addLight(createAndTurnOnTheLight());
        SimpleDoor entranceDoor = new SimpleDoor(DoorType.ENTRANCE);
        entranceDoor.setListener(new MyHomeEventsListener(home));
        home.addDoor(entranceDoor);
        // exercise
        entranceDoor.close();
        // assert
        assertLightsAreOff(home.getLights());
    }

    private SmartHome createSmartHomeWithSingleLight(SimpleLight testLight) {
        SmartHome home = new SmartHome();
        home.addLight(testLight);
        return home;
    }

    private SimpleLight createAndTurnOnTheLight() {
        SimpleLight testLight = new SimpleLight(LightLocation.LIVING_ROOM);
        testLight.turnOn();
        return testLight;
    }

    private void assertLightsAreOff(Collection<Light> lights) {
        for (Light light : lights) {
            assertEquals(LightState.OFF, light.getState());
        }
    }

}

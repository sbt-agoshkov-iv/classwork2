package ru.sbt.bit.ood.patterns.cw2;

import org.junit.Test;

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

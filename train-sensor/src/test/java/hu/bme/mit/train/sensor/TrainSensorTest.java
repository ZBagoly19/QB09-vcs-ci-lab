package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class TrainSensorTest {

    private Tachograph tachograph;

    @Before
    public void before() {
        tachograph = new Tachograph();

        tachograph.addDataElement(1, 1, 1);
        tachograph.addDataElement(2, 1, 15);
        tachograph.addDataElement(1, 4, 16);
    }

    @Test
    public void ThisIsAnExampleTestStub() {
        assertEquals(1, tachograph.getElement(1, 1));
        assertEquals(16, tachograph.getElement(1, 4));
    }
}

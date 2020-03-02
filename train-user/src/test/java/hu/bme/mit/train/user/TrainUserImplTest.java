package hu.bme.mit.train.user;

import hu.bme.mit.train.interfaces.TrainController;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class TrainUserImplTest {
    private TrainUserImpl trainUser;

    @Before
    public void init() {
         trainUser = new TrainUserImpl(new TrainController() {
            @Override
            public void followSpeed() {

            }

            @Override
            public int getReferenceSpeed() {
                return 0;
            }

            @Override
            public void setSpeedLimit(int speedLimit) {

            }

            @Override
            public void setJoystickPosition(int joystickPosition) {

            }
        });
    }

    @Test
    public void testIsAwesome() {
        assertTrue(trainUser.isThisAwesome());
    }
}

package hu.bme.mit.train.sensor;

import java.util.List;

import com.sun.javafx.geom.Vec3f;

public class Tachograph {

	private List<Vec3f> tachoDatas;

    public Tachograph() {

    }

    public void addDataElement(Integer time, Integer position, Integer refSpeed) {
    	Vec3f v3 = new Vec3f(time.floatValue(), position.floatValue(), refSpeed.floatValue());
        tachoDatas.add(v3);
    }

    public int getElement(Integer time, Integer pos) {
        Float speed = null;
        for(int i = 0; i < tachoDatas.size(); i++) {
        	if(time == tachoDatas.get(i).x) {
        		if(pos == tachoDatas.get(i).y)
        			speed = tachoDatas.get(i).z;
        	}
        }
        return speed.intValue();
    }
}

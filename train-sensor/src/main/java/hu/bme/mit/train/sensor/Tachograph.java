package hu.bme.mit.train.sensor;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
 
public class Tachograph {

    private Table<Integer, Integer, Integer> tachoData;

    public Tachograph() {
        tachoData = HashBasedTable.create();
    }

    public void addDataElement(Integer time, Integer position, Integer refSpeed) {
        tachoData.put(time, position, refSpeed);
    }

    public int getElement(Integer time, Integer pos) {
        Integer speed = tachoData.get(time, pos);
        return speed;
    }
}

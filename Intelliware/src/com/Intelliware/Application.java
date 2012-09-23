package com.Intelliware;

import com.Intelliware.core.IAction;
import com.Intelliware.core.IMapper;
import com.Intelliware.devices.OutdoorLight;
import com.Intelliware.devices.Thermostat;
import com.Intelliware.mappers.AbstractHashMapper;
import com.Intelliware.mappers.ThermostatMapper;

/**
 *
 * @author Twan
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        OutdoorLight outdoorLight = new OutdoorLight();
        
        IMapper deviceMapper = new ThermostatMapper(thermostat);
        for(int key : new int[] {0,1,2,3,4}) {
            try {
                deviceMapper.performAction(key);
            } catch(Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        deviceMapper = new AbstractHashMapper<OutdoorLight, Integer>(outdoorLight) {
            {
                bindKey(0, new IAction() {
                    @Override
                    public void performAction() {
                        object.Off();
                    }
                });
                bindKey(1, new IAction() {
                    @Override
                    public void performAction() {
                        object.On();
                    }
                });
            }
        };
        for(int key : new int[] {0,1,2,3,4}) {
            try {
                deviceMapper.performAction(key);
            } catch(Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Intelliware.mappers;

import com.Intelliware.core.IAction;
import com.Intelliware.devices.Thermostat;

/**
 *
 * @author Twan
 */
public class ThermostatMapper extends Mapper<Thermostat, Integer> {

    public ThermostatMapper(Thermostat thermostat) {
        super(thermostat);
        bindKey(0, new IAction() {
            @Override
            public void performAction() {
                object.TurnDown();
            }
        });
        bindKey(1, new IAction() {
            @Override
            public void performAction() {
                object.TurnUp();
            }
        });
    }
    
}

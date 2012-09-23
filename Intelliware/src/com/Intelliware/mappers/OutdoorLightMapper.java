/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Intelliware.mappers;

import com.Intelliware.core.IAction;
import com.Intelliware.devices.OutdoorLight;

/**
 *
 * @author Kevin Haring <K.KevinHaring@gmail.com>
 */
public class OutdoorLightMapper extends Mapper<OutdoorLight, Integer> {
    
    public OutdoorLightMapper(OutdoorLight outdoorLight) {
        super(outdoorLight);
        bindKey(0, new IAction() {

            @Override
            public void performAction() {
                object.On();
            }
        });
        bindKey(1, new IAction() {

            @Override
            public void performAction() {
                object.Off();
            }
        });
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Intelliware.mappers;

import com.Intelliware.core.IAction;
import com.Intelliware.devices.HotTub;

/**
 *
 * @author Kevin Haring <K.KevinHaring@gmail.com>
 */
public class HotTubMapper extends Mapper<HotTub, Integer> {
    
    public HotTubMapper(HotTub hotTub) {
        super(hotTub);
        bindKey(0, new IAction() {

            @Override
            public void performAction() {
                object.Circulate();
            }
        });
        bindKey(1, new IAction() {

            @Override
            public void performAction() {
                object.JetsOn();
            }
        });
        bindKey(2, new IAction() {

            @Override
            public void performAction() {
                object.JetsOff();
            }
        });
        bindKey(3, new IAction() {

            @Override
            public void performAction() {
                object.SetTemperature();
            }
        });
    }
    
}

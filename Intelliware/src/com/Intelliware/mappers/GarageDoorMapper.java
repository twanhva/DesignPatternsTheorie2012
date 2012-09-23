/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Intelliware.mappers;

import com.Intelliware.core.IAction;
import com.Intelliware.devices.GarageDoor;

/**
 *
 * @author Kevin Haring <K.KevinHaring@gmail.com>
 */
public class GarageDoorMapper extends Mapper<GarageDoor, Integer> {
    
    public GarageDoorMapper(GarageDoor garageDoor) {
        super(garageDoor);
        bindKey(0, new IAction() {

            @Override
            public void performAction() {
                object.Up();
            }
        });
        bindKey(1, new IAction() {

            @Override
            public void performAction() {
                object.Down();
            }
        });
        bindKey(2, new IAction() {

            @Override
            public void performAction() {
                object.Stop();
            }
        });
        bindKey(3, new IAction() {

            @Override
            public void performAction() {
                object.LightOn();
            }
        });
        bindKey(4, new IAction() {

            @Override
            public void performAction() {
                object.LightOff();
            }
        });
    }
    
}

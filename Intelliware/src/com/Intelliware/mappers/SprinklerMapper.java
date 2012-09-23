/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Intelliware.mappers;

import com.Intelliware.core.IAction;
import com.Intelliware.devices.Sprinkler;

/**
 *
 * @author Kevin Haring <K.KevinHaring@gmail.com>
 */
public class SprinklerMapper extends Mapper<Sprinkler, Integer> {
 
    public SprinklerMapper(Sprinkler sprinkler) {
        super(sprinkler);
        bindKey(0, new IAction() {

            @Override
            public void performAction() {
                object.TurnOn();
            }
        });
        bindKey(1, new IAction() {

            @Override
            public void performAction() {
                object.TurnOff();
            }
        });
        bindKey(2, new IAction() {

            @Override
            public void performAction() {
                object.SetTimer();
            }
        });
    }
    
}

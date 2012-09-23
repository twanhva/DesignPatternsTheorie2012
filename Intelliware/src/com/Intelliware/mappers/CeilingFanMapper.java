/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Intelliware.mappers;

import com.Intelliware.core.IAction;
import com.Intelliware.devices.CeilingFan;

/**
 *
 * @author Kevin Haring <K.KevinHaring@gmail.com>
 */
public class CeilingFanMapper extends Mapper<CeilingFan, Integer> {
 
    public CeilingFanMapper(CeilingFan ceilingFan) {
        super(ceilingFan);
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
        bindKey(2, new IAction() {

            @Override
            public void performAction() {
                object.High();
            }
        });
        bindKey(3, new IAction() {

            @Override
            public void performAction() {
                object.Medium();
            }
        });
        bindKey(4, new IAction() {

            @Override
            public void performAction() {
                object.Low();
            }
        });
    }
    
}

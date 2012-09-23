/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Intelliware.mappers;

import com.Intelliware.core.IAction;
import com.Intelliware.devices.TV;

/**
 *
 * @author Kevin Haring <K.KevinHaring@gmail.com>
 */
public class TVMapper extends Mapper<TV, Integer> {
    
    public TVMapper(TV tv) {
        super(tv);
        
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
                object.SetInputChannel();
            }
        });
        bindKey(3, new IAction() {

            @Override
            public void performAction() {
                object.SetVolume();
            }
        });
    }
    
}

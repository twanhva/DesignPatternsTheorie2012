/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Intelliware.mappers;

import com.Intelliware.core.IAction;
import com.Intelliware.devices.CeilingLight;

/**
 *
 * @author Kevin Haring <K.KevinHaring@gmail.com>
 */
public class CeilingLightMapper extends Mapper<CeilingLight, Integer> {
 
    public CeilingLightMapper(CeilingLight ceilingLight) {
        super(ceilingLight);
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
                object.DimUp();
            }
        });
        bindKey(3, new IAction() {

            @Override
            public void performAction() {
                object.DimDown();
            }
        });
    }
    
}

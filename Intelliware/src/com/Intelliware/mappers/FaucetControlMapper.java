/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Intelliware.mappers;

import com.Intelliware.core.IAction;
import com.Intelliware.devices.FaucetControl;

/**
 *
 * @author Kevin Haring <K.KevinHaring@gmail.com>
 */
public class FaucetControlMapper extends Mapper<FaucetControl, Integer> {

    public FaucetControlMapper(FaucetControl faucetControl) {
        super(faucetControl);
        bindKey(0, new IAction() {

            @Override
            public void performAction() {
                object.OpenCrank();
            }
        });
        bindKey(1, new IAction() {

            @Override
            public void performAction() {
                object.CloseCrank();
            }
        });
    }
    
}


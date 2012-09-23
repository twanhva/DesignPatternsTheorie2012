/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Intelliware.mappers;

import com.Intelliware.core.IAction;
import com.Intelliware.devices.SecurityControl;

/**
 *
 * @author Kevin Haring <K.KevinHaring@gmail.com>
 */
public class SecurityControlMapper extends Mapper<SecurityControl, Integer> {
    
    public SecurityControlMapper(SecurityControl securityControl) {
        super(securityControl);
        bindKey(0, new IAction() {

            @Override
            public void performAction() {
                object.Arm();
            }
        });
        bindKey(1, new IAction() {

            @Override
            public void performAction() {
                object.Disarm();
            }
        });
        bindKey(2, new IAction() {

            @Override
            public void performAction() {
                object.Notify();
            }
        });
        bindKey(3, new IAction() {

            @Override
            public void performAction() {
                object.Alert();
            }
        });
    }
}

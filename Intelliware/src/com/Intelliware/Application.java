package com.Intelliware;

import com.Intelliware.core.IAction;
import com.Intelliware.core.IMapper;
import com.Intelliware.devices.Thermostat;

/**
 *
 * @author Twan
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IMapper<Integer> thermostat = new Thermostat();
        final Thermostat thermostatReference = (Thermostat)thermostat;
        thermostat
                .bindKey(0, new IAction() {
                    @Override
                    public void performAction() {
                        thermostatReference.TurnDown();
                    }  
                })
                .bindKey(1, new IAction() {
                    @Override
                    public void performAction() {
                        thermostatReference.TurnUp();
                    }  
                });
        for(int key : new int[] {0,1,2,3,4}) {
            try {
                thermostat.performAction(key);
            } catch(Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        
    }
}

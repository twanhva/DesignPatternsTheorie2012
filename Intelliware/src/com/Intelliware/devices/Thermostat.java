package com.Intelliware.devices;

import com.Intelliware.mappers.AbstractHashMapper;
import com.Intelliware.core.IAction;
import com.Intelliware.core.IMapper;
import com.Intelliware.core.InvalidKeyException;

/**
 *
 * @author Twan
 */
public class Thermostat {
    
    public void TurnUp() {
        System.out.println("Thermostat is turning up now");
    }
    
    public void TurnDown() {
        System.out.println("Thermostat is turning down now");
    }
       
}

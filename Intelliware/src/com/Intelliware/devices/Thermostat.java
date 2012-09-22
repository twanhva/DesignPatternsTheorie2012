package com.Intelliware.devices;

import com.Intelliware.core.HashMapper;
import com.Intelliware.core.IAction;
import com.Intelliware.core.IMapper;
import com.Intelliware.core.InvalidKeyException;

/**
 *
 * @author Twan
 */
public class Thermostat implements IMapper {
    
    private IMapper mapper = new HashMapper();

    public Thermostat() {
        bindKey(0, new IAction() {
            @Override
            public void performAction() {
                TurnDown();
            }  
        });
        bindKey(1, new IAction() {
            @Override
            public void performAction() {
                TurnUp();
            }  
        });
    }

    @Override
    public final IMapper bindKey(Object key, IAction action) {
        return mapper.bindKey(key, action);
    }

    @Override
    public void performAction(Object key) throws InvalidKeyException {
        mapper.performAction(key);
    }
    
    public void TurnUp() {
        System.out.println("Thermostat is turning up now");
    }
    
    public void TurnDown() {
        System.out.println("Thermostat is turning down now");
    }
       
}

package com.mycompany.alm.albink.jespers.philipn.stevieo;

import java.io.Serializable;

public class RandomFactor implements Serializable{
    
    private RandomFactor(){}
    
    public static int zeroToNine(){
        return (int) (Math.random() * 9);
    }
}
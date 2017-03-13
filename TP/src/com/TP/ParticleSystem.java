package com.TP;

import java.util.Random;
import java.util.Stack;


import android.util.Log;

public class ParticleSystem {
    public static final String TAG = "moto";
  
    private int PARTICLECOUNT = 20;
    public Particle particle;
    
    public Stack<Particle> particleArray; 
	
	public float pX;
	public float pY;
	
    public ParticleSystem() {
       //mParticles = new Particle[PARTICLECOUNT];
    	
    	
    	particleArray = new Stack<Particle>();
    	particleArray.push(particle);
    	particleArray.push(particle);
    	particleArray.push(particle);
        
        for(Particle v : particleArray){
         Log.i(TAG," Particle " +  v); 
        }
        
    	
    	
    	
    	
    	
    	

       // Random gen = new Random(System.currentTimeMillis());
        for (int i = 0; i < PARTICLECOUNT; i++) {
          
           
            
        // Log.i(TAG," mParticles " +  mParticles);
        }
    }
    
    
    
	
	 
	
	
}
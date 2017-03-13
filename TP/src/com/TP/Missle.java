package com.TP;



public class Missle {

	 public static double MisslePosX;
     public static double MisslePosY;
   
     
     public static void getMissleX(double xpos){
    	 MisslePosX = xpos;
    	 return;
     }
     
     public static double setMissleX(){
    	
		return MisslePosX;
     }
	
     public static void getMissleY(double ypos){
    	 MisslePosY = ypos;
    	 return;
     }
     
     public static double setMissleY(){
    	
		return MisslePosY;
     }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculater;

/**
 *
 * @author FIS
 */
public class modelcal {
    private double result;
    
    public void add(double x,double y){
        result=x+y;
    }
    
    
    public void sub(double x,double y){
        result=x-y;
    }
    
     public void mu(double x,double y){
        result=x*y;
    }
      public void div(double x,double y){
        result=x/y;
    }
      
      /**
       * 
       * @return
       */
     public double getval(){
         return result;
     }
    
}

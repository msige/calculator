/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculater;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author FIS
 */
public class calControll {
    private final calview view;
    private final modelcal model;
    
    public calControll(calview view,modelcal model){
        this.view=view;
        this.model=model;
        this.view.addButtonListener((ActionListener)new addLis());
        this.view.subtractionListener((ActionListener) new subblis());
        this.view.mulListener((ActionListener) new mullis());
        this.view.divListener((ActionListener) new divlis());
        
        
    }


class addLis implements ActionListener{
    @Override

    public void actionPerformed(ActionEvent ae) {
        double num1,num2=0;
        try{
            num1=view.getnum1();
            num2=view.getnum2();
            model.add(num1, num2);
            view.setresult(model.getval());
           
            
        }catch(NumberFormatException ex){
            System.out.print(ex);
            view.error("enter 2 Numbers");
        }
        
    }
    
    
}


class subblis implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            double num1,num2=0;
        try{
            num1=view.getnum1();
            num2=view.getnum2();
            model.sub(num1, num2);
            view.setresult(model.getval());
            
        }catch(NumberFormatException ex){
            System.out.print(ex);
            view.error("enter 2 Numbers");
        }
          
        }
    
}


class mullis implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            double num1,num2=0;
        try{
            num1=view.getnum1();
            num2=view.getnum2();
            model.mu(num1, num2);
            view.setresult(model.getval());
            
        }catch(NumberFormatException ex){
            System.out.print(ex);
            view.error("enter 2 Numbers");
        }
          
        }
    
}



class divlis implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            double num1,num2=0;
        try{
            num1=view.getnum1();
            num2=view.getnum2();
            model.div(num1, num2);
            view.setresult(model.getval());
            
        }catch(NumberFormatException ex){
            System.out.print(ex);
            view.error("enter 2 Numbers");
        }
          
        }
    
}




}












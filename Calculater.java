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
public class Calculater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        modelcal model1=new modelcal();
        calview view =new calview();
        calControll cont=new calControll(view,model1);
        view.setVisible(true);
        
    }
    
}

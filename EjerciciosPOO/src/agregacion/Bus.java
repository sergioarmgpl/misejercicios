/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacion;

import java.util.ArrayList;

/**
 *
 * @author sergio.mendez
 */
public class Bus {
    private ArrayList <Persona>pasaje=new ArrayList();
    
    public void meterPasaje(Persona p){
        pasaje.add(p);
    }      
}

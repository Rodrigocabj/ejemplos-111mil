/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodeherencia;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Alumno extends Persona{
    private Date _fechaInsc;
    private int _legajo;
     public void MostrarLosDatos()
    {
        super.MostrarLosDatos();
        System.out.println("fi: "+ this._fechaInsc);
        System.out.println("leg: "+this._legajo);
        
    }
}

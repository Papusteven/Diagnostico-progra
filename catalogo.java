/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;



import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class main {
    public static void main(String [] args){
        String respuesta="";
        int respuestaN=0;
        vehiculo vehiculo=new vehiculo();
        boolean diff=true;
        while(diff=true){
        respuesta=JOptionPane.showInputDialog(null,"Selecciones una de las opciones por favor: \n1: Ver lista\n2: Por ruedas\n3: Salir");
       
        switch(respuesta){
                case "1":
                      respuesta=JOptionPane.showInputDialog(null,"Seleccione el vehiculo que usted requiera: \n1: Carros\n2: Motocicletas\n3: Bicicletas\n4: Camionetas");
                      switch(respuesta){
                          case"1":
                               JOptionPane.showMessageDialog(null,"Toyota\n Nissan\n Camaro\n Tesla");
                              break;
                                case"2":
                                     JOptionPane.showMessageDialog(null,"Yamaha\n Suzuki\n Harley\n Toyota");
                              break;
                                case"3":
                                     JOptionPane.showMessageDialog(null,"BMX\n Drake\n Scott\n Shimano");
                              break;
                                case"4":
                                     JOptionPane.showMessageDialog(null,"Toyota\n Nissan\n Camaro\n Tesla");
                              break;
                      }
                    break;
                    case "2":
                        respuestaN=Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor ingrese cuantas llantas del vehiculo: "));
                        vehiculo.setruedas(respuestaN);
                        if(vehiculo.ruedas==2){
                              JOptionPane.showMessageDialog(null,"Motocicletas:\n Yamaha\n Suzuki\n Harley\n Toyota");
                               JOptionPane.showMessageDialog(null,"Bicicletas:\nbmx\ndrake\nscott\nshimano");
                        }
                        if(vehiculo.ruedas==4){
                              JOptionPane.showMessageDialog(null,"Carros:\n Toyota\n Nissan\n Camaro\n Tesla");
                             JOptionPane.showMessageDialog(null,"Camionetas:\n Toyota\n Nissan\n Camaro"); 
                        }
                      
                    break;
                    case "3":
                        System.exit(0);
                    break;
        }
        }

    }   
}

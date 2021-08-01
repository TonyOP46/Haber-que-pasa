/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;


import javax.swing.*;

/**
 *
 * @author PC
 */
public class Metodos extends Thread{
    //creamos las variables
    private JLabel etiqueta;
    private Juego auto;

    //Constructor
    public Metodos(JLabel etiqueta, Juego auto) {
        this.etiqueta = etiqueta;
        this.auto = auto;
    }
    @Override
    public void run(){
        
        int auto1=0;
        int auto2=0;
        int auto3=0;
        while (true) {
                      
            try {
                sleep((int)(Math.random()*100));
                auto1=auto.getAuto1().getLocation().x;
                auto2=auto.getAuto2().getLocation().x;
                auto3=auto.getAuto3().getLocation().x;
                
                if(auto1 < auto.getMeta().getLocation().x - 80 && auto2 < auto.getMeta().getLocation().x - 80 && auto3 <auto.getMeta().getLocation().x - 80){
                    etiqueta.setLocation(etiqueta.getLocation().x + 10, etiqueta.getLocation().y);
                    auto.repaint();
                    
                }else{
                    break;
                }
                
            } catch (Exception e) {
            }
            
            if(etiqueta.getLocation().x >= auto.getMeta().getLocation().x - 80){
                if(auto1 > auto2 && auto1>auto3){
                    JOptionPane.showMessageDialog(null, "Gano el primer auto");
                }else if(auto2 > auto1 && auto2 > auto3){
                    JOptionPane.showMessageDialog(null, "Gano el segundo auto");
                    
                }else if(auto3>auto1 && auto3 >auto2){
                    JOptionPane.showMessageDialog(null, "Gano el tercer auto");
                }else{
                    JOptionPane.showMessageDialog(null, "empatados");
                }
                
            }
        }
        
        
    }
    
    
    
}

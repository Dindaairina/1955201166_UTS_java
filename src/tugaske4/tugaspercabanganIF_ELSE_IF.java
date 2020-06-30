/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaske4;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class tugaspercabanganIF_ELSE_IF {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "entry your name!");
        String universitas = JOptionPane.showInputDialog(null, "entry your university");
        String major = JOptionPane.showInputDialog(null, "your major!");
        String semester = JOptionPane.showInputDialog(null, "your semester!");
        int value = Integer.parseInt(JOptionPane.showInputDialog(null, "what is your value?"));
        
        if(value >= 90){
            JOptionPane.showMessageDialog(null,"congratulations " + name + ",you value is A");
        }else if(value >= 85) {
            JOptionPane.showMessageDialog(null,"congratulations " + name + ",you value is B+");
        }else if(value >= 80) {
            JOptionPane.showMessageDialog(null,"congratulations " + name + ",you value is B");
        }else if(value >= 75) {
            JOptionPane.showMessageDialog(null,"congratulations " + name + ",you value is C+");
        }else if(value >= 70) {
            JOptionPane.showMessageDialog(null,"congratulations " + name + ",you value is C");
        
        }else if(value >= 40) {    
            JOptionPane.showMessageDialog(null,"sorry " + name + ",you have to repeat,spirit okay!!!");
        }  
    }
}
 
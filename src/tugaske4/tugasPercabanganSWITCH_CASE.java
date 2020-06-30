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
public class tugasPercabanganSWITCH_CASE {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "entry your name!");
        String universitas = JOptionPane.showInputDialog(null, "entry your university");
        String major = JOptionPane.showInputDialog(null, "your major!");
        String semester = JOptionPane.showInputDialog(null, "your semester!");
        String value = JOptionPane.showInputDialog(null, "what is your value!");
        
        switch (value) {
            case "A":
                JOptionPane.showMessageDialog(null, "congratolations " + name + ", your value is A");
                break;
            case "B+": 
                JOptionPane.showMessageDialog(null, "congratolations " + name + ", your value is B+");
                break;
            case "B":
                JOptionPane.showMessageDialog(null, "congratolations " + name + ", your value is B");
                break;
            case "C+":
                JOptionPane.showMessageDialog(null, "congratolations " + name + ", your value is C+");
                break;
            case "C":
                JOptionPane.showMessageDialog(null, "congratolations " + name + ", your value is C");
                break;
            default: JOptionPane.showMessageDialog(null, "sorry,the value you entered is incorrect");
            
        }  
    }
}

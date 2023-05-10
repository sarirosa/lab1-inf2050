/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bonjournom;

import aleatoire.Person;

/**
 *
 * @author sarirosa
 */
public class BonjourNom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person("Sara", "Boum", 33);
        System.out.printf("Bonjour %s %s %d\n", args[0], args[1], p.getAge());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

/**
 *
 * @author rdhee
 */
public class MainFile {
    public static void main(String[] args) {
        HumanBeing hb1=new HumanBeing();
        HumanBeing hb2=new HumanBeing();
        
        hb1.setName("Ramesh");
        hb1.setAddress("Earth");
        hb1.setEars(2);
        hb1.setNose(1);
        hb1.setEyes(2);
        hb1.setLegs(2);
        hb1.setGender("Male");

        
        hb2.setNose(1);
        hb2.setName("Meenakshi");
        hb2.setAddress("Earth");
        hb2.setEars(2);
        hb2.setEyes(2);
        hb2.setLegs(2);
        hb2.setGender("Female");
        
        System.out.println(hb1.getAddress());
        System.out.println(hb1.getName());
        System.out.println(hb1.getEars());
        System.out.println(hb1.getEyes());
        System.out.println(hb1.getNose());
        System.out.println(hb1.getLegs());
        
    }
}

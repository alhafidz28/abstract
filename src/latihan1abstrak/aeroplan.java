/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1abstrak;

/**
 *
 * @author Sweet.Cakee
 */
public class aeroplan extends abstrak {
    public void walk(){
        System.out.println("Aeroplan is Flying");
    }
    public static void main(String[]args){
    aeroplan garuda=new aeroplan();
    garuda.function();
    garuda.fuel();
    garuda.walk();
        }
    
   
}

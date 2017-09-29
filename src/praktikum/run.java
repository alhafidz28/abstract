/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author Sweet.Cakee
 */
public class run {
    public static void main(String[] args) {
        praktikum1 r1 = new praktikum1(1, 1, 4, 4);
        praktikum1 r2 = new praktikum1(2, 3, 5, 6);
        praktikum1 u = r1.union(r2);
        praktikum1 i = r1.intersection(r2);
        
        if (u.isInside(r2.x1, r2.y1))
            System.out.println("(" + r2.x1 + "," + r2.y1 +") is Inside the union");
        
        System.out.println(r1 +" union " + r2 + " = " + u);
        System.out.println(r1 +" intersect " + r2 + " = " + i);
    }
}

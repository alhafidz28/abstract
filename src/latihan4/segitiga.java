/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author Sweet.Cakee
 */
public class segitiga extends shape{
    private int base;
    private int height;
    
    public segitiga(String color,int base,int height){
    super(color);
    this.base=base;
    this.height=height;
    }
    @Override
    public String toString(){
    return "Segitiga[base="+base+",height="+height+","+super.toString()+"]";
    }
    @Override
    public double getArea(){
    return 0.5*base*height;
    }
}

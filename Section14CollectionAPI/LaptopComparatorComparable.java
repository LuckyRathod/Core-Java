/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section14CollectionAPI;

/**
 *
 * @author Lucky_Rathod
 */
public class LaptopComparatorComparable  implements Comparable<LaptopComparatorComparable>{
    
    private String band;
    private int ram;
    private int price;

    public LaptopComparatorComparable(String band, int ram, int price) {
        this.band = band;
        this.ram = ram;
        this.price = price;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    } 

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "LaptopComparatorComparable{" + "band=" + band + ", ram=" + ram + ", price=" + price + '}';
    }

    @Override
    public int compareTo(LaptopComparatorComparable o) {
       
        if(this.getRam() > o.getRam())
            return 1 ;
        else
            return -1;
    }
    
    
}

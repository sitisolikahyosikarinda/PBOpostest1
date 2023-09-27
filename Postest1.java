/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.postest1;
import java.util.ArrayList;
/**
 *
 * @author Acer
 */
public class Postest1 {

    public static void main(String[] args) {
        ArrayList<sepatu> shoes = new ArrayList();
        
        shoes.add(new sepatu("flatsoes",40,"Hijau"));
        shoes.add(new sepatu("sneakers",42, "Biru"));
        shoes.add(new sepatu("boots",44,"Coklat"));
        shoes.add(new sepatu("Slip On",39,"Hitam"));
        shoes.add(new sepatu("Sandal",37,"Putih"));
    
    
    for (sepatu sepatu : shoes) {
        String alas_kaki = " Sepatu " + sepatu.getJenis() + " Tersedia ukuran " + sepatu.getUkuran() + " dengan warna " + sepatu.getWarna();
        System.out.println (alas_kaki);
    }
    }
    
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.postest1;

/**
 *
 * @author Acer
 */
public class sepatu {
    public String jenis;
    public int ukuran;
    public String warna;

    public sepatu(String jenis, int ukuran, String Warna) {
        this.jenis = jenis;
        this.ukuran = ukuran;
        this.warna = Warna;
    }

    public String getJenis() {
        return jenis;
    }

    public int getUkuran() {
        return ukuran;
    }
    
    public String getWarna() {
        return warna;
    }
}

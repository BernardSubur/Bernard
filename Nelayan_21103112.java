/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis1_21103112;

/**
Nama : Yosef Bernardus Janson Subur
NIM  : 21103112
Kelas: S1SI-05-A
 * @author ASUS
 */
public class Nelayan_21103112 extends Penduduk_21103112 {
    int jmlBeratIkan;
    int jmlSolar;
    double totalPendapatNelayan;

    public double totalPendapatNelayan() {
        return totalPendapatNelayan = (jmlBeratIkan * 8.000) + (jmlSolar + 10.000);
    }
    
    public void DataNelayan(){
        System.out.println("Jumlah Berat Ikan : " + jmlBeratIkan);
        System.out.println("Jumlah Pakai Solar : " + jmlSolar);
    }
    
}

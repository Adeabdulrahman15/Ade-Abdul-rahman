package com.tutorial;

public class MainSetter_Getter {
    public static void main(String[] args){
  
        int total_harga;

        Setter_Getter brg1 = new Setter_Getter();
        brg1.setNama("Bolpoint");
        brg1.setStoc(10);
        brg1.setHarga_satuan(2000);
        brg1.setHarga(10, 2000);
        int a=brg1.getHarga();

        Setter_Getter brg2 = new Setter_Getter();
        brg2.setNama("Pensil");
        brg2.setStoc(10);
        brg2.setHarga_satuan(1000);
        brg2.setHarga(10, 1000);
        int b=brg2.getHarga();
   
        Setter_Getter brg3 = new Setter_Getter();
        brg3.setNama("Penghapus");
        brg3.setStoc(10);
        brg3.setHarga_satuan(500);
        brg3.setHarga(10, 500);
        int c=brg3.getHarga();

        System.out.println("\nNama Alat Tulis = " +brg1.getNama());
        System.out.println("Stoc            = " +brg1.getStoc());
        System.out.println("Harga Satuan    = Rp. " +brg1.getHarga_satuan());
        System.out.println("Harga           = Rp. " +brg1.getHarga());

        System.out.println("\nNama Alat Tulis = " +brg2.getNama());
        System.out.println("Stoc            = " +brg2.getStoc());
        System.out.println("Harga Satuan    = Rp. " +brg2.getHarga_satuan());
        System.out.println("Harga           = Rp. " +brg2.getHarga());

        System.out.println("\nNama Alat Tulis = " +brg3.getNama());
        System.out.println("Stoc            = " +brg3.getStoc());
        System.out.println("Harga Satuan    = Rp. " +brg3.getHarga_satuan());
        System.out.println("Harga           = Rp. " +brg3.getHarga());

        total_harga = a+b+c;
        System.out.println("\nTotal Harga     = Rp. " +total_harga);
    }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan_ukl1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Latihan_Ukl1 {
    
    
    
    
    
    
    
    
    
    
    
    
    public static int inputidPel(int jmlData){
        System.out.println("-----------------------------------");
        Scanner nama = new Scanner (System.in);
        System.out.println("Masukkan id pelanggan : ");
        int getIdpel = nama.nextInt(); 
       
        if (getIdpel>jmlData) {
            System.out.println("Error, jumlah data yang tersedia : " +jmlData);
           return 0;
        }else{
        
        return getIdpel; 
        }
        
    }
    
    public static int inputKwh(){
        Scanner listrik = new Scanner (System.in);
        System.out.println("Masukkan jumlah pemakaian listrik = ");
        int kwh = listrik.nextInt();
        return kwh;
        
        
    }
    
    
    
     public static void main(String[] args) {
       
        String dataPelanggan[][] = {{"1","Galuh","1","Sawojajar"},{"2","Indro","3","Kedung Kandang"},{"3","Jedi","2","Ijen"},{"4","Kanu","3","Dinoyo"}};
        int len = dataPelanggan.length;
        //String golongan[][] ={{"1","450VA","1000"},{"2","1300VA","1300"}};
        
          int kwh = 0;  
              
         int no = inputidPel(len);
         //int tipe data
         //operator tambah bagi kurang/ yang assignment itu yang +=/*=
         //percabangan if else
         //perulangan for if
         //Array atau string datapelanggan[]
         //function return();
         
         
         if(no==0){
             
             return;
         }else{
             kwh = inputKwh();
         }
        
        //if()
           // if ( no == 1){
               // System.out.println("Nama = Galuh");
              //  System.out.println("Golongan = 1");
               // System.out.println("Alamat = Sawojajar");
              
               
               String namaPelanggan;
               String golongan;
               String alamat;
               
               
               
               for(int y=0;y<len+1;y++){
                   
                    if(no == y){
                        int dataId = no-1;
                        int jmlTagihan;
                        namaPelanggan   = dataPelanggan[dataId][1]; 
                        alamat      = dataPelanggan[dataId][3]; 
                        golongan = dataPelanggan[dataId][2];
                        System.out.println("ID Pelanggan = " + no);
                        System.out.println("Nama Pelanggan = " + namaPelanggan);
                        System.out.println("Alamat = " + alamat);
                        System.out.println("Golongan = " + golongan);
                         System.out.println("Pemakaian Listrik = " + kwh +" KWH");
                         
                        
                        if( golongan == "1"){
                            jmlTagihan = kwh * 1000;
                            System.out.println("jumlah Tagihan = " + jmlTagihan);        
                            if(jmlTagihan<50000){
                                 System.out.println("Pembayaran Minimal = 50000");
                                jmlTagihan = 50000+13000;
                               
                            }else{
                                jmlTagihan = jmlTagihan+13000;
                            }
                            System.out.println("Biaya Administrasi  = 13.000"); 
                            System.out.println("Total  Tagihan = " + jmlTagihan);
                        } else if(golongan == "2"){
                            jmlTagihan = kwh * 1300;
                            System.out.println("jumlah Tagihan = " + jmlTagihan);
                            if(jmlTagihan<50000){
                                System.out.println("Pembayaran Minimal = 50000");
                                jmlTagihan = 50000+13000;
                            }else{
                                jmlTagihan = jmlTagihan+13000;
                            }
                             System.out.println("Biaya Administrasi  = 13.000"); 
                             System.out.println("Total  Tagihan = " + jmlTagihan);
                        } else if(golongan == "3"){
                            jmlTagihan = kwh * 1500;
                            System.out.println("jumlah Tagihan = " + jmlTagihan);
                            if(jmlTagihan<50000){
                               System.out.println("Pembayaran Minimal = 50000");
                                jmlTagihan = 50000+13000;
                            }else{
                                jmlTagihan = jmlTagihan+13000;
                            }
                             System.out.println("Biaya Administrasi  = 13.000"); 
                            System.out.println("Total  Tagihan = " + jmlTagihan);
                            
                            
                            
                        }
                       
                        
                        
                       
                        
                    }
                }
                        
                        
                             
                
         /*      int trik = listrik.nextInt();
                int a = (trik*1000)+13000;
                System.out.println("Jumlah nya adalah = " + a);
           */     
                
                
                
                
                
                
          //  }
            
        
             
        
        
    }
}

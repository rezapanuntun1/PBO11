/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.*;
public class Utama {

public static void point_1_1() throws IOException{
BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
        
        String nama;
        
        System.out.print("Masukkan nama anda: ");
        nama = m.readLine();
        System.out.print("masukkan nim : ");
        double angka = Double.parseDouble(m.readLine());
  

}

public static void point_1_2() throws IOException{
    byte[] dt = new byte[5];
        System.out.print("Masukkan kalimat :");
        System.in.read(dt);
        System.out.println("kalimat :");
        for(int i=0; i<dt.length;i++){
            System.out.println((char)dt[i]);
            }
        }


public static void point_2() throws IOException{
    URL url = new URL("http://google.com");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
 
        String inputLine;
        while ((inputLine = br.readLine()) != null) {            
            System.out.println(inputLine);
        }
        br.close();
}

public static void point_3_1(){
    //Tulis txt    
    FileOutputStream out = null ;
        String data = "Helllooooo" ;
        //buka file dari direktori
        try{
            // Sesuaikan direktori berikut sesuai dengan lokasi txt teman-teman
            out = new FileOutputStream("D:\\disini.txt") ; 
            
        }catch(FileNotFoundException e){
            System.out.println("File Tidak Ditemukan");
        }
        // menulis
        
        try{
            for(int i = 0 ; i < data.length() ; i++){
                //Konversi data
                out.write((int)data.charAt(i));
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        //tutup
        try{
            out.close();
            
        }
        catch(IOException e){
            
        }
}

public static void program3_2(){
    //Tampilkan txt
    FileInputStream input = null ;
        int data ; 
        // Membuka File 
        try
        {
            input = new FileInputStream("D:\\Coba.txt") ;
            
        }catch(FileNotFoundException e)
        {
            System.out.println("File gak nemu");
        }
        
        try
        {
            while((data = input.read())!= -1)
            {
                System.out.print((char)data);
            }
            System.out.println();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        try{
            input.close();
            
        }
        catch(IOException E)
        {
            
        }
}

    public static void main(String[] args) throws IOException {
    Scanner S = new Scanner(System.in);
    int pilih;
    do {  
    System.out.println("========Menu========");
        System.out.println("1. Point 1");
        System.out.println("2. Point 2");
        System.out.println("3. Point 3");
        System.out.println("4. Exit");
        System.out.println("Masukkan pilihan: ");
        pilih = S.nextInt();
        
        switch(pilih){
            case 1:
                point_1_1();
                point_1_2();
                break;
            case 2:
                point_2();
                break;
            case 3:
                point_3_1();
                program3_2();
                break;
            case 4:
                System.exit(0);
                    }
        }while (pilih!= 4);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author student
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
 
   FileReader fr = null;
   String linia = "";

   // OTWIERANIE PLIKU:
   try {
     fr = new FileReader("C:\\Users\\student\\Desktop\\plik.txt");
   } catch (FileNotFoundException e) {
       System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
       System.exit(1);
   }

   BufferedReader bfr = new BufferedReader(fr);
   // ODCZYT KOLEJNYCH LINII Z PLIKU:
   try {
     while((linia = bfr.readLine()) != null){
        System.out.println(linia);
     }
    } catch (IOException e) {
        System.out.println("BŁĄD ODCZYTU Z PLIKU!");
        System.exit(2);
   }

   // ZAMYKANIE PLIKU
   try {
     fr.close();
    } catch (IOException e) {
         System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
         System.exit(3);
        }
    }
    
}

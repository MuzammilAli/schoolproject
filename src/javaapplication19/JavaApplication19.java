/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.io.*;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author muzammil
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      int n = scan.nextInt();
      int [] a=new int[n];  
        
      
        for(int i = 0 ; i < n; i++){
            int val = scan.nextInt();
          
          a[i]=val;
          
        }
        
        
        
         scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    
}

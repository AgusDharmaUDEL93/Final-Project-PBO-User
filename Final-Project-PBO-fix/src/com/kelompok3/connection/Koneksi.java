/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok3.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ni Wayan Amanda
 */
public class Koneksi {
    public static Connection koneksi;
    public static Connection getKoneksi(){
        if (koneksi == null) {
            try{
                String url = "jdbc:mysql://localhost:3306/pboproject";
                String user = "root";
                String password ="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Berhasil");
            } catch (Exception e){
                System.out.println(e);
            }
        }
        return koneksi;
    }
    
    public static void main(String args[]){
        getKoneksi();
    }
}

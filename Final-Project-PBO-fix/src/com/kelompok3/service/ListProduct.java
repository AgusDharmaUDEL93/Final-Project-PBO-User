/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok3.service;
import com.kelompok3.connection.Koneksi;
import javax.swing.table.*;
import javax.swing.JTable;
import java.sql.*;
/**
 *
 * @author Ni Wayan Amanda
 */
public class ListProduct {
    public static Connection con;
    public static void tampilList(JTable table){
            try{
                con=        Koneksi.getKoneksi();
                Statement stmt =con.createStatement();
                ResultSet res;
                DefaultTableModel tb =  new DefaultTableModel();
                tb.addColumn("Nama");
                tb.addColumn("Jumlah Stock");
                tb.addColumn("Harga Sewa/Day");
            
                table.setModel(tb);
            
                res=stmt.executeQuery("Select ' from barang");
                while (res.next()){
                    tb.addRow(new Object[]{
                        res.getString("nama_barang"),
                        res.getString("stock"),
                        res.getString("harga_sewa"),
                    });
                }
            } catch(Exception e){
                System.out.println(e);
            }
            
    }
}

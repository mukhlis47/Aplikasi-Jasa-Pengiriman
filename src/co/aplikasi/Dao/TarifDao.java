/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.aplikasi.Dao;

import co.aplikasi.MasterData;
import static java.awt.PageAttributes.MediaType.C;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class TarifDao {
    
        
    public static List<MasterData> getKotaTujuan() {
        List<MasterData> dataList = new ArrayList<>();
        try {
            Scanner scan = new Scanner (new File("C:/JAVA_LATIHAN/AplikasiJasaPengiriman.txt"));
            
            while (scan.hasNextLine()) {
                MasterData md = new MasterData();
                String line = scan.nextLine();
                String [] data = line.split(",");
                
                String tujuan = data[0];
                md.setDestination(tujuan);
                
                md.setRegularService(Double.parseDouble(data[1]));
                md.setKilatService(Double.parseDouble(data[2]));
                md.setSomeDayService(Double.parseDouble(data[3]));
                md.setOverNightService(Double.parseDouble(data[4]));
                md.setHolidayDeliveryService(Double.parseDouble(data[5]));
                
                dataList.add(md);
            }
           
        } catch (FileNotFoundException Ex) {
            System.out.println("Data Tidak Ada");
        }
    
        return dataList;
}
}

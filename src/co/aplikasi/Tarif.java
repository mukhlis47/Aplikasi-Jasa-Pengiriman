/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.aplikasi;

/**
 *
 * @author user
 */
public class Tarif {
   private double beratPaket;
    private String kotaTujuan;
    private String jenisLayanan;
    

    public Tarif() {
    }

    public Tarif(double beratPaket, String kotaTujuan, String jenisLayanan) {
        this.beratPaket = beratPaket;
        this.kotaTujuan = kotaTujuan;
        this.jenisLayanan = jenisLayanan;
    }
    
    

    /**
     * @return the beratPaket
     */
    public double getBeratPaket() {
        return beratPaket;
    }

    /**
     * @param beratPaket the beratPaket to set
     */
    public void setBeratPaket(double beratPaket) {
        this.beratPaket = beratPaket;
    }

    /**
     * @return the kotaTujuan
     */
    public String getKotaTujuan() {
        return kotaTujuan;
    }

    /**
     * @param kotaTujuan the kotaTujuan to set
     */
    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }

    /**
     * @return the jenisLayanan
     */
    public String getJenisLayanan() {
        return jenisLayanan;
    }

    /**
     * @param jenisLayanan the jenisLayanan to set
     */
    public void setJenisLayanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }

    /**
     * @return the asuransi
     */
    
    
}

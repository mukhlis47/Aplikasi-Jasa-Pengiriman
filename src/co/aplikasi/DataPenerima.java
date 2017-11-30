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
public class DataPenerima {
    private String nama;
    private String alamat;
    private String kota;
    private int kodePos;
    private String Provinsi;
    private int noTelp;

    public DataPenerima() {
    }

    public DataPenerima(String nama, String alamat, String kota, int kodePos, String Provinsi, int noTelp) {
        this.nama = nama;
        this.alamat = alamat;
        this.kota = kota;
        this.kodePos = kodePos;
        this.Provinsi = Provinsi;
        this.noTelp = noTelp;
    }
    
    

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the kota
     */
    public String getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(String kota) {
        this.kota = kota;
    }

    /**
     * @return the kodePos
     */
    public int getKodePos() {
        return kodePos;
    }

    /**
     * @param kodePos the kodePos to set
     */
    public void setKodePos(int kodePos) {
        this.kodePos = kodePos;
    }

    /**
     * @return the Provinsi
     */
    public String getProvinsi() {
        return Provinsi;
    }

    /**
     * @param Provinsi the Provinsi to set
     */
    public void setProvinsi(String Provinsi) {
        this.Provinsi = Provinsi;
    }

    /**
     * @return the noTelp
     */
    public int getNoTelp() {
        return noTelp;
    }

    /**
     * @param noTelp the noTelp to set
     */
    public void setNoTelp(int noTelp) {
        this.noTelp = noTelp;
    }
}

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
public class DataPengirim {
    private String nama;
    private String alamat;
    private String kota;
    private int kodePos;
    private String provinsi;
    private int noTelp;

    public DataPengirim() {
    }

    public DataPengirim(String nama, String alamat, String kota, int kodePos, String provinsi, int noTelp) {
        this.nama = nama;
        this.alamat = alamat;
        this.kota = kota;
        this.kodePos = kodePos;
        this.provinsi = provinsi;
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
     * @return the provinsi
     */
    public String getProvinsi() {
        return provinsi;
    }

    /**
     * @param provinsi the provinsi to set
     */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
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

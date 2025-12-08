package Entitas;

public class Layanan {
    private String idLayanan;
    private String namaLayanan;
    private int harga;
    private int durasi;
    private int komosiKaryawan;

    public Layanan(String layanan, String id, int harga, int durasi){
        this.namaLayanan = layanan;
        this.idLayanan = id;
        this.harga = harga;
        this.durasi = durasi;
    }

    public String getInfolayanan(){

    }
}
package Entitas;

import java.util.Date;
import java.util.List;
import Entitas.Layanan;
import Entitas.Kasir;

public class Transaksi {
    private String idTransaksi;
    private Date tanggal;
    private Pelanggan pelanggan;
    private List<Layanan> daftarLayanan;
    private double totalHarga;
    private Kasir kasir;
    private String metodePembayaran;
    private String statusPembayaran; // Lunas / Belum Lunas

    public Transaksi(Pelanggan pelanggan, List<Layanan> layanan, Kasir kasir, String metodePembayaran) {
        this.pelanggan = pelanggan;
        this.daftarLayanan = layanan;
        this.kasir = kasir;
        this.metodePembayaran = metodePembayaran;
        this.tanggal = new Date();
        this.totalHarga = hitungTotal();
        this.statusPembayaran = "Belum Lunas";
    }

    public double hitungTotal() {
        return
    }

    public boolean prosesPembayaran(String metode, double jumlahDibayar) {

    }
    public jumlahDibayar(){

    }
    public void cetakStruk () {

    }
    public getInfoTransaksi() {

    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MotorEncapsulation;

/**
 *
 * @author ASUS
 */
public class KoperasiDemo {

    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Iwan Setiawan", "Jalan Mawar");
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp. " + anggota1.getSimpanan());

        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Soekarno Hatta No.18");
        anggota1.setor(1000000);
        System.out.println("Simpanan" + anggota1.getNama() + " : Rp. " + anggota1.getSimpanan());

        anggota1.pinjam(50000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp. " + anggota1.getSimpanan());
    }
}

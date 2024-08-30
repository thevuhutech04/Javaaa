package BTVN;

import java.util.Scanner;

public class NhanVien {
    private String maSo;
    private String hoTen;
    private double luongCoBan;
    private double hesoLuong;
    private static int soLuongNhanVien = 0;

    public NhanVien() {
        maSo = "";
        hoTen = "";
        luongCoBan = 0;
        hesoLuong = 0;
        soLuongNhanVien++;
    }

    public NhanVien(String maSo, String hoTen, double luongCoBan, double hesoLuong) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.hesoLuong = hesoLuong;
        soLuongNhanVien++;
    }

    public NhanVien(NhanVien nv) {
        maSo = nv.maSo;
        hoTen = nv.hoTen;
        luongCoBan = nv.luongCoBan;
        hesoLuong = nv.hesoLuong;
        soLuongNhanVien++;
    }

    public String getmaSo() {
        return maSo;
    }

    public String gethoTen() {
        return hoTen;
    }

    public double gethesoLuong() {
        return hesoLuong;
    }

    public void setmaSo(String ms) {
        maSo = ms;
    }

    public void sethoTen(String ht) {
        hoTen = ht;
    }

    public void sethesoLuong(double heso) {
        hesoLuong = heso;
    }

    // nhap thong tin nhan vien

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma so: ");
        maSo = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap luong co ban: ");
        luongCoBan = sc.nextDouble();
        System.out.print("Nhap he so luong: ");
        hesoLuong = sc.nextDouble();
    }

    // xuat thong tin nhan vien
    public void xuatThongTin() {
        System.out.println("Ma So: " + maSo);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Luong co ban: " + luongCoBan);
        System.out.println("He so luong: " + hesoLuong);
        System.out.println("Luong: " + tinhluong());
    }

    // tinh luong nhan vien
    public double tinhluong() {
        return luongCoBan * hesoLuong;
    }

    // in so luong nhan vien
    public static void inSoLuongNhanVien() {
        System.out.println("\nSo nhan vien: " + soLuongNhanVien);
    }
}

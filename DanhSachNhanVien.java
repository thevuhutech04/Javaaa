package BTVN;

import java.util.Scanner;

public class DanhSachNhanVien {
    private NhanVien[] danhSachNhanVien;
    private int soLuongNhanVien;

    public DanhSachNhanVien(int soLuongNhanVien) {
        this.soLuongNhanVien = soLuongNhanVien;
        this.danhSachNhanVien = new NhanVien[soLuongNhanVien];
    }

    public void nhapDanhSach() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < soLuongNhanVien; i++) {
            System.out.println("Nhap nhan vien thu " + (i + 1) + ":");
            danhSachNhanVien[i] = new NhanVien();
            danhSachNhanVien[i].nhapThongTin();
        }
    }

    public void xuatDanhSach() {
        System.out.print("*******************************************************");
        System.out.println("\nDanh sach nhan vien va luong cua tung nhan vien la: ");
        for (int i = 0; i < soLuongNhanVien; i++) {
            System.out.println("\nThong tin nhan vien thu: " + (i + 1) + ":");
            danhSachNhanVien[i].xuatThongTin();
        }
    }
}

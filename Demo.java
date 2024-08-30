package BTVN;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Tạo đối tượng bằng cách mặc định
        NhanVien nv1 = new NhanVien();
        // Tạo đối tượng bằng constructor có tham số
        NhanVien nv2 = new NhanVien("123", "Nguyen Van B", 3000, 2.5);
        // Tạo đối tượng bằng constructor sao chép
        NhanVien nv3 = new NhanVien(nv2);

        // Nhập dữ liệu cho 1 nhân viên
        nv1.nhapThongTin();
        // Xuất thông tin
        System.out.println("Thong tin nhan vien 1:");
        nv1.xuatThongTin();
        System.out.println("\nThong tin nhan vien 2:");
        nv2.xuatThongTin();
        System.out.println("\nThong tin nhan vien 3:");
        nv3.xuatThongTin();

        NhanVien.inSoLuongNhanVien();

        // Thay đổi họ tên cho nv1
        nv1.sethoTen("Tran Van A");
        System.out.println("\nThong tin nhan vien 1 sau khi doi");

        NhanVien nvMax = nv1;
        if (nv2.gethesoLuong() > nvMax.gethesoLuong()) {
            nvMax = nv2;
        } else if (nv3.gethesoLuong() > nvMax.gethesoLuong()) {
            nvMax = nv3;
        } else {
            nvMax = nv1;
        }
        System.out.println("\nThong tin nhan vien co he so luong cao nhat la: ");
        nvMax.xuatThongTin();

        // Nhập danh sách nhân viên
        System.out.print("\nNhap so luong nhan vien: ");
        int soLuongNhanVien = sc.nextInt();
        sc.nextLine();

        // Tạo đối tượng DanhSachNhanVien và nhập thông tin
        DanhSachNhanVien danhSach = new DanhSachNhanVien(soLuongNhanVien);
        danhSach.nhapDanhSach();

        // Xuất thông tin từng nhân viên trong danh sách
        danhSach.xuatDanhSach();

        // In số lượng nhân viên trong danh sách
        NhanVien.inSoLuongNhanVien();
    }
}

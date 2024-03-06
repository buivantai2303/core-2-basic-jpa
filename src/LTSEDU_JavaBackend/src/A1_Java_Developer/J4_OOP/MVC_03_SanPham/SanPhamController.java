package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.MVC_03_SanPham;

import java.util.*;

public class SanPhamController {
    private HashMap<Integer, NhaCungCap> NCCList = new HashMap<>();
    private HashMap<Integer, SanPham> SanPhamList = new HashMap<>();
    private HashMap<Integer, LoaiSanPham> LoaiSanPhamList = new HashMap<>();
    public void ThemNCC(NhaCungCap NhaCC) {
        NCCList.put(NhaCC.getNhaCC(), NhaCC);
    }

    public void ThemLoaiSP(LoaiSanPham LoaiSP) {
        LoaiSanPhamList.put(LoaiSP.getLoaiSP(), LoaiSP);
    }

    public void ThemSanPham(SanPham SP) {
        int loaiSP = SP.getLoaiSanPham().getLoaiSP();
        int nhaCC = SP.getNhaCungCap().getNhaCC();

        if (!LoaiSanPhamList.containsKey(loaiSP)) {
            System.out.println("Loại sản phẩm chưa tồn tại. Bạn có muốn thêm loại sản phẩm mới không?");
        }

        if (!NCCList.containsKey(nhaCC)) {
            System.out.println("Nhà cung cấp chưa tồn tại. Bạn có muốn thêm nhà cung cấp mới không?");
        }

        SanPhamList.put(SP.getMaSanPham(), SP);
    }

    public void HienLoai(int LoaiSP) {
        List<SanPham> loaiSPList = new ArrayList<>();
        for (SanPham sp : SanPhamList.values()) {
            if (sp.getLoaiSanPham().getLoaiSP() == LoaiSP) {
                loaiSPList.add(sp);
            }
        }

        loaiSPList.sort(Comparator.comparingInt(sp -> sp.getNhaCungCap().getNhaCC()));

        for (SanPham sp : loaiSPList) {
            System.out.println(sp);
        }
    }

    public void HienNCC(int NhaCC) {
        List<SanPham> nccList = new ArrayList<>();
        for (SanPham sp : SanPhamList.values()) {
            if (sp.getNhaCungCap().getNhaCC() == NhaCC) {
                nccList.add(sp);
            }
        }

        nccList.sort(Comparator.comparingInt(sp -> sp.getLoaiSanPham().getLoaiSP()));

        for (SanPham sp : nccList) {
            System.out.println(sp);
        }
    }
}

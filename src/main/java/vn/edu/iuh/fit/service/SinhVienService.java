package vn.edu.iuh.fit.service;

import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.entity.SinhVien;
import vn.edu.iuh.fit.repositories.SinhVienRepositories;

import java.util.List;
@Service
public class SinhVienService {
    private final SinhVienRepositories sinhVienRepositories;

    public SinhVienService(SinhVienRepositories sinhVienRepositories) {
        this.sinhVienRepositories = sinhVienRepositories;
    }

    public List<SinhVien> getAllSinhVien() {
        return sinhVienRepositories.findAll();
    }

    public SinhVien getSinhVien(long id) {
        return sinhVienRepositories.findById(id).orElse(null);
    }

    public SinhVien saveSinhVien(SinhVien s) {
        return sinhVienRepositories.save(s);
    }
    public void deleteSinhVien(long id) {
        sinhVienRepositories.deleteById(id);
    }

}

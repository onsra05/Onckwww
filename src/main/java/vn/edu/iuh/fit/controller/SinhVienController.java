package vn.edu.iuh.fit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.entity.SinhVien;
import vn.edu.iuh.fit.service.SinhVienService;

import java.util.List;

@Controller
@RequestMapping("/sinhvien")
public class SinhVienController {

    @Autowired
    private SinhVienService sinhVienService;


    public SinhVienController(SinhVienService sinhVienService) {
        this.sinhVienService = sinhVienService;
    }

    @GetMapping
    public String listSinhVien(Model model) {
        List<SinhVien> sinhVienList = sinhVienService.getAllSinhVien();
        model.addAttribute("sinhvienList", sinhVienList);
        return "SinhVien/index";
    }

    @GetMapping("/add")
    public String addSinhVienForm(Model model) {
        model.addAttribute("sinhvien", new SinhVien());
        return "SinhVien/add";
    }

    @PostMapping
    public String saveSinhVien(@ModelAttribute SinhVien sinhVien) {
        sinhVienService.saveSinhVien(sinhVien);
        return "redirect:/sinhvien";
    }

    @GetMapping("/delete/{id}")
    public String deleteSinhVien(@PathVariable Long id) {
        sinhVienService.deleteSinhVien(id);
        return "redirect:/sinhvien";
    }
}
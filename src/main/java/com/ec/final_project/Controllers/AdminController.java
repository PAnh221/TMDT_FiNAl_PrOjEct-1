package com.ec.final_project.Controllers;

import com.ec.final_project.Beans.laisuat;
import com.ec.final_project.Beans.taikhoan_tietkiem;
import com.ec.final_project.Services.laisuatService;
import com.ec.final_project.Services.lichsugiaodichService;
import com.ec.final_project.Services.taikhoan_thanhtoanService;
import com.ec.final_project.Services.taikhoan_tietkiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Welcome/Administrator")
@CrossOrigin
public class AdminController {
    @Autowired
    private lichsugiaodichService lsGDService;

    @Autowired
    private taikhoan_tietkiemService tkTKService;

    @Autowired
    private taikhoan_thanhtoanService tkTTService;

    @Autowired
    private laisuatService lsService;

    @GetMapping("/AllUserStatus")
    public Object GetAllUser_Status() {
        return lsGDService.get_total_user_and_money();
    }

    @GetMapping("/Stonk_Per_Period")
    public List<Object> Get_Stonk() {
        return lsGDService.get_money_percent_stonk_per_period();
    }

    @PostMapping("/All_Saving_Account")
    public List<taikhoan_tietkiem> getall() {
        return tkTKService.getAll();
    }

    @GetMapping("/AllCustomers_And_their_Pay_money")
    public List<Object> thongtinTK_and_sotien_thanhtoan() {
        return tkTTService.thongtinTK_and_tong_sotien_thanhtoan_and_tong_so_taikhoan_tietkiem();
    }

    @GetMapping("/All_laisuat")
    public List<laisuat> getAll_laiSuat() {
        return lsService.getAll();
    }

    @PostMapping("/Change_laisuat")
    public String change(@RequestBody Map<String, String> json) {
        float l, k;
        k = Float.parseFloat(json.get("kyhan"));
        l = Float.parseFloat(json.get("laisuat")) / 1200 * k;
        lsService.change(l, json.get("kyhan"));
        return "change complete";
    }
}

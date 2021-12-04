package com.ec.final_project.Services;

import com.ec.final_project.Beans.taikhoan_tietkiem;
import com.ec.final_project.Beans.thongtintk;
import com.ec.final_project.Repositories.taikhoan_tietkiemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class taikhoan_tietkiemServiceImpl implements taikhoan_tietkiemService{
    @Autowired
    private taikhoan_tietkiemRepository tkTKRepository;

    @Override
    public List<taikhoan_tietkiem> getAll() {
        return tkTKRepository.findAll();
    }

    @Override
    public void addtkTK(int sotien, String sotaikhoan, int acc_id) {
        tkTKRepository.addtkTK(sotien,sotaikhoan,acc_id);
    }

    @Override
    public List<Object> get_thongtintk_join_taikhoan_tietkiem() {
        return tkTKRepository.get_thongtintk_join_taikhoan_tietkiem();
    }

    @Override
    public void updatetkTK(int acc_id, int sotien) {
        tkTKRepository.updatetkTK(sotien,acc_id);
    }
}

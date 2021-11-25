package com.ec.final_project.Services;

import com.ec.final_project.Beans.thongtintk;
import com.ec.final_project.Repositories.thongtintkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class thongtintkServiceImpl implements thongtintkService {

    @Autowired
    private thongtintkRepository tkRepository;

    @Override
    public thongtintk kiemtratk(thongtintk tk) {
        return tkRepository.checktaikhoanExists(tk.getTaikhoan());
    }

    @Override
    public thongtintk savethongtintk(thongtintk tk) {
        return tkRepository.saveAndFlush(tk);
    }

    @Override
    public int timthongtin(thongtintk tk) {
        return tkRepository.findBytaikhoanANDmatkhau(tk.getTaikhoan(), tk.getMatkhau());
    }

    @Override
    public List<thongtintk> getalltk() {
        return tkRepository.findAll();
    }

    @Override
    public Optional<thongtintk> findbyID(int id) {
        return tkRepository.findById(id);
    }
}

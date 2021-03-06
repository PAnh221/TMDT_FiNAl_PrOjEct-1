package com.ec.final_project.Repositories;

import com.ec.final_project.Beans.thongtintk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface thongtintkRepository extends JpaRepository<thongtintk,Integer> {

    @Query("SELECT tk FROM thongtintk tk WHERE tk.taikhoan = :taikhoan or tk.sdt=:sdt or tk.email=:email or tk.soCMND=:soCMND")
    thongtintk checktaikhoanExists(@Param("taikhoan") String taikhoan,@Param("sdt") String sdt,@Param("email")String email,@Param("soCMND")String soCMND);

//    @Query("SELECT tk FROM thongtintk tk WHERE tk.taikhoan = :taikhoan AND tk.matkhau = :matkhau")
//    thongtintk findBytaikhoanANDmatkhau(@Param("taikhoan") String taikhoan,@Param("matkhau") String matkhau);
}

package com.ec.final_project.Repositories;

import com.ec.final_project.Beans.taikhoan_tietkiem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface taikhoan_tietkiemRepository extends JpaRepository<taikhoan_tietkiem, Integer> {
    @Modifying
    @Query(value = "insert into taikhoan_tietkiem ( SoTien,SoTaiKhoan, Acc_id)\n" +
            "values (:sotien,:sotaikhoan,:acc_id);", nativeQuery = true)
    @Transactional
    void addtkTK(@Param("sotien") int sotien, @Param("sotaikhoan") String sotaikhoan, @Param("acc_id") int acc_id);

    @Query("SELECT tk,tkTK,tkTT FROM thongtintk tk LEFT JOIN taikhoan_tietkiem tkTK ON tk.Acc_id = tkTK.acc_id LEFT join taikhoan_thanhtoan tkTT on tk.Acc_id=tkTT.acc_id")
    List<Object> get_thongtintk_join_taikhoan_tietkiem_join_taikhoan_thanhtoan();

    @Modifying(clearAutomatically = true)
    @Query(value = "update taikhoan_tietkiem " +
            "set SoTien=:sotien " +
            ",NgayGui=:ngaygui " +
            "where Acc_id=:acc_id", nativeQuery = true)
    @Transactional
    void updatetkTK(@Param("sotien") int s, @Param("acc_id") int a, @Param("ngaygui")String ngaygui);
}

package com.ec.final_project.Beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class taikhoan_tietkiem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int sotien;
    private Date ngaygui;
    private Date ngaydaohan;
    private int tuychon;
    private String sotaikhoan;
    private int acc_id;
    private int kyhan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSotien() {
        return sotien;
    }

    public void setSotien(int sotien) {
        this.sotien = sotien;
    }

    public Date getNgaygui() {
        return ngaygui;
    }

    public void setNgaygui(Date ngaygui) {
        this.ngaygui = ngaygui;
    }

    public Date getNgaydaohan() {
        return ngaydaohan;
    }

    public void setNgaydaohan(Date ngaydaohan) {
        this.ngaydaohan = ngaydaohan;
    }

    public int getTuychon() {
        return tuychon;
    }

    public void setTuychon(int tuychon) {
        this.tuychon = tuychon;
    }

    public String getSotaikhoan() {
        return sotaikhoan;
    }

    public void setSotaikhoan(String sotaikhoan) {
        this.sotaikhoan = sotaikhoan;
    }

    public int getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }

    public int getKyhan() {
        return kyhan;
    }

    public void setKyhan(int kyhan) {
        this.kyhan = kyhan;
    }

    public taikhoan_tietkiem(int sotien, Date ngaygui, Date ngaydaohan, int tuychon, String sotaikhoan, int acc_id, int kyhan) {
        this.sotien = sotien;
        this.ngaygui = ngaygui;
        this.ngaydaohan = ngaydaohan;
        this.tuychon = tuychon;
        this.sotaikhoan = sotaikhoan;
        this.acc_id = acc_id;
        this.kyhan = kyhan;
    }

    public taikhoan_tietkiem() {
    }

    public taikhoan_tietkiem(int id, int sotien, Date ngaygui, Date ngaydaohan, int tuychon, String sotaikhoan, int acc_id, int kyhan) {
        this.id = id;
        this.sotien = sotien;
        this.ngaygui = ngaygui;
        this.ngaydaohan = ngaydaohan;
        this.tuychon = tuychon;
        this.sotaikhoan = sotaikhoan;
        this.acc_id = acc_id;
        this.kyhan = kyhan;
    }
}
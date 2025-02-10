package com.diegoddev.mangashop.gestion_mangas.dto;

import com.diegoddev.mangashop.gestion_mangas.model.Loan;
import com.diegoddev.mangashop.gestion_mangas.model.LoanStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class LoanDTO {
//    @JsonProperty("loanId")
    private int id;
    private int userId;
    private int mangaId;
    private Date loanDate;
    private Date returnDate;
    private LoanStatus status;

    public LoanDTO() {
    }


    public LoanDTO(Loan loan) {
        this.id= loan.getId();
        this.userId = loan.getUser().getId();
        this.mangaId = loan.getManga().getManga_id();
        this.loanDate = loan.getLoanDate();
        this.returnDate = loan.getReturnDate();
        this.status = loan.getStatus();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMangaId() {
        return mangaId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public void setMangaId(int mangaId) {
        this.mangaId = mangaId;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }
}

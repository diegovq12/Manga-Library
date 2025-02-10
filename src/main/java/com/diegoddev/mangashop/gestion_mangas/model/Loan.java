package com.diegoddev.mangashop.gestion_mangas.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "loans")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    @JsonBackReference
    private User user;

    @ManyToOne
    @JoinColumn(name = "manga_id",nullable = false)
    private Manga manga;

    @Temporal(TemporalType.DATE)
    private Date loanDate;
    @Temporal(TemporalType.DATE)
    private Date returnDate;
    @Enumerated(EnumType.STRING)
    private LoanStatus status;

    public Loan(int id, User user, Manga manga, Date loanDate, Date returnDate, LoanStatus status) {
        this.id = id;
        this.user = user;
        this.manga = manga;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.status = status;
    }

    public Loan() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Manga getManga() {
        return manga;
    }

    public void setManga(Manga manga) {
        this.manga = manga;
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

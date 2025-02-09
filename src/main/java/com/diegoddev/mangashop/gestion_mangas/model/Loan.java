package com.diegoddev.mangashop.gestion_mangas.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "loans")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
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
}

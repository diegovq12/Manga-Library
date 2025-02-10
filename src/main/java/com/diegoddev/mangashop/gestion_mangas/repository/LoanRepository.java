package com.diegoddev.mangashop.gestion_mangas.repository;

import com.diegoddev.mangashop.gestion_mangas.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Integer> {

}

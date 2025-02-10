package com.diegoddev.mangashop.gestion_mangas.controller;

import com.diegoddev.mangashop.gestion_mangas.dto.LoanDTO;
import com.diegoddev.mangashop.gestion_mangas.model.Loan;
import com.diegoddev.mangashop.gestion_mangas.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

    private LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/createLoan")
    public ResponseEntity<LoanDTO> createLoan(@RequestBody LoanDTO loanDTO) {
        LoanDTO newLoan = loanService.createLoan(loanDTO);
        return ResponseEntity.ok(newLoan);
    }

    @GetMapping("/getLoans")
    public ResponseEntity<List<LoanDTO>> getLoans() {
        List<Loan> loans = loanService.getAllLoans();
        List<LoanDTO> loanDTOs = loans.stream()
                .map(LoanDTO::new) // Convierte cada Loan a LoanDTO
                .collect(Collectors.toList());
        return ResponseEntity.ok(loanDTOs);
    }
}

package com.diegoddev.mangashop.gestion_mangas.service;

import com.diegoddev.mangashop.gestion_mangas.dto.LoanDTO;
import com.diegoddev.mangashop.gestion_mangas.model.Loan;
import com.diegoddev.mangashop.gestion_mangas.model.Manga;
import com.diegoddev.mangashop.gestion_mangas.model.User;
import com.diegoddev.mangashop.gestion_mangas.repository.LoanRepository;
import com.diegoddev.mangashop.gestion_mangas.repository.MangaRepository;
import com.diegoddev.mangashop.gestion_mangas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {


    private LoanRepository loanRepository;
    private UserRepository userRepository;
    private MangaRepository mangaRepository;

    @Autowired
    public LoanService(LoanRepository loanRepository, UserRepository userRepository, MangaRepository mangaRepository) {
        this.loanRepository = loanRepository;
        this.userRepository = userRepository;
        this.mangaRepository = mangaRepository;
    }


    public LoanDTO createLoan(LoanDTO loanDTO) {

        Optional<User> userOptional = userRepository.findById(loanDTO.getUserId());
        Optional<Manga> mangaOptional = mangaRepository.findById(loanDTO.getMangaId());

        if (userOptional.isEmpty() || mangaOptional.isEmpty()) {
            throw new IllegalArgumentException("Usuario o manga no encontrado.");
        }

        Loan loan = new Loan();
        loan.setUser(userOptional.get());
        loan.setManga(mangaOptional.get());
        loan.setLoanDate(loanDTO.getLoanDate());
        loan.setReturnDate(loanDTO.getReturnDate());
        loan.setStatus(loanDTO.getStatus());

        Loan savedLoan = loanRepository.save(loan);

        return new LoanDTO(savedLoan);
    }

    public Optional<Loan> getLoanById(int id) {
        return loanRepository.findById(id);
    }

    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }
}

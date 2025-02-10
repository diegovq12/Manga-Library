package com.diegoddev.mangashop.gestion_mangas.dto;

import com.diegoddev.mangashop.gestion_mangas.model.User;
import com.diegoddev.mangashop.gestion_mangas.model.UserRole;

import java.util.List;
import java.util.stream.Collectors;

public class UserDTO {
    private String username;
    private String password;
    private String email;
    private UserRole role;
    private List<LoanDTO> loans;

    public UserDTO() {
    }

    public UserDTO(User user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.email = user.getEmail();
        this.role = user.getRole();
        this.loans = user.getLoans().stream()
                .map(loan -> new LoanDTO(loan)) // LoanDTO no incluye UserDTO
                .collect(Collectors.toList());
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public UserRole getRole() {
        return role;
    }
}

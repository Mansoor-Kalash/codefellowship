package com.axac.ApplicationUser.Repositoris;


import com.axac.ApplicationUser.Models.ApplicationUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<ApplicationUser,Integer> {
    ApplicationUser findByUsername(String username);
}
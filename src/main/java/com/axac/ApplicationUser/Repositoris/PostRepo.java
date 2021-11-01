package com.axac.ApplicationUser.Repositoris;

import com.axac.ApplicationUser.Models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long> {

}

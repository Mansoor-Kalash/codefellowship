package com.axac.ApplicationUser.Models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.security.core.parameters.P;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String body;
    private LocalDate createdAt;
    @ManyToOne
    private ApplicationUser applicationUser;
    public Post(String body, ApplicationUser applicationUser) {
        this.body = body;
        this.applicationUser = applicationUser;
        this.createdAt = LocalDate.now();
    }
    public ApplicationUser getApplicationUser() {
        return applicationUser;
    }
    public void setApplicationUser(ApplicationUser applicationUser) {
        this.applicationUser = applicationUser;
    }
    public Post() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }


}

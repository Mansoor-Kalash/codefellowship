package com.axac.ApplicationUser.Models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.security.core.parameters.P;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String body;
    private LocalDate createdAt;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private ApplicationUser applicationUser;


    @Column(name = "user_id",insertable = false, updatable = false)
    private Long user_id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getUser_id() {
        return user_id;
    }


}

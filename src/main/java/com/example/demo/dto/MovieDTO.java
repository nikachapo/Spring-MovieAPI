package com.example.demo.dto;

import lombok.Data;

@Data
@Entity
public class MovieDTO {

    private Long id;
    private String title;
    private String country;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

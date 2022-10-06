package org.example.medical_cs_21_2_11.model;

import java.util.List;

public class Patient {
    private Long id;
    private String name;
    private String phone;
    private List<Disease> diseases;

    public Patient() {
    }

    public Patient(Long id, String name, String phone, List<Disease> diseases) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.diseases = diseases;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Disease> getDiseases() {
        return diseases;
    }

    public void setDiseases(List<Disease> diseases) {
        this.diseases = diseases;
    }
}

package org.example.medical_cs_21_2_11.controller;

import org.example.medical_cs_21_2_11.data.DatabaseSimulation;
import org.example.medical_cs_21_2_11.model.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {
    private DatabaseSimulation database = new DatabaseSimulation();

    @GetMapping("/patient")
    public String showPatient(@RequestParam(name="id", required=false) Long id,Model model) {

        Patient p = database.findById(id);

        model.addAttribute("patient", p);
        return "patient";
    }

    @GetMapping("/patients")
    public String showAllPatient(Model model) {
        model.addAttribute("patients", database.findAll());
        return "patients";
    }
}

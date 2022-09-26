package org.example.medical_cs_21_2_11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoctorController {
    @GetMapping("/patient")
    public String showPatient(Model model) {
        model.addAttribute("name","Помиканов Андрій");
        return "patient";
    }
}

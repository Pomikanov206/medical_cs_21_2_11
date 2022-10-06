package org.example.medical_cs_21_2_11.data;

import org.example.medical_cs_21_2_11.model.Patient;

import java.util.ArrayList;
import java.util.List;

public class DatabaseSimulation {
    private List<Patient> patientList;
    public DatabaseSimulation() {
        patientList = new ArrayList<>();
        patientList.add(new Patient(1l, "Помиканов А.", "06666666666",null));
        patientList.add(new Patient(2l, "Помиканов T.", "06666634566",null));
        patientList.add(new Patient(3l, "Помиканов И.", "06666612346",null));
    }

    public List<Patient> findAll() {
        return patientList;
    }

    public Patient findById(Long id) {
        for (Patient p: patientList) {
            if(id == p.getId())
                return p;
        }
        return null;
    }
}

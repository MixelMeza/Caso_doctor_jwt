package pe.edu.upeu.clinica.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.clinica.entity.Doctor;

public interface DoctorService {
	Doctor create(Doctor doctor);
    Doctor update(Doctor doctor);
    void delete(Long id);
    Optional<Doctor> read(Long id);
    List<Doctor> readAll();
}

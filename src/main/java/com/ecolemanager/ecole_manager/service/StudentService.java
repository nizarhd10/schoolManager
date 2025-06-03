package com.ecolemanager.ecole_manager.service;

import com.ecolemanager.ecole_manager.entite.Student;
import com.ecolemanager.ecole_manager.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepo.findById(id);
    }

    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        return studentRepo.findById(id).map(student -> {
            student.setNom(updatedStudent.getNom());
            // Ajouter d'autres attributs si besoin
            return studentRepo.save(student);
        }).orElse(null);
    }
}

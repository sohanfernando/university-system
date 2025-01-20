package lk.sohan.universitysystem.service;

import lk.sohan.universitysystem.dto.request.StudentRequestDTO;
import lk.sohan.universitysystem.dto.response.StudentResponseDTO;

import java.util.List;

public interface StudentService {
    StudentResponseDTO createStudent(StudentRequestDTO studentRequestDTO);
    List<StudentResponseDTO> getAllStudents();
    StudentResponseDTO getStudentById(Long id);
    StudentResponseDTO updateStudent(Long id, StudentRequestDTO studentRequestDTO);
    void deleteStudent(Long id);
}

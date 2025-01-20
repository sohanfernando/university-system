package lk.sohan.universitysystem.repository;

import lk.sohan.universitysystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

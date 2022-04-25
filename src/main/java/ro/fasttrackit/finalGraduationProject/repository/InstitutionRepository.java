package ro.fasttrackit.finalGraduationProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.finalGraduationProject.model.Institution;

public interface InstitutionRepository extends JpaRepository<Institution, Integer> {
}

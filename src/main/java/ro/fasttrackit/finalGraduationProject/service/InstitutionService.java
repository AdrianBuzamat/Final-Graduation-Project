package ro.fasttrackit.finalGraduationProject.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ro.fasttrackit.finalGraduationProject.model.Institution;
import ro.fasttrackit.finalGraduationProject.repository.InstitutionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class InstitutionService {
    private static final Logger log = LoggerFactory.getLogger(InstitutionService.class);
    private final InstitutionRepository repository;

    public InstitutionService(InstitutionRepository repository) {
        this.repository = repository;
    }

    public List<Institution> getAll() {
        return repository.findAll();
    }

    public Optional<Institution> getInstitution(Integer id) {
        return repository.findById(id);
    }

    public Institution add(Institution institution) {
        log.info("Saving institution {}", institution);
        return repository.save(institution);
    }

    public Optional<Institution> delete(int id) {
        log.info("Deleting institution with id {}", id);
        Optional<Institution> toDelete = repository.findById(id);
        toDelete.ifPresent(repository::delete);
        return toDelete;
    }

    public Institution replace(int id, Institution institution) {
        log.info("Updating institution {}", institution);
        institution.setId(id);
        return repository.save(institution);
    }
}

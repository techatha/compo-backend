package se311.lab.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se311.lab.entity.Organizer;

import java.util.Optional;

public interface OrganizerDao {
    Page<Organizer> getOrganizer(Pageable pageRequest);
    Optional<Organizer> findById(Long id);
}

package se311.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se311.lab.entity.Organizer;

public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
}
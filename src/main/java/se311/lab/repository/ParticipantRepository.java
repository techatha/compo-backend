package se311.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se311.lab.entity.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}

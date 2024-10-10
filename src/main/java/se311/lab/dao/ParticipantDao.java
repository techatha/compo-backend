package se311.lab.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se311.lab.entity.Participant;

import java.util.Optional;

public interface ParticipantDao {
    Page<Participant> getParticipant(Pageable pageRequest);
    Optional<Participant> findById(Long id);
}

package se311.lab.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se311.lab.entity.Participant;
import se311.lab.repository.ParticipantRepository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ParticipantDaoImpl implements ParticipantDao {
    final ParticipantRepository participantRepository;

    @Override
    public Page<Participant> getParticipant(Pageable pageRequest) {
        return participantRepository.findAll(pageRequest);
    }

    @Override
    public Optional<Participant> findById(Long id) {
        return participantRepository.findById(id);
    }
}

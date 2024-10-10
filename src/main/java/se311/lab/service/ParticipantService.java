package se311.lab.service;

import org.springframework.data.domain.Page;
import se311.lab.entity.Participant;

import java.util.List;

public interface ParticipantService {
    List<Participant> getAllParticipant();
    Page<Participant> getParticipant(Integer page, Integer pageSize);
}

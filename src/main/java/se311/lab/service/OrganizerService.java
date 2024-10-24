package se311.lab.service;

import org.springframework.data.domain.Page;
import se311.lab.entity.Event;
import se311.lab.entity.Organizer;

import java.util.List;

public interface OrganizerService {
    List<Organizer> getAllOrganizer();
    Page<Organizer> getOrganizer(Integer page, Integer pageSize);
    Organizer save(Organizer organizer);
}

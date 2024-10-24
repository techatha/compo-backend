package se311.lab.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se311.lab.entity.Organizer;
import se311.lab.repository.OrganizerRepository;

import java.util.Optional;
import java.util.Scanner;

@Repository
@RequiredArgsConstructor
public class OrganizerDaoImpl implements OrganizerDao{
    final OrganizerRepository organizerRepository;
    @Override
    public Page<Organizer> getOrganizer(Pageable pageRequest) {
        return organizerRepository.findAll(pageRequest);
    }

    @Override
    public Optional<Organizer> findById(Long id) {
        return organizerRepository.findById(id);
    }

    @Override
    public Organizer save(Organizer organizer) {
        return organizerRepository.save(organizer);
    }
}

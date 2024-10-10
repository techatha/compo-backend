package se311.lab.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import se311.lab.entity.Event;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findAll();
    Page<Event> findByTitle(String title, Pageable pageRequest);
    Page<Event> findByTitleContaining (String title, Pageable pageable);
    Page<Event> findByTitleContainingOrDescriptionContaining (String title, String description , Pageable pageable);
    Page<Event> findByTitleContainingAndDescriptionContaining (String title, String description , Pageable pageable);
    Page<Event> findByTitleIgnoreCaseContainingOrDescriptionIgnoreCaseContainingOrOrganizer_NameIgnoreCaseContaining (String title, String description, String organizerName, Pageable pageable);

}






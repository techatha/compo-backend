package se311.lab.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se311.lab.entity.Event;

public interface EventDao {
    Integer getEventSize();
    Page<Event> getEvents(Integer pageSize, Integer page);
    Event getEvent(Long id);
    Event save(Event event);
    Page<Event> getEvents(String title, Pageable page);
}

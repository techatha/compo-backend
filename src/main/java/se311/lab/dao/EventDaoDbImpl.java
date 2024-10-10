//package se311.lab.dao;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Profile;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Repository;
//import se311.lab.entity.Event;
//import se311.lab.repository.EventRepository;
//
//import java.util.List;
//
//@Repository
//@RequiredArgsConstructor
//@Profile("db")
//public class EventDaoDbImpl implements EventDao {
//    final EventRepository eventRepository;
//    @Override
//    public Integer getEventSize() {
//        return Math.toIntExact (eventRepository.count());
//    }
//
//    @Override
//    public Page<Event> getEvents (Integer pageSize, Integer page) {
//        pageSize = pageSize == null ? getEventSize() : pageSize;
//        page = page == null ? 1 : page;
//        return eventRepository.findAll(PageRequest.of(page - 1, pageSize));
//    }
//
//    @Override
//    public Event getEvent(Long id) {
//        return eventRepository.findById(id).orElse(null);
//    }
//
//    @Override
//    public Event save(Event event) {
//        return eventRepository.save(event);
//    }
//
//    @Override
//    public Page<Event> getEvents(String title, Pageable page) {
//        return eventRepository.findByTitleContaining(title, page);
//    }
//}
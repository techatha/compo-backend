package se311.lab.config;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se311.lab.entity.Event;
import se311.lab.entity.Organizer;
import se311.lab.entity.Participant;
import se311.lab.repository.EventRepository;
import se311.lab.repository.OrganizerRepository;
import se311.lab.repository.ParticipantRepository;

@Component
@RequiredArgsConstructor
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    final EventRepository eventRepository;
    final OrganizerRepository organizerRepository;
    final ParticipantRepository participantRepository;
    @Override
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        Organizer org1, org2, org3;
        org1 = organizerRepository.save(Organizer.builder().name("CAMT").build());
        org2 = organizerRepository.save(Organizer.builder().name("CMU").build());
        org3 = organizerRepository.save(Organizer.builder().name("Chiang Mai").build());
        Participant par1, par2, par3, par4,par5;
        par1 = participantRepository.save(Participant.builder().name("Nopparat Suvannapal").telNo("555-0191").build());
        par2 = participantRepository.save(Participant.builder().name("Seksan Homnan").telNo("555-6666").build());
        par3 = participantRepository.save(Participant.builder().name("Stevb Cayron").telNo("555-8888").build());
        par4 = participantRepository.save(Participant.builder().name("Armet Onchu").telNo("555-Biology").build());
        par5 = participantRepository.save(Participant.builder().name("Jittanupap Mahanunii").telNo("555-9999").build());
        Event tempEvent;
        tempEvent = eventRepository.save(Event.builder()
                .category("Academic")
                .title("Midterm Exam")
                .description("A time for taking the exam")
                .location("CAMT Building")
                .date("3rd Sept")
                .time("3.00-4.00 pm.")
                .petAllowed(false).build());
        tempEvent.setOrganizer(org1);
        org1.getOwnEvents().add(tempEvent);
        // Participant
        tempEvent.getParticipants().add(par1);
        par1.getEventHistory().add(tempEvent);
        tempEvent.getParticipants().add(par2);
        par2.getEventHistory().add(tempEvent);
        tempEvent.getParticipants().add(par3);
        par3.getEventHistory().add(tempEvent);
        tempEvent = eventRepository.save(Event.builder()
                .category("Academic")
                .title("Commencement Day")
                .description("A time for celebration")
                .location("CMU Convention hall")
                .date("21th Jan")
                .time("8.00-10.00 pm.")
                .petAllowed(false).build());
        tempEvent.setOrganizer(org2);
        org2.getOwnEvents().add(tempEvent);
        // Participant
        tempEvent.getParticipants().add(par1);
        par1.getEventHistory().add(tempEvent);
        tempEvent.getParticipants().add(par2);
        par2.getEventHistory().add(tempEvent);
        tempEvent.getParticipants().add(par3);
        par3.getEventHistory().add(tempEvent);
        tempEvent = eventRepository.save(Event.builder()
                .category("Cultural")
                .title("Loy Krathong")
                .description("A time for Krathong")
                .location("Ping River")
                .date("21 Nov")
                .time("8.00-10.00 pm.")
                .petAllowed(false).build());
        tempEvent.setOrganizer(org3);
        org3.getOwnEvents().add(tempEvent);
        // Participant
        tempEvent.getParticipants().add(par1);
        par1.getEventHistory().add(tempEvent);
        tempEvent.getParticipants().add(par2);
        par2.getEventHistory().add(tempEvent);
        tempEvent.getParticipants().add(par3);
        par3.getEventHistory().add(tempEvent);
        tempEvent = eventRepository.save(Event.builder()
                .category("Cultural")
                .title("Songkran")
                .description("Let's play water")
                .location("Chiang Mai Moat")
                .date("13th April")
                .time("10.00am - 6.00 pm.")
                .petAllowed(true).build());
        tempEvent.setOrganizer(org3);
        org3.getOwnEvents().add(tempEvent);
        // Participant
        tempEvent.getParticipants().add(par1);
        par1.getEventHistory().add(tempEvent);
        tempEvent.getParticipants().add(par4);
        par4.getEventHistory().add(tempEvent);
        tempEvent.getParticipants().add(par5);
        par5.getEventHistory().add(tempEvent);
    }

    @Override
    public boolean supportsAsyncExecution() {
        return ApplicationListener.super.supportsAsyncExecution();
    }
}

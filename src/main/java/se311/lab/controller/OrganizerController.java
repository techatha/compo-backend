package se311.lab.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import se311.lab.entity.Event;
import se311.lab.entity.Organizer;
import se311.lab.service.OrganizerService;
import se311.lab.util.LabMapper;

@RestController
@RequiredArgsConstructor
public class OrganizerController {
    final OrganizerService organizerService;
    @GetMapping("/organizers")
    ResponseEntity<?> getOrganizers() {
        return ResponseEntity.ok(LabMapper.INSTANCE.getOrganizerDTO(organizerService.getAllOrganizer()));
    }

    @PostMapping("/organizers")
    public ResponseEntity<?> addEvent(@RequestBody Organizer organizer){
        Organizer output = organizerService.save(organizer);
        return ResponseEntity.ok(LabMapper.INSTANCE.getOrganizerDTO(output));
    }
}

package se311.lab.controller;

import jakarta.servlet.ServletException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import se311.lab.util.CloudStorageHelper;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class BucketController {
    final CloudStorageHelper cloudStorageHelper;
    @PostMapping("/uploadFile")
    public ResponseEntity<?> uploadFile(@RequestParam(value = "file")MultipartFile file) throws IOException, ServletException {
        return ResponseEntity.ok(this.cloudStorageHelper.getImageUrl(file, "imageupload-cc494.appspot.com"));
    }

    @PostMapping("/uploadImage")
    public ResponseEntity<?> uploadFileComponent(@RequestPart(value = "image")MultipartFile file) throws IOException, ServletException {
        return ResponseEntity.ok(this.cloudStorageHelper.getStorageFileDto(file, "imageupload-cc494.appspot.com"));
    }
}

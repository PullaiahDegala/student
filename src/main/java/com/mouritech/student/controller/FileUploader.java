//package com.mouritech.student.controller;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class FileUploader {
//    
//    @PostMapping("/upload")
//    public ResponseEntity<?> createUpload(@RequestPart  file) {
//        if (file.isEmpty()) {
//            return ResponseEntity.badRequest().body("Please select a file to upload.");
//        }
//
//        String fileName = file.getOriginalFilename();
//        try {
//            file.transferTo(new File("C:\\upload\\" + fileName));
//            return ResponseEntity.ok("File uploaded successfully.");
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload file.");
//        }
//    }
//}

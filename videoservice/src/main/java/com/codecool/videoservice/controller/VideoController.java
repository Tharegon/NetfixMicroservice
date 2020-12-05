package com.codecool.videoservice.controller;

import com.codecool.videoservice.entity.Video;
import com.codecool.videoservice.service.VideoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class VideoController {
    @Autowired
    VideoService service = new VideoService();

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/videos")
    public List<Video> listAllVideo(){
        return service.getAllVideo();
    }
}

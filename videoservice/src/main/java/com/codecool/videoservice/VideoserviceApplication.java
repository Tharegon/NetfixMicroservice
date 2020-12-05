package com.codecool.videoservice;

import com.codecool.videoservice.entity.Video;
import com.codecool.videoservice.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class VideoserviceApplication {

	@Autowired
	VideoRepository videoRepository;

	public static void main(String[] args) {
		SpringApplication.run(VideoserviceApplication.class, args);
	}

	@Bean
	@Profile("production")
	public CommandLineRunner init() {
		return args -> {
			Video video1 = Video.builder()
					.title("hol a fa főnök")
					.url("https://www.youtube.com/watch?v=5XI1EsHbPYA")
					.build();
			videoRepository.save(video1);
			Video video2 = Video.builder()
					.title("pepsis béla")
					.url("https://www.youtube.com/watch?v=-4UMWgjEi4c&t=25s")
					.build();
			videoRepository.save(video2);
			Video video3 = Video.builder()
					.title("villamos")
					.url("https://www.youtube.com/watch?v=2h9Nt4jKPeo")
					.build();
			videoRepository.save(video3);
			Video video4 = Video.builder()
					.title("Ferike")
					.url("https://www.youtube.com/watch?v=YIHHXwjNiIQ")
					.build();
			videoRepository.save(video4);
		};
	}
}

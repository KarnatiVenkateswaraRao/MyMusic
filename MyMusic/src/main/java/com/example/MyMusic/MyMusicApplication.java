package com.example.MyMusic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class MyMusicApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyMusicApplication.class, args);
	}
	//log.info("starting the app");
}

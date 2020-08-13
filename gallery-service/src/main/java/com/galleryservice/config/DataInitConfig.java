package com.galleryservice.config;

import com.galleryservice.model.Bucket;
import com.galleryservice.repository.BucketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// TODO: Change this implementation and move to Flyway or something else
@Component
public class DataInitConfig implements ApplicationRunner {

    private final BucketRepository bucketRepository;

    @Autowired
    public DataInitConfig(BucketRepository bucketRepository) {
        this.bucketRepository = bucketRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        bucketRepository.deleteAll();
        bucketRepository.saveAll(Stream.of(new Bucket("1", "Java", "OOP", 280, "http://infopulse-univer.com.ua/images/trenings/java.png"),
                new Bucket("2", "Java", "Stream API", 437, "https://www.hdwallpaperslife.com/wp-content/uploads/2018/09/JAVA14-480x270.png"),
                new Bucket("3", "Java", "Collections", 14, "https://i.ytimg.com/vi/oOOESCvGGcI/hqdefault.jpg"),
                new Bucket("4", ".NET", "Basic", 1213, "https://upload.wikimedia.org/wikipedia/commons/0/0e/Microsoft_.NET_logo.png"),
                new Bucket("5", "C++", "Basic", 870, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSmgIz9Ug-MVzBQJMcgXedOXTqHWGmbSu5pPDivz8hrfo_GE0HZEA"),
                new Bucket("6", "JavaScript", "Angular 8", 155, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTg41zepuyHbew8bIsTYeKWJ9RYOnnV922lNa85-fQTVrKDG19K2w"))
                .peek(System.out::println)
                .collect(Collectors.toList()));
    }
}

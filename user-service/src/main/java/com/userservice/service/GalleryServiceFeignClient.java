package com.userservice.service;

import com.userservice.model.Bucket;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@FeignClient(name = "gallery-service")
public interface GalleryServiceFeignClient {

    @PostMapping("/bucket/")
    Bucket createBucket(@Valid @RequestBody Bucket bucket);

    @GetMapping(path = "/bucket/")
    List<Bucket> getAllBuckets();

    @GetMapping(path = "/bucket/{id}")
    Bucket getBucketById(@PathVariable(value = "id") String id);

    @PutMapping("/bucket/{id}")
    Bucket updateBucket(@PathVariable(value = "id") String id, @Valid @RequestBody Bucket bucket);

    @DeleteMapping("/bucket/{id}")
    void deleteBucket(@PathVariable(value = "id") String id);
}

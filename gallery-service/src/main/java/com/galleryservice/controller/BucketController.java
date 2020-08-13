package com.galleryservice.controller;

import com.galleryservice.model.Bucket;
import com.galleryservice.service.BucketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/bucket")
public class BucketController {

    private final BucketService bucketService;

    @Autowired
    public BucketController(BucketService bucketService) {
        this.bucketService = bucketService;
    }

    @PostMapping("/")
    public Bucket createBucket(@Valid @RequestBody Bucket bucket) {
        return bucketService.save(bucket);
    }

    @GetMapping(path = "/")
    public List<Bucket> getAllBuckets() {
        return bucketService.findAll();
    }

    @GetMapping("/{id}")
    public Bucket getBucketById(@PathVariable(value = "id") String id) {
        return bucketService.findById(id);
    }

    @PutMapping("/{id}")
    public Bucket updateBucket(@PathVariable(value = "id") String id, @Valid @RequestBody Bucket bucket) {
        return bucketService.update(id, bucket);
    }

    @DeleteMapping("/{id}")
    public void deleteBucket(@PathVariable(value = "id") String id) {
        bucketService.delete(id);
    }
}

package com.galleryservice.service;

import com.galleryservice.model.Bucket;

import java.util.List;

public interface BucketService {
    List<Bucket> findAll();
    Bucket findById(String id);
    Bucket save(Bucket bucket);
    Bucket update(String id, Bucket bucket);
    void delete(String id);
}

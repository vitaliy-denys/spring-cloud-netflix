package com.userservice.service;

import com.userservice.model.Bucket;

import java.util.List;

public interface UserService {
    List<Bucket> getAllBuckets();
    Bucket getBucketById(String id);
    Bucket createBucket(Bucket bucket);
    Bucket updateBucket(String id, Bucket bucket);
    void deleteBucket(String id);
}

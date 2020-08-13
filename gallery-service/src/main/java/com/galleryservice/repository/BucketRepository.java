package com.galleryservice.repository;

import com.galleryservice.model.Bucket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BucketRepository extends MongoRepository<Bucket, String> {
}

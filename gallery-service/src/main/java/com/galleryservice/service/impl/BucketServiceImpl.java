package com.galleryservice.service.impl;

import com.galleryservice.exception.NotFoundException;
import com.galleryservice.model.Bucket;
import com.galleryservice.repository.BucketRepository;
import com.galleryservice.service.BucketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BucketServiceImpl implements BucketService {

    private final BucketRepository bucketRepository;

    @Autowired
    public BucketServiceImpl(BucketRepository bucketRepository) {
        this.bucketRepository = bucketRepository;
    }

    @Override
    public List<Bucket> findAll() {
        return bucketRepository.findAll();
    }

    @Override
    public Bucket findById(String id) {
        return bucketRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public Bucket save(Bucket bucket) {
        return bucketRepository.save(bucket);
    }

    @Override
    public Bucket update(String id, Bucket bucket) {
        Bucket existedBucket = bucketRepository.findById(id).orElseThrow(NotFoundException::new);
        existedBucket.setTitle(bucket.getTitle());
        existedBucket.setDescription(bucket.getDescription());
        existedBucket.setPersonalNumber(bucket.getPersonalNumber());
        existedBucket.setImageLink(bucket.getImageLink());
        return bucketRepository.save(existedBucket);
    }

    @Override
    public void delete(String id) {
        Bucket bucket = bucketRepository.findById(id).orElseThrow(NotFoundException::new);
        bucketRepository.delete(bucket);
    }
}

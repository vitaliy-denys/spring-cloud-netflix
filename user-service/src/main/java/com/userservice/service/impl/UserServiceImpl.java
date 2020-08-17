package com.userservice.service.impl;

import com.userservice.model.Bucket;
import com.userservice.service.GalleryServiceFeignClient;
import com.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final GalleryServiceFeignClient galleryServiceFeignClient;

    @Autowired
    public UserServiceImpl(GalleryServiceFeignClient galleryServiceFeignClient) {
        this.galleryServiceFeignClient = galleryServiceFeignClient;
    }

    @Override
    public List<Bucket> getAllBuckets() {
        return galleryServiceFeignClient.getAllBuckets();
    }

    @Override
    public Bucket getBucketById(String id) {
        return galleryServiceFeignClient.getBucketById(id);
    }

    @Override
    public Bucket createBucket(Bucket bucket) {
        return galleryServiceFeignClient.createBucket(bucket);
    }

    @Override
    public Bucket updateBucket(String id, Bucket bucket) {
        return galleryServiceFeignClient.updateBucket(id, bucket);
    }

    @Override
    public void deleteBucket(String id) {
        galleryServiceFeignClient.deleteBucket(id);
    }
}

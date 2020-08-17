package com.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Bucket {
    private String id;
    private String title;
    private String description;
    private int personalNumber;
    private String imageLink;
}

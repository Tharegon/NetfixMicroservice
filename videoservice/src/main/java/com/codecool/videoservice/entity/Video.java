package com.codecool.videoservice.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder
public class Video {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;
}

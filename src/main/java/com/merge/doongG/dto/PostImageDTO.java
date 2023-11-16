package com.merge.doongG.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostImageDTO {
    private Long imageId;
    private PostDTO post;
    private String url;
    private String description;
    private String imageType;
}

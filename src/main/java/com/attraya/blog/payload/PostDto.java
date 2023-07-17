package com.attraya.blog.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
public class PostDto {
    private Long id;

    // title should not be empty or null
    // title should have at least 2 characters
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;

    // post description should not be empty or null
    // post description should have at least 10 characters
    @NotEmpty
    @Size(min = 10, message = "Post description should have at least 2 characters")
    private String description;

    // post content should not be empty or null
    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
    private Long categoryId;
}

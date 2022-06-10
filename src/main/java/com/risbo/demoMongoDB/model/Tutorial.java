package com.risbo.demoMongoDB.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "tutorial")
public class Tutorial {
    @Id
    private String id;
    private String name;
    private String shortDescription;
    private String content;
    private String category;
}

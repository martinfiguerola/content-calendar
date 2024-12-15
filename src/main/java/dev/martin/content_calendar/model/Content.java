package dev.martin.content_calendar.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "contents")
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Enumerated(EnumType.STRING)
    @Column(name = "content_type")
    private Type contentType;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
    private String url;
}

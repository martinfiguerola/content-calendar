package dev.martin.content_calendar.repository;

import dev.martin.content_calendar.model.Content;
import dev.martin.content_calendar.model.Status;
import dev.martin.content_calendar.model.Type;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ContentRepositoryTest {

    @Autowired
    private ContentRepository contentRepository;

    @Test
    void saveMethod () {
        // create product
        Content content = new Content();
        content.setTitle("Learn Spring Security");
        content.setDescription("content description");
        content.setStatus(Status.IDEA);
        content.setContentType(Type.ARTICLE);
        content.setUrl("");
        // save product
        Content savedObject = contentRepository.save(content);
        // display product info
        System.out.println(savedObject.toString());
    }
    @Test
    void updateUsingSaveMethod () {
        // find or retrieve on entity by id
        Long id = 1L;
        Content content = contentRepository.findById(id).get();
        // update entity information
        content.setTitle("UPDATE Crash Course Spring Boot JPA");
        // save updated entity
        contentRepository.save(content);
    }

    @Test
    void findByIdMethod () {
        Long id = 1L;
        Content content = contentRepository.findById(id).get();
        System.out.println(content.toString());
    }
    @Test
    void findAllMethod () {
        List<Content> contents = contentRepository.findAll();
        contents.forEach(System.out::println);
    }
    @Test
    void deleteById () {
        Long id = 1L;
        contentRepository.deleteById(id);
    }
    @Test
    void deleteMethod () {
        // find on entity by id
        Long id = 2L;
        Content content = contentRepository.findById(id).get();
        // delete(entity)
        contentRepository.delete(content);
    }

}
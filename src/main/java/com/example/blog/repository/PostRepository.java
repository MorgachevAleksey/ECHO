package com.example.blog.repository;

import com.example.blog.model.Post;
import java.util.List;
import java.util.Optional;

//Универсальный интерфейс для класса хранения Постов
public interface PostRepository {
    Post save(Post post); //Возврат результата операции - то что мы возвращаем Пост после сейва - хорошая практика
    List<Post> findAll();
    Optional<Post> findById(Long id);
    void deleteById(Long id);
}



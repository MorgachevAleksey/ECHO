package com.example.blog.repository;

import com.example.blog.model.Post;
import java.util.*;
import java.io.*;

//Класс для хранения/работы с Постами
public class FilePostRepository implements PostRepository {
    //Поля репозитория
    private final String fileName;
    private final List<Post> posts;
    private long currentId;

    //Конструктор
    public FilePostRepository(String fileName) {
        this.fileName = fileName;
        this.posts = new ArrayList<>();
        this.currentId = 0;
        loadFromFile();
    }

    //Загрузить данные их файла
    private void loadFromFile(){
        //1)Проверить существует ли файл
        //2)Прочитать посты и положить в posts
        //3)Максимальный id сохранить в currentId
        File file = new File(fileName); //Обьект для описания пути к файлу - фактически ничего не делает
        if (!file.exists()){
            currentId = 0;
            return;
        } //Выходим из метода если файл не существует (но он существует т.к. будет создаваться на этапе запуска проекта)

    }

    //Сохранить данные в файл
    private void saveToFile(){

    }

    //Переопределение основных методов
    @Override
    public Post save(Post post){
        return post;
    }

    @Override
    public void deleteById(Long id){

    }

    @Override
    public Optional<Post> findById (Long Id){
        return Optional.empty();
    }

    @Override
    public List<Post> findAll(){
        return List.of();
    }
}

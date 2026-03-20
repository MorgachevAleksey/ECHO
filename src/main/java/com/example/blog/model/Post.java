package com.example.blog.model;

import java.time.LocalDateTime;

public class Post {
    //Поля
    private Long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime createdAt;
    private String tag;

    //Конструкторы
    Post(){

    }
    Post(Long id, String title, String content, String author, LocalDateTime createdAt, String tag){
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.createdAt = createdAt;
        this.tag = tag;
    }
    Post(String title, String content, String author, String tag, LocalDateTime createdAt){
        this.title = title;
        this.content = content;
        this.author = author;
        this.tag = tag;
        this.createdAt = createdAt;
    }

    //Геттеры
    public Long getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public String getContent(){
        return this.content;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getTag(){
        return this.tag;
    }
    public LocalDateTime getCreatedAt(){
        return this.createdAt;
    }

    //Сеттеры
    public void setId(Long id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setContent(String content){
        this.content = content;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }
    public void setTag(String tag){
        this.tag = tag;
    }

    //Методы
    @Override
    public String toString(){
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}

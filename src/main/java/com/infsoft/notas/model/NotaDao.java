package com.infsoft.notas.model;

import javax.persistence.*;

@Entity
public class NotaDao {

    @GeneratedValue
    @Id
    private long id;

    private String title;

    private String text;

    public NotaDao(long id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
    }

    public NotaDao() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

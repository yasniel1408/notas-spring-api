package com.infsoft.notas.model;


public class NotaDto {
    private long id;
    private String title;
    private String text;

    public NotaDto(NotaDao notaDao) {
        this.id = notaDao.getId();
        this.title = notaDao.getTitle();
        this.text = notaDao.getText();
    }

    public NotaDto() {
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

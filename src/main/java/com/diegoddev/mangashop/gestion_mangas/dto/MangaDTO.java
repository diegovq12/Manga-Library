package com.diegoddev.mangashop.gestion_mangas.dto;

import com.diegoddev.mangashop.gestion_mangas.model.Manga;
import com.diegoddev.mangashop.gestion_mangas.model.MangaStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class MangaDTO {

    private String title;
    private String mangaka;
    private String editorial;
    private int year;
    private int stock;
    private int volume;
    private String genre;
    private String image;
    private String description;
    private MangaStatus status;

    public MangaDTO(Manga manga) {
        this.title = manga.getTitle();
        this.mangaka = manga.getMangaka();
        this.editorial = manga.getEditorial();
        this.year = manga.getYear();
        this.stock = manga.getStock();
        this.volume = manga.getVolume();
        this.genre = manga.getGenre();
        this.image = manga.getImage();
        this.description = manga.getDescription();
        this.status = manga.getStatus();
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMangaka() {
        return mangaka;
    }

    public void setMangaka(String mangaka) {
        this.mangaka = mangaka;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MangaStatus getStatus() {
        return status;
    }

    public void setStatus(MangaStatus status) {
        this.status = status;
    }
}

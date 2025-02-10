package com.diegoddev.mangashop.gestion_mangas.service;

import com.diegoddev.mangashop.gestion_mangas.model.Manga;
import com.diegoddev.mangashop.gestion_mangas.repository.MangaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class MangaService {

    @Autowired
    private final MangaRepository mangaRepository;

    public MangaService(MangaRepository mangaRepository) {
        this.mangaRepository = mangaRepository;
    }

    public List<Manga> getMangas() {
        return mangaRepository.findAll();
    }

    public Manga getMangaById(int id) {
        return mangaRepository.findById(id).orElse(null);
    }

    public Manga registerManga(Manga manga) {
        return mangaRepository.save(manga);
    }

}
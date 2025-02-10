package com.diegoddev.mangashop.gestion_mangas.controller;

import com.diegoddev.mangashop.gestion_mangas.dto.MangaDTO;
import com.diegoddev.mangashop.gestion_mangas.model.Manga;
import com.diegoddev.mangashop.gestion_mangas.service.MangaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mangas")
public class MangaController {
    @Autowired
    private MangaService mangaService;

    public MangaController(MangaService mangaService) {
        this.mangaService = mangaService;
    }

    @GetMapping("/getMangas")
    public ResponseEntity<List<Manga>> getMangas() {
        List<Manga> mangas = mangaService.getMangas();
        return ResponseEntity.ok(mangas);
    }

    @GetMapping("/getMangaById")
    public Manga getMangaById(@RequestParam int id) {
        return mangaService.getMangaById(id);
    }

    @PostMapping("/registerManga")
    public ResponseEntity<Manga> registerManga(@RequestBody MangaDTO mangaDTO) {
        Manga manga = new Manga();
        manga.setTitle(mangaDTO.getTitle());
        manga.setMangaka(mangaDTO.getMangaka());
        manga.setEditorial(mangaDTO.getEditorial());
        manga.setYear(mangaDTO.getYear());
        manga.setStock(mangaDTO.getStock());
        manga.setVolume(mangaDTO.getVolume());
        manga.setGenre(mangaDTO.getGenre());
        manga.setImage(mangaDTO.getImage());
        manga.setDescription(mangaDTO.getDescription());
        manga.setStatus(mangaDTO.getStatus());
        return ResponseEntity.ok(mangaService.registerManga(manga));
    }

}

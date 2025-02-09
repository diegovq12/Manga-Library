package com.diegoddev.mangashop.gestion_mangas.controller;

import com.diegoddev.mangashop.gestion_mangas.model.Manga;
import com.diegoddev.mangashop.gestion_mangas.service.MangaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mangas-api")
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
}

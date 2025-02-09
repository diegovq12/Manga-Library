package com.diegoddev.mangashop.gestion_mangas.repository;

import com.diegoddev.mangashop.gestion_mangas.model.Manga;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
@Repository
public interface MangaRepository extends JpaRepository<Manga, Integer> {
}
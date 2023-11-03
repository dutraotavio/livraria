package com.dutradevs.api2.livraria;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrariaRepository extends JpaRepository<Livraria, Long> {

    Page<Livraria> findAllByDisponivelTrue(Pageable paginacao);
}

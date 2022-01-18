package com.gerardhynes.betterreads.user;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.domain.Slice;

import java.awt.print.Pageable;

public interface BooksByUserRepository extends CassandraRepository<BooksByUser, String> {
    Slice<BooksByUser> findAllById(String id, Pageable pageable);
}

package com.esererk.ReadingIsGood.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GenericRepository<T> extends JpaRepository<T, Long> {
}

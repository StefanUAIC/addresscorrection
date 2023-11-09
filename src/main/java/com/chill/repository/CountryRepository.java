package com.chill.repository;

import com.chill.entity.Country;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Integer> {
    Optional<Country> findByName(String name);

    Boolean existsByName(String name);
}

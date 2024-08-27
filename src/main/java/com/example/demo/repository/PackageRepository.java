package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Package;

public interface PackageRepository extends JpaRepository<Package, Integer> {

}

package com.example.modelnview;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MydataRepository extends JpaRepository<MyData, Long> {
}

package com.ustinterview.interviewerform.repository;

import com.ustinterview.interviewerform.entity.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageDataRepository extends JpaRepository<ImageData, Long> {
}

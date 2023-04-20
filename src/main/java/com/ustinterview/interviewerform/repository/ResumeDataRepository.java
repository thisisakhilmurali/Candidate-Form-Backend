package com.ustinterview.interviewerform.repository;

import com.ustinterview.interviewerform.entity.ResumeData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeDataRepository extends JpaRepository<ResumeData, Long> {
}

package com.ustinterview.interviewerform.service;

import com.ustinterview.interviewerform.entity.Candidate;
import com.ustinterview.interviewerform.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    public Candidate saveCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

}

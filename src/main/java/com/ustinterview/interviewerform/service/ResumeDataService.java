package com.ustinterview.interviewerform.service;

import com.ustinterview.interviewerform.entity.ResumeData;
import com.ustinterview.interviewerform.repository.ResumeDataRepository;
import com.ustinterview.interviewerform.utils.ImageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class ResumeDataService {

    @Autowired
    private ResumeDataRepository resumeDataRepository;

    public String uploadPdf(MultipartFile file) throws IOException {
        ResumeData imageData = resumeDataRepository.save(
                ResumeData.builder()
                        .name(file.getOriginalFilename())
                        .type(file.getContentType())
                        .resumeData(ImageUtils.compressImage(file.getBytes())).build()
        );

        if(imageData != null) {
            return "File Uploaded Successfully: " + file.getOriginalFilename();
        }

        return null;
    }
}

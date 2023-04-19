package com.ustinterview.interviewerform.service;

import com.ustinterview.interviewerform.entity.ImageData;
import com.ustinterview.interviewerform.repository.ImageDataRepository;
import com.ustinterview.interviewerform.utils.ImageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class ImageDataService {

    @Autowired
    private ImageDataRepository imageDataRepository ;


    public String uploadImage(MultipartFile file) throws IOException {
        ImageData imageData = imageDataRepository.save(
                ImageData.builder()
                        .name(file.getOriginalFilename())
                        .type(file.getContentType())
                        .imageData(ImageUtils.compressImage(file.getBytes())).build()
        );

        if(imageData != null) {
            return "File Uploaded Successfully: " + file.getOriginalFilename();
        }

        return null;

    }


}

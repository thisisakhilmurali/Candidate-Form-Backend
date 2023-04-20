package com.ustinterview.interviewerform.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "resume_data")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ResumeData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;

    @Lob
    @Column(name = "resume_data")
    private  byte[] resumeData;
}

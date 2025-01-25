package com.bunthong_job_portal.jobportal.services;

import com.bunthong_job_portal.jobportal.entity.JobPostActivity;
import com.bunthong_job_portal.jobportal.entity.JobSeekerProfile;
import com.bunthong_job_portal.jobportal.entity.JobSeekerSave;
import com.bunthong_job_portal.jobportal.repository.JobSeekerSaveRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerSaveService {

    private final JobSeekerSaveRepository jobSeekerSaveRepository;

    public JobSeekerSaveService(JobSeekerSaveRepository jobSeekerSaveRepository) {
        this.jobSeekerSaveRepository = jobSeekerSaveRepository;
    }

    public List<JobSeekerSave> getCandidatesJob(JobSeekerProfile userAccountId) {
        return jobSeekerSaveRepository.findByUserId(userAccountId);
    }

    public List<JobSeekerSave> getJobCandidates(JobPostActivity job) {
        return jobSeekerSaveRepository.findByJob(job);
    }
}
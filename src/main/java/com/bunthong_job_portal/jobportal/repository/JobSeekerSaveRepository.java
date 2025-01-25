package com.bunthong_job_portal.jobportal.repository;

import com.bunthong_job_portal.jobportal.entity.JobPostActivity;
import com.bunthong_job_portal.jobportal.entity.JobSeekerProfile;
import com.bunthong_job_portal.jobportal.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    public List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);

}
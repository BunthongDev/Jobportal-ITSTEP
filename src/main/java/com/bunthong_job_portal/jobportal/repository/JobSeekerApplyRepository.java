package com.bunthong_job_portal.jobportal.repository;

import com.bunthong_job_portal.jobportal.entity.JobPostActivity;
import com.bunthong_job_portal.jobportal.entity.JobSeekerApply;
import com.bunthong_job_portal.jobportal.entity.JobSeekerProfile;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);
}
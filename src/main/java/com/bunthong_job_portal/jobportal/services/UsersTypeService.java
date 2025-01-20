package com.bunthong_job_portal.jobportal.services;

import com.bunthong_job_portal.jobportal.entity.Users;
import com.bunthong_job_portal.jobportal.entity.UsersType;
import com.bunthong_job_portal.jobportal.repository.UsersTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeService {

    private final UsersTypeRepository usersTypeRepository;

    public UsersTypeService(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }

    public List<UsersType> getAll() {
        return usersTypeRepository.findAll();
    }
}

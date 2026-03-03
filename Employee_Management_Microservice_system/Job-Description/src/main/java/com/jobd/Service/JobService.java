package com.jobd.Service;

import com.jobd.DTO.JobDto;

import java.util.List;

public interface JobService {

    public JobDto savejob(JobDto jobDto);

    public List<JobDto> all();

    public JobDto updated(Long jobId,JobDto jobDto);

    public String deletess(Long jobId);

    public JobDto getsingle(Long jobId);
}

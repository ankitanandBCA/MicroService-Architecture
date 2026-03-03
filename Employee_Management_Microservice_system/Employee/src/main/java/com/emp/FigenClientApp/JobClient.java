package com.emp.FigenClientApp;

import com.emp.DTO.JobDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="JOB-DESCRIPTION")
public interface JobClient {

    @GetMapping("/job/{id}")
    JobDto getjob(@PathVariable Long jobId);
}

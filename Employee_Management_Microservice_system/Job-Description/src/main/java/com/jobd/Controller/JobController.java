package com.jobd.Controller;

import com.jobd.DTO.JobDto;
import com.jobd.Service.JobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobController {

    private final JobServiceImpl jobService;

    public JobController(JobServiceImpl jobService) {
        this.jobService = jobService;
    }

    @PostMapping("/save")
    public JobDto add(@RequestBody JobDto jobDto) {
        return jobService.savejob(jobDto);
    }

    @GetMapping("/all")
    public List<JobDto> getAll() {
        return jobService.all();
    }

    @GetMapping("/{id}")
    public JobDto getSingle(@PathVariable Long id) {
        return jobService.getsingle(id);
    }

    @PutMapping("/update/{id}")
    public JobDto update(@PathVariable Long id,
                         @RequestBody JobDto jobDto) {
        return jobService.updated(id, jobDto);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return jobService.deletess(id);
    }
}
package com.jobd.Service;

import com.jobd.DTO.JobDto;
import com.jobd.Model.Job;
import com.jobd.Repositry.JobRepo;
import com.netflix.discovery.converters.Auto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private final JobRepo jobRepo;
    private final ModelMapper modelMapper;

    public JobServiceImpl(JobRepo jobRepo, ModelMapper modelMapper) {
        this.jobRepo = jobRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public JobDto savejob(JobDto jobDto) {

        Job job = modelMapper.map(jobDto, Job.class);
        Job saved = jobRepo.save(job);

        return modelMapper.map(saved, JobDto.class);
    }

    @Override
    public List<JobDto> all() {
        return jobRepo.findAll()
                .stream()
                .map(job -> modelMapper.map(job, JobDto.class))
                .toList();
    }

    @Override
    public JobDto updated(Long jobId, JobDto jobDto) {

        Job existing = jobRepo.findById(jobId)
                .orElseThrow(() -> new RuntimeException("Job not found"));

        existing.setJobTitle(jobDto.getJobTitle());
        existing.setPosition(jobDto.getPosition());
        existing.setExperience(jobDto.getExperience());
        existing.setSalary(jobDto.getSalary());
        existing.setTotalWorkProject(jobDto.getTotalWorkProject());

        Job updated = jobRepo.save(existing);

        return modelMapper.map(updated, JobDto.class);
    }

    @Override
    public String deletess(Long jobId) {

        if (!jobRepo.existsById(jobId)) {
            throw new RuntimeException("Job not found");
        }

        jobRepo.deleteById(jobId);
        return "Job deleted successfully";
    }

    @Override
    public JobDto getsingle(Long jobId) {

        Job job = jobRepo.findById(jobId)
                .orElseThrow(() -> new RuntimeException("Job not found"));

        return modelMapper.map(job, JobDto.class);   // ✔ FIXED
    }
}

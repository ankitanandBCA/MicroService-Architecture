package com.emp.DTO;
public class JobDto {

    private Long jobId;

    private String jobTitle;
    private String position;
    private Long experience;   // ✔ fixed
    private Long salary;
    private Long totalWorkProject;

    public JobDto() {}

    // constructor + getter + setter


    public JobDto(Long jobId, String jobTitle, String position, Long experience, Long salary, Long totalWorkProject) {
        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.position = position;
        this.experience = experience;
        this.salary = salary;
        this.totalWorkProject = totalWorkProject;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Long getExperience() {
        return experience;
    }

    public void setExperience(Long experience) {
        this.experience = experience;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Long getTotalWorkProject() {
        return totalWorkProject;
    }

    public void setTotalWorkProject(Long totalWorkProject) {
        this.totalWorkProject = totalWorkProject;
    }

    @Override
    public String toString() {
        return "JobDto{" +
                "jobId=" + jobId +
                ", jobTitle='" + jobTitle + '\'' +
                ", position='" + position + '\'' +
                ", experience=" + experience +
                ", salary=" + salary +
                ", totalWorkProject=" + totalWorkProject +
                '}';
    }
}
package edu.fu.dao;

import edu.fu.entities.Job;

import java.util.List;

public interface JobDao {
    Job findById(long id);

    Job createJob(Job job);

    List<Job> findAllJobs();
}

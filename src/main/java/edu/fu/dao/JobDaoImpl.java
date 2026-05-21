package edu.fu.dao;

import edu.fu.entities.Job;
import edu.fu.utils.DbContext;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class JobDaoImpl implements JobDao {
    private EntityManager entityManager;

    public JobDaoImpl() {
        entityManager = DbContext.getEntityManager();
    }

    @Override
    public Job findById(long id) {
        return null;
    }

    @Override
    public Job createJob(Job job) {
        EntityTransaction tx = null;

        try {
            tx = entityManager.getTransaction();
            tx.begin();

            entityManager.persist(job);

            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            throw new RuntimeException(e);
        }
        return job;
    }

    @Override
    public List<Job> findAllJobs() {

        TypedQuery typedQuery = entityManager.createQuery(
                "SELECT j FROM Job j", Job.class);

        return typedQuery.getResultList();
    }
}

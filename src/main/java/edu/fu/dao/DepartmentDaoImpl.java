package edu.fu.dao;

import edu.fu.entities.Department;
import edu.fu.utils.DbContext;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao {
    private EntityManager entityManager;

    public DepartmentDaoImpl() {
        entityManager = DbContext.getEntityManager();
    }

    @Override
    public Department findById(long id) {
        return null;
    }

    @Override
    public Department create(Department department) {
        EntityTransaction transaction = null;

        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

            entityManager.persist(department);

            transaction.commit();

            return department;

        } catch (Exception e) {
            transaction.rollback();
            throw new RuntimeException(e);
        }

    }

    @Override
    public Department update(Department department) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Department> findAll() {
        return List.of();
    }
}

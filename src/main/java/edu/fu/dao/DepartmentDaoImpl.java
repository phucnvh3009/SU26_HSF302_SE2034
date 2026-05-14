package edu.fu.dao;

import edu.fu.entities.Department;
import edu.fu.utils.DbContext;
import jakarta.persistence.EntityManager;

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
        entityManager.persist(department);
        return department;
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

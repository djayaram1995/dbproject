package com.devbydj.dbproject.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DbService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void deleteAuthPermission() {
        try{
            int deleteCount = entityManager.createNativeQuery("DELETE FROM checktable").executeUpdate();
            System.out.println(deleteCount);
        }catch (Exception e) {
            System.out.println(e);
        }

    }
}

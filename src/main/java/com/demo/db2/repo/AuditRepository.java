package com.demo.db2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.db2.entity.AuditLog;

public interface AuditRepository extends JpaRepository<AuditLog, Long>{

}

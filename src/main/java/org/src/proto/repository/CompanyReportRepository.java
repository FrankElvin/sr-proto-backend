package org.src.proto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.src.proto.model.CompanyReport;

@Repository
public interface CompanyReportRepository extends JpaRepository<CompanyReport, Long> {
}

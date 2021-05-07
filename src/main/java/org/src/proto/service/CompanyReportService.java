package org.src.proto.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.src.proto.model.CompanyReport;
import org.src.proto.repository.CompanyReportRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyReportService implements GraphQLQueryResolver {

    @Autowired
    CompanyReportRepository reportRepository;

    public List<CompanyReport> getAllReports() {
        return reportRepository.findAll();
    }

    public CompanyReport getReport(Long reportId) {
        Optional<CompanyReport> tryReport = reportRepository.findById(reportId);
        return tryReport.orElse(null);
    }

}

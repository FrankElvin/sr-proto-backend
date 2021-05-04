package org.src.proto.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company_report", schema = "proto")

@Getter
@Setter
public class CompanyReport {

    @Id
    @Column(name = "report_id", unique = true)
    private Long reportId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "company_balance")
    private Double companyBalance;

}

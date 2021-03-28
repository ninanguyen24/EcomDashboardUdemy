package com.udemy.ecomdashboard.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CompanyRevenue", schema = "ecom_udemy)")
public class CompanyRevenue {
    @Column(name="Revenue_Month", nullable = false)
}

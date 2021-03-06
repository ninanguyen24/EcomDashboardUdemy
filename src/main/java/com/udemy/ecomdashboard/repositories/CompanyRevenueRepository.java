package com.udemy.ecomdashboard.repositories;


import com.udemy.ecomdashboard.entity.CompanyRevenue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//Jpa repository mapped with entity object
@Repository
@Qualifier(value = "companyRevenueRepository")
public interface CompanyRevenueRepository extends JpaRepository<CompanyRevenue, Long> {


}

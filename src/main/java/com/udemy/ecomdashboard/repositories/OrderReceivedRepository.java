package com.udemy.ecomdashboard.repositories;

import com.udemy.ecomdashboard.entity.CompanyRevenue;
import com.udemy.ecomdashboard.entity.OrderReceived;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "orderReceivedRepository")
public interface OrderReceivedRepository extends JpaRepository<OrderReceived,Long> {
}

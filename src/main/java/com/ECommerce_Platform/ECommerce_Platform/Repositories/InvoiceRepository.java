package com.ECommerce_Platform.ECommerce_Platform.Repositories;

import com.ECommerce_Platform.ECommerce_Platform.Models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}

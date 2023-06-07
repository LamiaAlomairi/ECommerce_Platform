package com.ECommerce_Platform.ECommerce_Platform.Repositories;

import com.ECommerce_Platform.ECommerce_Platform.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

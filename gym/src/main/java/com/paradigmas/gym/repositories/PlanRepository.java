package com.paradigmas.gym.repositories;

import com.paradigmas.gym.models.Plans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends JpaRepository<Plans, Long> {
}

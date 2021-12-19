package com.apprentcarproject.repository;

import com.apprentcarproject.model.CarCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CarCategoryRepository extends JpaRepository<CarCategory, Long> {


}

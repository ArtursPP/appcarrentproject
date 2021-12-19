package com.apprentcarproject.repository;

import com.apprentcarproject.model.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OfficeRepository extends JpaRepository <Office, Long >{


}

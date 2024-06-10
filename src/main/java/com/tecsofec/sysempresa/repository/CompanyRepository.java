package com.tecsofec.sysempresa.repository;

import com.tecsofec.sysempresa.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

    @Query("select c from Company c where c.state= true")
    List<Company> findAll();
}

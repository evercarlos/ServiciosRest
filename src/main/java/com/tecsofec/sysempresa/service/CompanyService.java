package com.tecsofec.sysempresa.service;

import com.tecsofec.sysempresa.model.Company;
import com.tecsofec.sysempresa.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    public Company save(Company company) {
        log.info("save in company {}", company.getName());
        return companyRepository.save(company);
    }

    public Company findById(Integer id) {
        return companyRepository.findById(id).orElse(null);
    }

    public Company update(Company company) {
        return companyRepository.save(company);
    }

    public Company delete(Integer id) {
        Company company = findById(id);
        company.setState(Boolean.FALSE);
        return companyRepository.save(company);
    }
}

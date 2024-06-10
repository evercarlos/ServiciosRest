package com.tecsofec.sysempresa.controller.v1;

import com.tecsofec.sysempresa.model.Company;
import com.tecsofec.sysempresa.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/company", produces = "application/json")
public class CompanyController {

    private final CompanyService companyService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return new ResponseEntity<>(companyService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Company company) {
        return new ResponseEntity<>(companyService.save(company), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Company company) {
        return new ResponseEntity<>(companyService.update(company), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> find(@PathVariable(value = "id") Integer id) {
        return new ResponseEntity<>(companyService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id) {
        return new ResponseEntity<>(companyService.delete(id), HttpStatus.OK);
    }
}

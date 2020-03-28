package com.vg.banking.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vg.banking.dto.Investment;

@Repository
@Transactional
public interface InvestmentRepo extends JpaRepository<Investment, String> {

}

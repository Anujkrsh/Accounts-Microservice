package com.olivebank.accounts.repository;

import com.olivebank.accounts.entity.Accounts;
import com.olivebank.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
}

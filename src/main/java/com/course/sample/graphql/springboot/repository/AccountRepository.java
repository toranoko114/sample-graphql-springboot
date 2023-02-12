package com.course.sample.graphql.springboot.repository;

import com.course.sample.graphql.springboot.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, String> {

}

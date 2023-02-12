package com.course.sample.graphql.springboot.repository;

import com.course.sample.graphql.springboot.entity.ServiceGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceGroupRepository extends CrudRepository<ServiceGroup, String> {
}
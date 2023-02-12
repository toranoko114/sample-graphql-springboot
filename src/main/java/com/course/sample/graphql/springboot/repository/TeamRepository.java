package com.course.sample.graphql.springboot.repository;

import com.course.sample.graphql.springboot.entity.Team;
import java.util.List;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<Team, String> {

  @Query("SELECT team_id, belonging_service_group_id, team_name, team_authority" +
      " FROM team WHERE belonging_service_group_id = :serviceGroupId")
  List<Team> findByServiceGroupId(String serviceGroupId);
}

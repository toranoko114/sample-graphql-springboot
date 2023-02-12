package com.course.sample.graphql.springboot.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class Team {
  @Id private String teamId;
  private String belongingServiceGroupId;
  private String teamName;
  private String teamAuthority;
}


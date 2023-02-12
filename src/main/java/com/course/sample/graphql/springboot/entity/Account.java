package com.course.sample.graphql.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@AllArgsConstructor
public class Account {
  @Id private String accountId;
  private String userName;
  private int age;
  private String accountType;
  private String belongingServiceGroupId;
  private String belongingTeamId;
}

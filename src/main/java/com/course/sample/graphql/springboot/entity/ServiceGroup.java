package com.course.sample.graphql.springboot.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class ServiceGroup {
  @Id private String serviceGroupId;
  private String serviceGroupName;
}

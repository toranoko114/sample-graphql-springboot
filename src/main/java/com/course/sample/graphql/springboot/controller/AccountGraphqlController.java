package com.course.sample.graphql.springboot.controller;

import com.course.sample.graphql.springboot.entity.Account;
import com.course.sample.graphql.springboot.entity.ServiceGroup;
import com.course.sample.graphql.springboot.entity.Team;
import com.course.sample.graphql.springboot.repository.AccountRepository;
import com.course.sample.graphql.springboot.repository.ServiceGroupRepository;
import com.course.sample.graphql.springboot.repository.TeamRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class AccountGraphqlController {

  private AccountRepository accountRepository;

  private ServiceGroupRepository serviceGroupRepository;

  private TeamRepository teamRepository;

  @QueryMapping
  public Account accountById(@Argument final String accountId) {
    final Optional<Account> acc = accountRepository.findById(accountId);
    return acc.orElse(null);
  }

  @SchemaMapping
  public ServiceGroup serviceGroup(final Account account) {
    final Optional<ServiceGroup> sg = serviceGroupRepository.findById(
        account.getBelongingServiceGroupId());
    return sg.orElse(new ServiceGroup());
  }

  @SchemaMapping
  public Team team(final Account account) {
    final Optional<Team> t = teamRepository.findById(account.getBelongingTeamId());
    return t.orElse(new Team());
  }

  @SchemaMapping
  public ServiceGroup serviceGroup(final Team team) {
    final Optional<ServiceGroup> sg = serviceGroupRepository.findById(
        team.getBelongingServiceGroupId());
    return sg.orElse(new ServiceGroup());
  }
}
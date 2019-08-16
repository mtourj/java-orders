package com.lambdaschool.javaorders.repos;

import com.lambdaschool.javaorders.models.Agent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository extends CrudRepository<Agent, Long> {

}

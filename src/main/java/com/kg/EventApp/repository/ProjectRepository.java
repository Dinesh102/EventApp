package com.kg.EventApp.repository;

import com.kg.EventApp.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository("projectRepository")
public interface ProjectRepository extends JpaRepository<Project, Long> {

}

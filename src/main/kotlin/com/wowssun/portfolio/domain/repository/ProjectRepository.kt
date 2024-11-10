package com.wowssun.portfolio.domain.repository

import com.wowssun.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Project, Long>
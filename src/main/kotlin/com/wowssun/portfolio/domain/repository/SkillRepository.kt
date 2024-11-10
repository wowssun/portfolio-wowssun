package com.wowssun.portfolio.domain.repository

import com.wowssun.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long>
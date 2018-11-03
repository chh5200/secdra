package com.junjie.secdraservice.dao

import com.junjie.secdraservice.model.Draw
import com.junjie.secdraservice.model.Tag
import io.lettuce.core.dynamic.annotation.Param
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.jpa.repository.Query

interface IDrawDao : JpaRepository<Draw, String>, JpaSpecificationExecutor<Draw> {
//    @Query("select draw.* fROM draw INNER JOIN tag where draw_id = draw.id && tag.name= %?1")
//    fun findByTag(@Param("introduction") introduction: String): List<Draw>
}
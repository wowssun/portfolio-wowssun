package com.wowssun.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Link(
        name: String,
        content: String,
        isActive: Boolean
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "link_id")
    var id: Long? = null

    var name : String = name
    var content: String = content
    //is_active
    var isActive: Boolean = isActive
}
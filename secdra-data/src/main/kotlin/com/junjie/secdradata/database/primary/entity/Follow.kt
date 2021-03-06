package com.junjie.secdradata.database.primary.entity

import org.hibernate.annotations.GenericGenerator
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.io.Serializable
import java.util.*
import javax.persistence.Entity
import javax.persistence.EntityListeners
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * 关注或粉丝
 * @author fjj
 */
@Entity
@EntityListeners(AuditingEntityListener::class)
class Follow : Serializable {
    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid") //这个是hibernate的注解/生成32位UUID
    @GeneratedValue(generator = "idGenerator")
    var id: String? = null

    lateinit var followerId: String

    lateinit var followingId: String

    @CreatedDate
    var createDate: Date? = null

    constructor()

    constructor(followerId: String, followingId: String) {
        this.followerId = followerId
        this.followingId = followingId
    }
}
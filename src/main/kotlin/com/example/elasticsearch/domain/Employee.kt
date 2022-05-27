package com.example.elasticsearch.domain

import org.hibernate.Hibernate
import org.springframework.data.elasticsearch.annotations.Document
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "employee")
@Document(indexName = "employee")
data class Employee constructor(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long?, @Column(nullable = false) var name: String
) {


    constructor(name: String) : this(null, name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Employee
        return id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id )"
    }
}


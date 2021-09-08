package com.elfz.partneraccountapi

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class Account(
    @Id
    val id: String = ObjectId.get().toString(),
    val name: String,
    val description: String,
    val product: String,
    val createdDate: LocalDateTime = LocalDateTime.now(),
    val modifiedDate: LocalDateTime = LocalDateTime.now()
)

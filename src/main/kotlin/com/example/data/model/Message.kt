package com.example.data.model

import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId
import javax.print.attribute.standard.JobOriginatingUserName

@Serializable
data class Message(

    @BsonId
    val id: String = ObjectId().toString(),

    val text: String,
    val username: String,
    val timestamp: Long

)

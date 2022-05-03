package com.example.plugins

import com.example.data.routes.chatSocket
import com.example.data.routes.getAllMessage
import com.example.room.RoomController
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()

   install(Routing){
       chatSocket(roomController =roomController )
       getAllMessage(roomController =roomController )
   }
}

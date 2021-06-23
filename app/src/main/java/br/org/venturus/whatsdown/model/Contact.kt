package br.org.venturus.whatsdown.model

import java.util.*

class Contact(
    val name: String,
    val picture: String,
    val lastMessage: String = "-",
    val lastView: Date
) {

    fun lastViewToString(): String {
        return "${lastView.hours} : ${lastView.minutes}"
    }
}
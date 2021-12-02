package br.com.ewapps.gmailclone.model

import javax.security.auth.Subject

//Modelo de dados que cada email contém
class MailData (
    val mailId: Int,
    val userName: String,
    val subject: String,
    val body: String,
    val timeStamp: String = ""
        ) {

}
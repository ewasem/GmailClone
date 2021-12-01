package br.com.ewapps.gmailclone.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.MeetingRoom
import androidx.compose.material.icons.outlined.NoMeetingRoom
import androidx.compose.material.icons.outlined.VideoCall
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomMenuData(
    val icon: ImageVector,
    val title: String
) {
    object Mail: BottomMenuData(icon = Icons.Outlined.Mail, title = "E-mail")
    object Meet: BottomMenuData(icon = Icons.Outlined.VideoCall, title = "Reunião")
}
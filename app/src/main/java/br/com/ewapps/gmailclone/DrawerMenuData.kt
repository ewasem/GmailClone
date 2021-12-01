package br.com.ewapps.gmailclone

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

//
sealed class DrawerMenuData(
    val icon: ImageVector? = null,
    val title: String? = null,
    val isDivider: Boolean = false,
    val isHearder: Boolean = false
) {
    object AllInBoxes: DrawerMenuData(
        icon = Icons.Outlined.AllInbox,
        title = "Todas as mensagens"
    )
    object Primary: DrawerMenuData(
        icon = Icons.Outlined.Inbox,
        title = "Principal"
    )
    object  Social: DrawerMenuData(
        icon = Icons.Outlined.Person,
        title = "Social"
    )
    object Promotions: DrawerMenuData(
        icon = Icons.Outlined.PriceChange,
        title = "Promoções"
    )
    object Starred: DrawerMenuData(
        icon = Icons.Outlined.StarOutline,
        title = "Com estrela"
    )
    object Snoozed: DrawerMenuData(
        icon = Icons.Outlined.Snooze,
        title = "Adiados"
    )
    object Important: DrawerMenuData(
        icon = Icons.Outlined.Label,
        title = "Importante"
    )
    object Sent: DrawerMenuData(
        icon = Icons.Outlined.Send,
        title = "Enviado"
    )
    object Scheduled: DrawerMenuData(
        icon = Icons.Outlined.Schedule,
        title = "Agendado"
    )
    object Outbox: DrawerMenuData(
        icon = Icons.Outlined.Outbox,
        title = "Caixa de saída"
    )
    object Draft: DrawerMenuData(
        icon = Icons.Outlined.Drafts,
        title = "Rascunhos"
    )
    object AllMaill: DrawerMenuData(
        icon = Icons.Outlined.Mail,
        title = "Caixa de entrada"
    )
    object Calendar: DrawerMenuData(
        icon = Icons.Outlined.CalendarToday,
        title = "Agenda"
    )
    object Contacts: DrawerMenuData(
        icon = Icons.Outlined.Contacts,
        title = "Contatos"
    )
    object Setting: DrawerMenuData(
        icon = Icons.Outlined.Settings,
        title = "Configurações"
    )
    object Help: DrawerMenuData(
        icon = Icons.Outlined.Help,
        title = "Ajuda e feedback"
    )
    object Divider: DrawerMenuData(
        isDivider = true
    )
    object HeaderOne: DrawerMenuData(
        isHearder = true,
        title = "Todos os marcadores"
    )
    object HeaderTwo: DrawerMenuData(
        isHearder = true,
        title = "GOOGLE APPS"
    )
}
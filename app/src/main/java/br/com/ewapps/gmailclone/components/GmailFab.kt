package br.com.ewapps.gmailclone.components

import androidx.compose.foundation.ScrollState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
//Cria o Floating Button
fun GmailFab(scrollState: ScrollState) {

    //Extende o Floating Button dependendo se a pessoa desliza para ver mais emails
    if(scrollState.value < 100){
        ExtendedFloatingActionButton(text = {
            Text(text = "Compose", fontSize = 16.sp)
        }, onClick = { /*TODO*/ },
        icon = { Icon(imageVector = Icons.Default.Edit, contentDescription = "")},
        backgroundColor = MaterialTheme.colors.surface)
    } else {
        FloatingActionButton(onClick = { /*TODO*/ },
            backgroundColor = MaterialTheme.colors.surface) {
            Icon(imageVector = Icons.Default.Edit, contentDescription = "")
        }
    }

}
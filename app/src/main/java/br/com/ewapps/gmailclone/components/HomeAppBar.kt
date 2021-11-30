package br.com.ewapps.gmailclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.ewapps.gmailclone.GmailApp
import br.com.ewapps.gmailclone.ui.theme.GmailCloneTheme
import br.com.ewapps.gmailclone.R

//Cria o layout da barra superior do gmail
@Composable
fun HomeAppBar(){
    Box(modifier = Modifier.padding(10.dp)) {
        Card(
            modifier = Modifier.requiredHeight(50.dp),
            shape = RoundedCornerShape(10.dp), elevation = 6.dp) {
            Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)) {
                Icon(Icons.Default.Menu, "Menu")
                Text(text = "Procurar e-mail", modifier = Modifier.weight(2.0f))
                Image(painter = painterResource(id = R.drawable.img), contentDescription = "Perfil",
                modifier = Modifier.size(30.dp).clip(CircleShape))
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    GmailCloneTheme {
        GmailApp()
    }
}
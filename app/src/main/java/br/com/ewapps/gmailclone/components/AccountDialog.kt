package br.com.ewapps.gmailclone.components

import android.accounts.Account
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import br.com.ewapps.gmailclone.R

@Composable
//Cria a tela de informação da conta ao clicar na imagem do usuário.
fun AccountDialog(openDialog: MutableState<Boolean>) {
    Dialog(onDismissRequest = { openDialog.value = false}) {
        AccountDiologUI(openDialog = openDialog)
    }
}

//Layout do Dialog
@Composable
fun AccountDiologUI(modifier: Modifier = Modifier, openDialog: MutableState<Boolean>){
    Card() {
        Column(
            modifier
                .background(Color.White)
                .padding(bottom = 16.dp)) {
            Row(modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = { openDialog.value = false }) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "Fechar")}
                    Image(painterResource(id = R.drawable.google), contentDescription = "Google",
                        modifier
                            .size(45.dp)
                            .weight(2.0f)
                        )
                }
            Row(
                modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 16.dp), verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(id = R.drawable.img), contentDescription = "Perfil",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                )
                Column(
                    modifier
                        .weight(2.0f)
                        .padding(start = 16.dp)) {
                    Text(text = "Chewbacca", fontWeight = FontWeight.SemiBold)
                    Text(text = "chewi@gmail.com")
                }
                Text(text = "99+", modifier.padding(end = 16.dp))
            }
            Row(
                modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly) {
                Card(modifier.requiredWidth(150.dp),
                shape = RoundedCornerShape(50.dp),
                border = BorderStroke(1.dp, color = Color.Gray)
                ) {
                    Text(text = "Conta do Google",
                    modifier.padding(8.dp),
                    textAlign = TextAlign.Center)

                }
                Spacer(modifier = modifier.width(10.dp))
            }
            Divider(modifier.padding(top = 16.dp))
            }

        }
    }


@Preview
@Composable
fun AccountDialogUIPreview(){
    AccountDiologUI(openDialog = mutableStateOf(false))
}
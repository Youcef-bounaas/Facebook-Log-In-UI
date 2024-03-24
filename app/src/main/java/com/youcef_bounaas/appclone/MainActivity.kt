package com.youcef_bounaas.appclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.youcef_bounaas.appclone.ui.theme.AppCloneTheme
import com.youcef_bounaas.appclone.ui.theme.BlueFB
import com.youcef_bounaas.appclone.ui.theme.GrayFB
import com.youcef_bounaas.appclone.ui.theme.GreenFB
import com.youcef_bounaas.appclone.ui.theme.blue2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            AppCloneTheme {

                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){

                  Face()

                }
            }
        }
    }
}











@Composable
fun Face() {
    var value by remember {
        mutableStateOf("")
    }
    var value1 by remember {
        mutableStateOf("")
    }



    Column (
        modifier = Modifier
            .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Image(modifier = Modifier.fillMaxWidth()
            .padding(bottom = 5.dp),
            painter = painterResource(R.drawable.facebookandroid),
            contentDescription = null,
        )
        Row (modifier = Modifier
            .padding(bottom = 100.dp)) {


            Text(modifier = Modifier
                .clickable {  },
                text = "Afrikaans",
                color = GrayFB,
            )
            Text(
                text = " • ",
                color = GrayFB,
            )
            Text(modifier = Modifier
                .clickable {  },
                text = "العربية",
                color = GrayFB,
            )
            Text(
                text = " • ",
                color = GrayFB,
            )
            Text(modifier = Modifier
                .clickable {  },
                text = "More...",
                color = blue2,
            )


        }
        TextField(
            value = value ,
            onValueChange =  { value = it  } ,
            placeholder = { Text("Phone or email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        Spacer(Modifier.height(8.dp))

        TextField(
            value = value1 ,
            onValueChange =  { value1 = it  } ,
            placeholder = { Text("Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        Spacer(Modifier.height(8.dp))
        
        ElevatedButton(onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp, start = 16.dp, end = 16.dp),

            shape = RoundedCornerShape(2.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = BlueFB,
                contentColor = Color.White
            ),

        ) { 
            Text(text = "Log In",
                fontWeight = FontWeight.Bold,
                fontSize = 17.sp,

                )
        }

        

            Text (text = "Forgot Password ?",
                Modifier.clickable { }.align(Alignment.CenterHorizontally),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = blue2
                )

        Spacer(modifier = Modifier.height(25.dp))
        
        
        Row (modifier = Modifier.fillMaxWidth()){
            Divider( modifier = Modifier
                .width(180.dp)
                .padding(start = 16.dp)
            )

            Text(modifier = Modifier,
                text = "OR",
                color = GrayFB
            )

            Divider(
                modifier = Modifier
                    .padding(end = 16.dp)
            )



        }
        Spacer(modifier = Modifier.height(25.dp))

        ElevatedButton(
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = GreenFB,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(2.dp)




        ) {
            Text(
                text = "Create new Facebook Account",
                fontWeight = FontWeight.Bold,
                fontSize = 17.sp
            )
        }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppCloneTheme {
        Face()
    }
}



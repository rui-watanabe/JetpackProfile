package com.example.jetprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetprofile.components.ColumnLabel
import com.example.jetprofile.components.CompanySection
import com.example.jetprofile.components.DetailSection
import com.example.jetprofile.ui.theme.JetProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetProfileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainContent()
                }
            }
        }
    }
}

@Composable
fun MainContent() {
    // 縦並びでVStackと同様
    // Alighmentで中央寄せ
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(10.dp)
                // rememberScrollStateはScroll時のScrollの状態を持っている、よしなにやってくれる
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(id = R.drawable.image_profile),
            contentDescription = "Profile",
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(10.dp))
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "田中 太郎",
            color = Color.Gray,
            fontSize = 16.sp,
            fontWeight = FontWeight.ExtraBold,
        )
        // 間の感覚をSpacerで開ける
        // Modiferは、Comoseを拡張する機能である
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "職業: iOSエンジニア",
            color = Color.Gray,
            fontSize = 16.sp,
        )
        Spacer(modifier = Modifier.height(20.dp))
        CompanySection()
        Spacer(modifier = Modifier.height(20.dp))

        // isShowDetailの値が変わったらこの値が持っているComposableを再描画する
        // @StateObject的な役割
        // rememberはメモリー内に値を保持する weak self的な
        var isShowDetail by remember {
            mutableStateOf(false)
        }
        Button(
            onClick = { isShowDetail = !isShowDetail },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF85F6A)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "詳細を表示",
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        if(isShowDetail){
            DetailSection()
        }
    }
}


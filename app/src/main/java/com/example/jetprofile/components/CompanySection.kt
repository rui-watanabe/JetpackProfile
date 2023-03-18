package com.example.jetprofile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CompanySection() {
    // 左寄せの縦並び、横幅いっぱいにカラムを広げる
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "会社名",
            fontWeight = FontWeight.Bold,
            fontSize = 26.sp,
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "部署 グループ名",
            color = Color.Gray,
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
        //　横並びで上下中央寄せにする
        ColumnLabel(icon = Icons.Default.Email, text = "Email")
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "test@gmail.com",
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(5.dp))
        Divider(
            thickness = 2.dp,
            modifier = Modifier.clip(RoundedCornerShape(1000.dp))
        )
    }
}
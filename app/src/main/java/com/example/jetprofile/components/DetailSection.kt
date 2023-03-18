package com.example.jetprofile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DetailSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(Color.LightGray.copy(alpha = 0.3f))
            .padding(vertical = 20.dp, horizontal = 10.dp)
    ) {
        ColumnLabel(
            icon = Icons.Default.Favorite,
            text = "趣味",
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(10.dp))
        ColumnLabel(
            icon = Icons.Default.LocationOn,
            text = "住所",
            color = Color.Gray
        )

    }
}
package com.android.image_lib

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BoxImage(modifier: Modifier){
    Box(modifier = modifier, contentAlignment = Alignment.Center){
        Image(painter = painterResource(androidx.core.R.drawable.ic_call_answer), contentDescription = "",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.size(50.dp))
    }
}
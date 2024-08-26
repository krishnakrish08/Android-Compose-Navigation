package com.example.viriksha.ui.presentations.news

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.viriksha.R

@Composable
fun NewsScreen() {
    Column(modifier = Modifier.padding(8.dp, 0.dp)) {
        Text(
            text = "Headlines",
            fontSize = 20.sp,
            fontWeight = FontWeight.Light,
        )
        Spacer(modifier = Modifier.height(8.dp))
    }
    LazyRow(
        contentPadding = PaddingValues(start = 8.dp, end = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_news),
                    contentDescription = "News",
                    modifier = Modifier
                        .size(80.dp)
                        .shadow(elevation = 0.dp, shape = CircleShape, clip = true),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "HeadLine1" + ""
                )
            }
        }
    }
}


//@Composable
//fun RecommendedSection(list: List<FoodItem>) {
//    Column(modifier = Modifier.padding(8.dp, 0.dp))
//    {
//        Text(
//            text = stringResource(R.string.recommended_for_you),
//            fontSize = 20.sp,
//            fontWeight = FontWeight.Light
//        )
//        Spacer(modifier = Modifier.height(8.dp))
//    }
//    LazyRow(
//        contentPadding = PaddingValues(
//            start = 8.dp,
//            end = 8.dp
//        ),
//        horizontalArrangement = Arrangement.spacedBy(16.dp)
//    ) {
//        items(list.size) {
//            RecommendedCard(foodItem = list[it])
//        }
//    }
//}
package putriiiiiuta.androidlima.challengechapterdepalaaan

import android.graphics.drawable.Icon
import androidx.compose.foundation.R
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text

@Composable
fun HomeScreen() {
    Box(modifier = Modifier
        .background(DeepBlue)
        .filmMaxSize()
    ){
        Column {
            GreetingSection()
            ChipSection(chips = listOf("Sweet sleep", "Insomnia", "Depretion"))
        }

    }

}

@Composable
fun GreetingSection(
    name: String = "Putri"

) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)

    ){
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Good morning, $name",
                style = MaterialTheme,typography.h2
            )
            Text(
                text = "We wish you have a good day",
                style = MaterialTheme,typography.body1
            )


        }
        Icon(
            painterResource(id = R.drawable.ic_serch),
            contentDescription = "Search",
            tint = Color.White,
            modifier = Modifier.size(24.dp)
            )
    }

}

@Composable
fun ChipSection(
    chips: List<String>
) {
    var  selectedChipIndex by remember {
        mutableStateOf(0)
    }
    LazyRow {
        items(chips.size) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
                    .clickable {
                        selectedChipIndex = it
                    }
                    .clip(RoundedCornerShape(10.dp))
                    .background(
                        if (selectedChipIndex == it) ButtonBlue
                        else DarkerButtonBlue
                    )
                    .padding(15.dp)
            ) {
                Text(text = chips[it], color = Textwhite)
            }
        }
    }
}

@Composable
fun CurrentMeditation(
    color: Color= Color.LightGray
) {


}
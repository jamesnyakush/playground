package com.jamesnyakush.playground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jamesnyakush.playground.data.Car

var cars = Car(
    "Atenza",
    "Mid Size Sedan",
    "Mazda",
    "2018"
)

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // MyCars(car = cars)
            MyCarCard(car = cars)
        }
    }
}

@Composable
fun MyCarCard(car: Car) {
    Card(modifier = Modifier.padding(16.dp).fillMaxWidth()) {
        Column {

            Text(style = TextStyle(fontSize = 18.sp), text = "My car is called ${car.carName}")
            Text(text = "My car type is  ${car.carType}")
            Text(text = "My car Brand is  ${car.carBrand}")
            Text(text = "My car was manufactured in   ${car.yearOfManufacture}")
        }
    }
}

@Preview
@Composable
fun MyCarCardPreview() {
    MyCarCard(car = cars)
}

@Composable
fun MyCars(car: Car) {
    Column {
        Text(style = TextStyle(fontSize = 18.sp), text = "My car is called ${car.carName}")
        Text(text = "My car type is  ${car.carType}")
        Text(text = "My car Brand is  ${car.carBrand}")
        Text(text = "My car was manufactured in   ${car.yearOfManufacture}")
    }
}

/*
@Preview
@Composable
fun MyCarsPreview() {
    MyCars(car = cars)
}*/

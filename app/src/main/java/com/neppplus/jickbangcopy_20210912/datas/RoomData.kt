package com.neppplus.jickbangcopy_20210912.datas

import android.R
import java.io.Serializable
import java.text.NumberFormat
import java.util.*

class RoomData(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String) : Serializable {

    fun getFormattedFloor() : String {

//        양수 / 0층 / -층 에 따라 다른 층수로 가공.

        if (this.floor > 0) {

            return "${this.floor}층"

        }else if (this.floor == 0){

            return "반지하"

        }else{
            return  "지하 ${-this.floor}층"
        }

    }


    fun getFormattedPrice() : String {

        if (this.price < 10000){


            val formattedStr = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)

            return formattedStr

        }else {

            val uk = this.price / 10000


            val rest = this.price % 10000


            val restCommaStr = NumberFormat.getNumberInstance(Locale.KOREA).format(rest)

            val finalStr = "${uk}억 ${restCommaStr}"

            return finalStr
        }

    }

}
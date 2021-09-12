package com.neppplus.jickbangcopy_20210912.datas

import android.R
import java.text.NumberFormat
import java.util.*

class RoomData(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String) {

    fun getFormattedFloor() : String {

//       1. 양수인 경우 (1, 3, 5..) => "floor층"
//       2. 0인 경우 => "반지하"
//       3. 음수인 경우 (-1, -2...) => "지하 ?층"

        if (this.floor > 0) {
//            1번 case

            return "${this.floor}층"

        }else if (this.floor == 0){
//            2번 case

            return "반지하"

        }else{
            return  "지하 ${-this.floor}층"
        }

    }


    fun getFormattedPrice() : String {

//        1. 1억이 안넘는 경우 ( 가격 < 10000 )
//        2. 그 외 : 1억 이상 => ?억 ???

        if (this.price < 10000){

//          1번 case
//          8000 => "8,000"

            val formattedStr = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)

            return formattedStr

        }else {

//          2번 case
//          75000 => "7억 5,000"

//          억단위? 75000 -> 7, 165000 -> 16  => 가격 / 10000 했을때, 몫?
//          정수 / 정수 => 결과도 무조건 정수. (소수점 버림) 168 / 10 => 16

            val uk = this.price / 10000

//          천만원까지? 75000 => 5000,  168300 => 8300  => 가격 % 10000 했을때, 나머지?

            val rest = this.price % 10000

//          천만원단위 -> 컴마 찍기.

            val restCommaStr = NumberFormat.getNumberInstance(Locale.KOREA).format(rest)

            val finalStr = "${uk}억 ${restCommaStr}"

            return finalStr
        }

    }

}
package com.neppplus.jickbangcopy_20210912

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20210912.datas.RoomData

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(  RoomData(8000, "서울시 동대문구", 5,"1번째 방입니다.")  )
        mRoomList.add(  RoomData(12000, "서울시 서대문구", 8,"2번째 방입니다.")  )
        mRoomList.add(  RoomData(25000, "서울시 구로구", 0,"3번째 방입니다.")  )
        mRoomList.add(  RoomData(9000, "서울시 동작구", -1,"4번째 방입니다.")  )
        mRoomList.add(  RoomData(18000, "서울시 은평구", 7,"5번째 방입니다.")  )
        mRoomList.add(  RoomData(5000, "서울시 중랑구", 2,"6번째 방입니다.")  )
        mRoomList.add(  RoomData(7000, "서울시 성북구", -2,"7번째 방입니다.")  )
        mRoomList.add(  RoomData(16000, "서울시 강서구", 0,"8번째 방입니다.")  )
        mRoomList.add(  RoomData(99000, "서울시 서초구", 6,"9번째 방입니다.")  )
        mRoomList.add(  RoomData(28000, "서울시 송파", 1,"10번째 방입니다.")  )

    }
}
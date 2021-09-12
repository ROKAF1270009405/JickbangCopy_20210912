package com.neppplus.jickbangcopy_20210912

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        3초 뒤에 -> 화면 전환 코드 실행 시키고싶다.
//        코드 실행을 3초 지연 시키는 방법?

        val myIntent = Intent(this, MainActivity::class.java)
        startActivity(myIntent)

    }
}
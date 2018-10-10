package br.com.wellingtoncosta.bookhub.ui

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.wellingtoncosta.bookhub.R
import br.com.wellingtoncosta.bookhub.databinding.ActivitySplashBinding

/**
 * @author Wellington Costa on 10/10/18.
 */
class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
    }

}

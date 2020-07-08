package com.example.kotlinmvvm.activities

import android.app.Fragment
import com.example.kotlinmvvm.BuildConfig
import com.example.kotlinmvvm.fragments.DataFragment
import junit.framework.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.util.FragmentTestUtil.startFragment


@RunWith(RobolectricTestRunner::class)
    //@Config(constants = BuildConfig::class)

class FragmentTest {

    @Test
    fun testFragment() {
//        val activity = Robolectric.buildActivity(MainActivity::class.java).create()
//            .start()
//            .resume()
//            .get()
//
//        val fragmentManager = activity.getSupportFragmentManager()
//        val fragmentTransaction =
//            fragmentManager.beginTransaction().add(DataFragment(), null).commit()
        val yourFragment = Fragment()
        startFragment(yourFragment)
        assertNotNull(yourFragment)
    }
}
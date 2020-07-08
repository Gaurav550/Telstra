package com.example.kotlinassignment.activities

import android.os.Build
import android.view.View
import com.example.kotlinmvvm.BuildConfig
import com.example.kotlinmvvm.R
import com.example.kotlinmvvm.activities.MainActivity
import kotlinx.android.synthetic.main.activity_main.view.*
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.Robolectric
import android.widget.TextView

//@Config(val constants = BuildConfig::class, sdk = [Build.VERSION_CODES.LOLLIPOP])
@RunWith(RobolectricTestRunner::class)
class MainActivityTest1 {
//    @get:Rule
//    val activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)
 //   private var mActivity: MainActivity? = null;
private var activity: MainActivity? = null
    @Before
    fun setUp() {
        activity = Robolectric.setupActivity(MainActivity::class.java)
    }

    @Test
    fun testLaunchActiviy() {
        val tvHelloWorld = activity?.findViewById(com.example.kotlinmvvm.R.id.toolbar) as TextView
        assertNotNull("TextView could not be found", tvHelloWorld)
        assertTrue(
            "TextView contains incorrect text",
            "Hello world!" == tvHelloWorld.text.toString()
        )
    }

   /* @After
    fun tearDown() {
        mActivity = null;
    }*/
}
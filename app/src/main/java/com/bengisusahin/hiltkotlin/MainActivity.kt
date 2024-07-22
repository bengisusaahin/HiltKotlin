package com.bengisusahin.hiltkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    //Field injection
    @Inject
    lateinit var lars : Musician

    @Inject
    lateinit var myClass : ClassExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        /* val instrument = Instrument()
        val band = Band()
        var james = Musician(instrument, band)
        james.sing()

         */

        lars.sing()

        myClass.myFunction()
    }
}

@AndroidEntryPoint
class FragmentExample() : Fragment() {
    @Inject
    lateinit var kirk : Musician
}
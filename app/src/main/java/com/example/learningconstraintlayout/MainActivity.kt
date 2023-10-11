package com.example.learningconstraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // can set default margins for objects placed with
        // the |--| 0dp button above the layout

        // can auto-constrain some objects placed with the
        // magnet button

        // can put constraints on what you visually see on
        // the layout with the magic wand button

        // text in one object will align with the base of
        // the text in another object by using the show
        // baseline option found by right-clicking an
        // object then dragging the line to the other object

        // chains can be attached to the same objects

        // add guidelines that can be aligned to by
        // right-clicking the layout --> add helpers -->
        // vertical guideline/horizontal guideline

        // click the circle with an arrow inside ("play
        // button") to change the guideline between left,
        // right, and percentage of screen

        // in the same section as guidelines, you can add
        // barriers which make a guideline based on the
        // object furthest to its specified side. to
        // do this, drag the objects you want into the
        // barrier object at the bottom left of the layout

        // to align objects with the barrier, select the
        // object and the barrier then right-click and use
        // the constrain option to constrain the object to
        // the specific part of the barrier you want
    }
}
package com.widget.drawabletextview

import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.setPadding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mDrawableTextView = DrawableTextView(this)
        mDrawableTextView.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        mDrawableTextView.setBackgroundResource(R.color.colorPrimary)
        mDrawableTextView.gravity = Gravity.CENTER_HORIZONTAL
        mDrawableTextView.setDrawable(
            DrawableTextView.RIGHT,
            ContextCompat.getDrawable(this, R.mipmap.ic_launcher),
            50,
            50
        )
        mDrawableTextView.text = "帖子"

        activity_main.addView(mDrawableTextView)
    }
}

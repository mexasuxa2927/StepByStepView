package com.example.stepbystep

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

@SuppressLint("CustomViewStyleable", "Recycle")
class StepByStepView(context: Context, attrs: AttributeSet?) : ConstraintLayout(context, attrs) {

    private lateinit var textview1:TextView
    private lateinit var textview2:TextView
    private lateinit var textview3:TextView
    private lateinit var textview4:TextView
    private lateinit var imageSelect1:ImageView
    private lateinit var imageSelect2:ImageView
    private lateinit var imageSelect3:ImageView
    private  lateinit var imageSelect4:ImageView
    private lateinit var imageDone1:ImageView
    private lateinit var imageDone2:ImageView
    private lateinit var imageDone3:ImageView
    private lateinit var imageDone4:ImageView



    init {
        val inflater  =  inflate(context,R.layout.stepbystem_layout,this)
        val attributs:TypedArray   =  context.obtainStyledAttributes(attrs,R.styleable.CustonStepByStep)



        val string1:String  = attributs.getString(R.styleable.CustonStepByStep_step1text)?:""
        val string2:String  = attributs.getString(R.styleable.CustonStepByStep_step2text)?:""
        val string3:String  = attributs.getString(R.styleable.CustonStepByStep_step3text)?:""
        val string4:String  = attributs.getString(R.styleable.CustonStepByStep_step4text)?:""

        val stepView1  = attributs.getInt(R.styleable.CustonStepByStep_step1,0)
        val stepView2  = attributs.getInt(R.styleable.CustonStepByStep_step2,0)
        val stepView3  = attributs.getInt(R.styleable.CustonStepByStep_step3,0)
        val stepView4  = attributs.getInt(R.styleable.CustonStepByStep_step4,0)

        textview1 = inflater.findViewById(R.id.step1Text)
        textview2 = inflater.findViewById(R.id.step2Text)
        textview3 = inflater.findViewById(R.id.step3Text)
        textview4 = inflater.findViewById(R.id.step4Text)


        imageSelect1  = inflater.findViewById(R.id.imageSelect1)
        imageSelect2  = inflater.findViewById(R.id.imageSelect2)
        imageSelect3  = inflater.findViewById(R.id.imageSelect3)
        imageSelect4  = inflater.findViewById(R.id.imageSelect4)


        imageDone1  = inflater.findViewById(R.id.imageDone1)
        imageDone2  = inflater.findViewById(R.id.imageDone2)
        imageDone3  = inflater.findViewById(R.id.imageDone3)
        imageDone4  = inflater.findViewById(R.id.imageDone4)

        setStepText1(string1)
        setStepText2(string2)
        setStepText3(string3)
        setStepText4(string4)

        setStepViewIcon1(stepView1)
        setStepViewIcon2(stepView2)
        setStepViewIcon3(stepView3)
        setStepViewIcon4(stepView4)



    }

    fun setStepViewIcon1(stepView1: Int) {
        when(stepView1){
            0->{imageSelect1.visibility = View.GONE
                imageDone1.visibility=View.GONE
            }
            1->{
                imageDone1.visibility  =View.GONE
                imageSelect1.visibility = View.VISIBLE
                textview1.setTextColor(Color.BLACK)
            }
            2->{
                imageDone1.visibility = View.VISIBLE
                textview1.setTextColor(Color.BLACK)
            }
            else->{imageSelect1.visibility = View.GONE
                imageDone1.visibility=View.GONE
            }
        }
    }
    fun setStepViewIcon2(stepView2: Int) {
        when(stepView2){
            0->{imageSelect2.visibility = View.GONE
                imageDone2.visibility=View.GONE
            }
            1->{
                imageDone2.visibility  =View.GONE
                imageSelect2.visibility = View.VISIBLE
                textview2.setTextColor(Color.BLACK)
            }
            2->{
                imageDone2.visibility = View.VISIBLE
                textview2.setTextColor(Color.BLACK)
            }
            else->{imageSelect2.visibility = View.GONE
                imageDone2.visibility=View.GONE
            }
        }
    }
    fun setStepViewIcon3(stepView3: Int) {
        when(stepView3){
            0->{imageSelect3.visibility = View.GONE
                imageDone3.visibility=View.GONE
            }
            1->{
                imageDone3.visibility  =View.GONE
                imageSelect3.visibility = View.VISIBLE
                textview3.setTextColor(Color.BLACK)
            }
            2->{
                imageDone3.visibility = View.VISIBLE
                textview3.setTextColor(Color.BLACK)
            }
            else->{imageSelect3.visibility = View.GONE
                imageDone3.visibility=View.GONE
            }
        }
    }
    fun setStepViewIcon4(stepView4: Int) {
        when(stepView4){
            0->{imageSelect4.visibility = View.GONE
                imageDone4.visibility=View.GONE
            }
            1->{
                imageDone4.visibility  =View.GONE
                imageSelect4.visibility = View.VISIBLE
                textview4.setTextColor(Color.BLACK)

            }
            2->{
                imageDone4.visibility = View.VISIBLE
                textview4.setTextColor(Color.BLACK)
            }
            else->{imageSelect4.visibility = View.GONE
                imageDone4.visibility=View.GONE
            }
        }
    }

    fun setStepText1(string: String){textview1.text  = string}
    fun setStepText2(string: String){textview2.text = string}
    fun setStepText3(string: String){textview3.text  = string}
    fun setStepText4(string: String){textview4.text  = string}










}
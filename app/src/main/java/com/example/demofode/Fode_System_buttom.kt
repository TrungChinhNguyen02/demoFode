package com.example.demofode

import android.content.Context
import android.util.AttributeSet
import android.widget.EditText
import com.google.android.material.button.MaterialButton
import com.google.android.material.datepicker.MaterialTextInputPicker
import com.google.android.material.textview.MaterialTextView

open class Fode_System_buttom  @JvmOverloads constructor(context: Context,
                                                         attr: AttributeSet? = null,
                                                         defStyle: Int = R.attr.fode_ButtonStyle):
    MaterialButton(context, attr, defStyle) {
}
open class fode_Button1 @JvmOverloads constructor(context: Context,
                                                  attr: AttributeSet? = null,
                                                  defStyle: Int = R.attr.fode_TextField):
    MaterialButton(context, attr, defStyle) {
}

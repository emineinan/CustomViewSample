package com.example.customviewsample.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import com.example.customviewsample.databinding.MobilerdevCardBinding
import com.google.android.material.card.MaterialCardView

class MobilerdevCard @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : MaterialCardView(context, attrs) {

    private val binding = MobilerdevCardBinding.inflate(LayoutInflater.from(context), this, true)

    fun initCardView(mobilerdevCardModel: MobilerdevCardModel) = with(binding) {
        imageViewIcon.setImageResource(mobilerdevCardModel.image)
        textViewTitle.setText(mobilerdevCardModel.title)
        textViewDescription.setText(mobilerdevCardModel.description)
    }
}

data class MobilerdevCardModel(
    var image: Int,
    var title: Int,
    var description: Int
)

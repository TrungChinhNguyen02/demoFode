package com.example.demofode.Model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class paymentModel : ViewModel() {
    var quantityModel = MutableLiveData<Int>()
    var sizeModel = MutableLiveData<Int>()
    var priceModel = MutableLiveData<Double>()
    var totalModel = MutableLiveData<Double>()
//    val priceSizeDish = MutableLiveData<Int>()
//
        fun updataTotal(newTotalValue: Double){
        totalModel.value = newTotalValue
//        calculatePrice()
    }
    fun updataPrice(newPriceModel : Double){
        priceModel.value = newPriceModel
    }
    private fun calculatePrice(){
        var qualityTotal = quantityModel.value
        var priceTotal = priceModel.value
        var total = qualityTotal!! * priceTotal!!
        totalModel.value = total
    }
}

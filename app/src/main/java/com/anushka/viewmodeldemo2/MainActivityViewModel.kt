package com.anushka.viewmodeldemo2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int) : ViewModel() {
    val inputText = MutableLiveData<String>("")
    private var total = MutableLiveData<Int>()
    val totalData: LiveData<Int>
        get() = total

    init {
        total.value = startingTotal
    }

    fun setTotal() {
//        total.value = (total.value)?.plus(input)
        total.value = (total.value)?.plus(inputText.value?.toInt() ?: 2)
    }
}

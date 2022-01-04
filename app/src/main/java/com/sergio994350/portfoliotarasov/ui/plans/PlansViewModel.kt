package com.sergio994350.portfoliotarasov.ui.plans

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlansViewModel : ViewModel() {
    private val textPlans = "Я намерен развивать навыки в Android-разработке,\n" +
            "написании приложений на Kotlin и Java.\n\n" +
            "В 2022 году я очень хотел бы начать работу в одной из \n" +
            "уважаемых IT-компаний, которые мне очень нравятся:\n" +
            "Яндекс, JetBrains, EPAM или другой.\n" +
            "Я четко понимаю свою цель и стремлюсь к ней\n" +
            "изо всех сил.\n"

    private val _text = MutableLiveData<String>().apply {
        value = textPlans
    }
    val text: LiveData<String> = _text
}
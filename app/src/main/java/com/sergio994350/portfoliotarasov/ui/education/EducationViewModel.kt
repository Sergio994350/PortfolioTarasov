package com.sergio994350.portfoliotarasov.ui.education

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EducationViewModel : ViewModel() {
    private val textEducation = "1992 - средняя школа, серебряная медаль\n" +
            "1997 - Московский Государственный Горный Университет, красный диплом\n" +
            "2005 - курсы английского языка (How are you?)\n" +
            "2010 - курсы китайского языка (Ni hao ma?)\n\n" +
            "2021 - Несколько курсов по Java- и Android- разработке (на платформах SkillBox, Udemy), \n" +
            "Android-разработке, по Kotlin, \n\n" +
            "Обучался в Университете ИТМО у Асель Романовой (ИТМО, Jet Brains):\n" +
            "1) Разработка Android-приложений для мобильных устройств\n" +
            "2) Основы программирования на языке Kotlin\n" +
            "3) Разработка современных мобильных приложений на языке Kotlin";

    private val _text = MutableLiveData<String>().apply {
        value = textEducation
    }
    val text: LiveData<String> = _text
}
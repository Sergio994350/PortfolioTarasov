package com.sergio994350.portfoliotarasov.ui.contacts

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContactsViewModel : ViewModel() {
    private val textContacts =
        "Сергей Тарасов\ntarasov-mnm@yandex.ru\n+7(915)198-2794\ntelegram: @sergio994350\ngithub.com/Sergio994350"

    private val _text = MutableLiveData<String>().apply {
        value = textContacts
    }
    val text: LiveData<String> = _text
}
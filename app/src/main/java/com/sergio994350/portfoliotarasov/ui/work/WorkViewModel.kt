package com.sergio994350.portfoliotarasov.ui.work

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WorkViewModel : ViewModel() {
    private val textWork = "Окончив в 1997 году Московский Горный, я обнаружил, что " +
            "всем нужны продажники, а вовсе не горные инженеры.\n" +
            "24 года - с 1997 по 2021 - я занимался продажами различных групп товаров:\n" +
            "- окорочка и напитки в компании \"Союзконтракт\",\n" +
            "- посуду, хозтовары и сковородки в \"Красном Кубе\", \"Кулинаре\",\n" +
            "- мебель и мебельные комплектующие в \"Диванах и Креслах\", \"Много Мебели\", \"Rivalli\", \n" +
            "- сигнализации.\n\n" +
            "в 2020 году я принял решение учиться Java и Android разработке,\n" +
            "окончил несколько курсов, " +
            "продолжаю учиться параллельно с работой (сейчас я продаю мебель).\n" +
            "\n" +
            "Моя цель - работать в одной из IT-компаний,\n" +
            "в области Android- и Java- разработки."

    private val _text = MutableLiveData<String>().apply {
        value = textWork
    }
    val text: LiveData<String> = _text
}
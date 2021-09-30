package com.example.majorproject.models

data class Quiz(
    val id: String = "",
    val title: String = "",
    val questions: MutableMap<String, Question> = mutableMapOf()
)
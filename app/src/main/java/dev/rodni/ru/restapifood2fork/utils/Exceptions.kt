package dev.rodni.ru.restapifood2fork.utils

import java.io.IOException

class NoInternetException(message: String) : IOException(message)

class DateNotFoundException : Exception()

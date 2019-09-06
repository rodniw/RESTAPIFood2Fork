package dev.rodni.ru.domain

//class which will wrapp a result
sealed class ResultWrapper<out E, out V> {

    //success case of a result
    data class Success<out V>(val value: V) : ResultWrapper<Nothing, V>()
    //error case of a result
    data class Error<out E>(val error: E) : ResultWrapper<E, Nothing>()

    //classic companion factory for decision which of wrapper(success/error) will be given
    companion object Factory{
        inline fun <V> build(function: () -> V): ResultWrapper<Exception, V> =
                try {
                    Success(function.invoke())
                } catch (e: java.lang.Exception) {
                    Error(e)
                }
    }
}
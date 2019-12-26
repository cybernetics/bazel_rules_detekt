package io.buildfoundation.bazel.rulesdetekt.wrapper

internal sealed class Result {
    object Success : Result()
    data class Failure(val description: String) : Result()

    val consoleStatusCode = when (this) {
        is Success -> 0
        is Failure -> 1
    }
}
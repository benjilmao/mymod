package com.github.benjilmao.mymod.errors

class CommandError(message: String, cause: Throwable) : Error(message, cause)
package com.coroutines

import kotlinx.coroutines.*

class UserDataManager1 {

    suspend fun getTotalUserCount():Int{
        var count =0
        CoroutineScope(Dispatchers.IO).launch {
            delay(1000)
            count =50
        }
       val deferred= CoroutineScope(Dispatchers.IO).async {
            delay(3000)
           return@async 70
        }

        return count + deferred.await()
    }
}
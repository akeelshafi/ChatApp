package com.akeel.chatapp

data class  SignInResult(
    val data: UserData?,
    val errorMessage:String?

)
data class UserData(
    val userId:String,
    val username:String,
    val ppUrl:String?,
    val email:String?


)
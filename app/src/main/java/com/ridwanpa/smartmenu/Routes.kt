package com.ridwanpa.smartmenu

sealed class Routes (val name:String){
    object OnBoardingScreen:Routes("on_boarding_screen")

    object AuthenticationScreen:Routes("authentication_screen")

    object  EmailVerificationScreen:Routes("email_verification_screen")

    object CreateAccountScreen:Routes("create_account_screen")

    object VerifyCodeScreen:Routes("verify_code_screen")
}
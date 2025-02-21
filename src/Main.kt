//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val isUserLoggedIn = true
    val hasPremiumAccess = false

    // User can access premium content only if logged in AND has premium access
    if (isUserLoggedIn && hasPremiumAccess) {
        println("Welcome to Premium Content!")
    } else {
        println("Upgrade to Premium to Access this feature.")
    }

    // User can access free content if logged in OR has a guest account
    val isGuestUser = true
    if (isUserLoggedIn || isGuestUser) {
        println("You can access free content.")
    }

    // Logout scenario using NOT (!)
    if (!isUserLoggedIn) {
        println("Please log in first.")
    }



}
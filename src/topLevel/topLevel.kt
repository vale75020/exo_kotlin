package topLevel

import commonFunctions.printSomething
import constants.errorException
import constants.errorMessage
import constants.googleToken
import constants.urlClassrooms
import java.lang.NullPointerException

/*Creer une fonction "top-level" permettant de verifier si une variable de type
* String? est differente de 'null' : si elle est egale a 'null', vous declencherez
* une exception, sinon vous afficherez "This variable is not null !" dans
* la console.
- Creer 2 proprietes "top-level" stockant :
* Le token Google : "ABCDE_IS_MY_TOKEN"
* l'url d'OpenClassrooms : "https://www.openclassrooms.com" */

fun topLevel(word: String?) {
    try {
        if(word != null ){println("$errorMessage")}
        else {throw NullPointerException()}
    } catch (ex: NullPointerException){
        println ("$errorException")
    }

}

fun showTokenAndUrl(){
    printSomething("$googleToken")
    printSomething("$urlClassrooms")
}


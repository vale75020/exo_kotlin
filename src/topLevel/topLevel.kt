package topLevel

import constants.errorMessage

/*Creer une fonction "top-level" permettant de verifier si une variable de type
* String? est differente de 'null' : si elle est egale a 'null', vous declencherez
* une exception, sinon vous afficherez "This variable is not null !" dans
* la console.*/

fun topLevel(word: String?) {
    try {
        if(word !== null ){println("$word")}
    } catch (ex: InterruptedException){
        println("$errorMessage")
    }
}
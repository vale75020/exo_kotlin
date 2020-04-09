package extension

import user.User

/* - Creer une extension, toPlural(), permettant de renvoyer le pluriel d'un mot (String). Vous ne
* gererez PAS les cas speciaux ("al" en "aux" par exemple).
*
* - Afficher le resultat de cette fonction dans la console.*/

fun User.plural(s: String="s") {
    println("${this.name}s" )
}

fun String.addPlural(s: String ="s"){
    println("${this}s")
}
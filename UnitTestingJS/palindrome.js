// Función que recibe un valores de entrada y dica si un numero o cadena de datos es palindromo
function isPalindrome(s) {
    //Se obtiene el largo del dato ingresado
    const count = s.length - 1;

    //Es palíndromo si el largo de la cadena es 2
    if (count < 2) {
        return true;
    }

    //Revisa los caracteres i e count - 1 para ver si son iguales, esto para la mitad de los caracteres del
    // dato ingresado, si en algun caso son diferentes retorna falso
    for (i = 0; i < (count + 1) / 2; ++i) {
        if (s[i] !== s[count - i]) return false;
    }

    //Retorna true ya que se revisó que el numero no fuese palindromo
    return true;
}

//Indica que se puede importar la función con nombre isPalindrome
module.exports = isPalindrome;

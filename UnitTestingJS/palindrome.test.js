//Se importan las funciones que se desean probar
const isPalindrome = require("./palindrome");

/*
Sintaxis: test(descripcion funcion, funcion)
Sintaxis: expect(funcion con valores).toBe(valor de retorno
    esperado)

Este código se encarga de revisar si el dato ingresado
es un número o cadena de caracteres palindromo.

*/
test("it detects palindromes", () => {
    expect(isPalindrome("palindrome")).toBe(false);
    expect(isPalindrome("pop")).toBe(true);
    expect(isPalindrome("1212")).toBe(false);
});

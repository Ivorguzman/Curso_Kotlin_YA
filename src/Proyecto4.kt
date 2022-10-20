/*
Cuando utilizamos la Consola para mostrar información por pantalla utilizamos las funciones print y println. Si
necesitamos entrar datos por teclado podemos utilizar la función readLine.

* */

// Problema 1
//Realizar la carga de dos números enteros por teclado e imprimir su suma y su producto.
fun main(){
    print("Ingrese primer Numero: ")
    val valor1 = readLine() !!.toInt()
    print("Ingrese Segundo Numero: ")
    val valor2= readLine() !!.toInt()

    val suma= valor1 + valor2
    val res_suma: Int = valor1 + valor2
    val res_producto = valor1 * valor2

    println("La suma de $valor1 y $valor2 es $res_suma")
    print("La multiplicación de $valor1 * $valor2 es  $res_producto")
}







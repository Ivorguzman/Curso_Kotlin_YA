/**
Problema 4
Escribir un programa en el cual se ingresen cuatro números enteros, calcular e informar la suma de los dos primeros
y el producto del tercero y el cuarto.
 */

fun main(){
    val num1 :Int
    val num2 :Int
    val num3 :Int
    val num4 :Int

    print("Ingrese Numero :")
    num1= readLine()!!.toInt()

    print("Ingrese Numero :")
    num2= readLine()!!.toInt()

    print("Ingrese Numero :")
    num3= readLine()!!.toInt()

    print("Ingrese Numero :")
    num4= readLine()!!.toInt()

    println("La suma de $num1  +  $num2 es :" + (num1+num2))
    println("La multiplicación de $num3 X $num4 es :" + (num3*num4))




}

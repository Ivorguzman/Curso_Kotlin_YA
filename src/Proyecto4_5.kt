/*
 Problema 5
  Realizar un programa que lea por teclado cuatro valores numéricos enteros e informar su suma y promedio.
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
    println("La suma de $num1 + $num2 + $num3 + $num4 es : " + (num1+num2+num3+num4))
    println("El Promedio de  la suma de $num1 + $num2 + $num3 + $num4 es : " + ((num1+num2+num3+num4)/4))




}

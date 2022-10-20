/**
 *Problema 3
Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente. Mostrar lo
que debe abonar el comprador.
 */

fun main()  {
    print("Ingrese cantidad de productos :" )
    val cantidad : Int = readLine()!!.toInt()
    print("Ingrese precio de los productos :" )
    val precio : Int = readLine()!!.toInt()
    val pago : Int = cantidad * precio
    println("Monta a  cancelar por la compra es : $pago")
}
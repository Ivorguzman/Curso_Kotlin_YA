/**
 *Problema 3
Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente. Mostrar lo
que debe abonar el comprador.
 */

fun main()  {
    print("Ingrese cantidad de productos :" )
    val cantidad : Int = readLine()!!.toInt()
    print("Ingrese precio de los productos :" )
    val precio : Double = readLine()!!.toDouble()
    val pago : Double = cantidad * precio
    println("Monto a  cancelar por la compra es : $pago")
}
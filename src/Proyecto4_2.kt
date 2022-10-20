
/**
Problema 2
Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del mismo (El perímetro de un cuadrado se
calcula multiplicando el valor del lado por cuatro)
 */

fun main(){
    print("Ingrese el valor del lado del cuadrado :")
    val lado_cuadrado: Int = readLine() !!.toInt()
    val perimetro = lado_cuadrado *4
    print("El Perimetro del cuadrado es : $perimetro ")
}
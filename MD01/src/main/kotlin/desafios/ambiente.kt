package desafios

fun main() {

    var n1:Short = 7
    var n2:Int
    n2 = n1.toInt()

    println(n1)
    println(n2)

    val n11:Float = 21.5F
    val n22:Double = n11.toDouble()

    print(n2)

    println(8.toFloat()) //converte int em float
    println(1034)

    var nome:String = "Pablo" //var é uma variavel e pode mudar o valor.
    val idade:Short = 34 //val é constante e não muda o valor.
    var peso:Float = 95.8F
    var numGrande:Long = 5_000_000L

    println("Olá, meu nome é $nome, minha idade é $idade, meu peso é $peso e tenho R$$numGrande no banco.")

    println("Máximo: " + Short.MAX_VALUE)
    println("Mínimo: " + Short.MIN_VALUE)
    println("Tamanho: " + Short.SIZE_BYTES + "bytes")

    println(nome.length)

    var x:Int = 10
    var y = 20

    println(y is Int) //verifica se é int

    var n:Any //recebe qualquer valor
    n = 20
    n = "Estudonauta"
}
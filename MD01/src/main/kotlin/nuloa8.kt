fun main() {
    var nome:String?
    nome = null

    var a:Int?
    var b:Int
    a = null
    b = a?:0 //se a for nulo coloca 0 no lugar

    try {
        b = a!!
    }catch (e: NullPointerException){
        println("Deu problema, mas estou resolvendo...")
        b = 10
    }finally {
        println("A vale: " + a)
        println("B vale: " + b)
    }
}
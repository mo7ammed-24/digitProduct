fun main() {
    println(digitsProduct(12))
}

fun digitsProduct(product: Int): Int {
    var myIntString=mutableListOf<Int>()
    if(product<10 && product>0)
        return product
    for(i in 1..9){
        for(j in 0..9){
            if(i*j==product){
                var firstInt=i.toString()
                var secondInt=j.toString()
                myIntString.add((firstInt+secondInt).toInt())
            }
            for(k in 0..9){
                if(i*j*k==product){
                    var firstInt=i.toString()
                    var secondInt=j.toString()
                    var thirdInt=k.toString()
                    myIntString.add((firstInt+secondInt+thirdInt).toInt())
                }
                for(h in 0..9){
                    if(i*j*k*h==product){
                        var firstInt=i.toString()
                        var secondInt=j.toString()
                        var thirdInt=k.toString()
                        var fourthInt=h.toString()
                        myIntString.add((firstInt+secondInt+thirdInt+fourthInt).toInt())
                    }

                }
            }
        }


    }
    if(myIntString.size==0)
        return -1
    var min:Int=0
    if(myIntString.size>0) {
        min = myIntString[0]

        myIntString.forEach {
            if (it < min)
                min = it

        }
    }

    return min

}


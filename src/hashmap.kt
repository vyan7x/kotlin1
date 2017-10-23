fun main(args: Array<String>) {
    var map=HashMap<Int,String>()
    map.put(1,"Muham")
    map.put(2,"mad")
    map.put(3,"Zilong")
    println(map.get(3))

    map.put(3,"Unisnu Jepara")
    for (k in map.keys){
        println(map.get(k))
    }

}
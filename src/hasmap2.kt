fun main(args: Array<String>) {
    var map=HashMap<String,String>()
    map.put("nama_depan","Muham")
    map.put("nama_tengah","mad")
    map.put("nama_belakang","Zilong")
    println(map.get("nama_depan"))

    map.put("nama_tengan","Unisnu Jepara")
    for (k in map.keys){
        println(k +" "+map.get(k))
    }
}
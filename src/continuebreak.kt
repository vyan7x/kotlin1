fun main(args: Array<String>) {
    for(count in 1..5){
        if(count==4)
            continue
        println("count: $count")
    }

    for(count in 1..5){
        if(count==4)
            break
        println("count: $count")
    }
}
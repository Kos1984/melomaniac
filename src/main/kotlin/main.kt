fun main () {
    val purchaseLastMonth = true
    val amount = 10001
    val discount = 100
    val percentOff = 5
    val percentOff2 = 1
    var totalPrise = amount


    if (amount > 1000 && amount < 10000 ){
        totalPrise = amount - discount
    }else if (amount > 10000){
        totalPrise -= (totalPrise /100) * percentOff
    }
    if (purchaseLastMonth){
        totalPrise -= (totalPrise /100) * percentOff2
    }
    println(totalPrise)
}



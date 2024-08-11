package org.example

class Stock(
    var stockid: Int,
    var productname: String,
    var quantity: Int,    // Corrected spelling from 'quatity' to 'quantity'
    var amount: Double,
    var totalamount: Double
){

    override fun toString(): String {
        return "Stock ID: "+ stockid +"\tName: "+productname+"\tQty : "+quantity+"\tAmount : "+amount+"\tTotal : "+totalamount

    }
}



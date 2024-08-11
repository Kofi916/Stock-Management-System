package org.example

class Stock(
    var stockid: Int,
    var productname: String,
    var quantity: Int,    // Corrected spelling from 'quatity' to 'quantity'
    var amount: Double,
    var totalamount: Double
){
    // Getter and Setter for stockid
    fun retrieveStockId(): Int {
        return stockid
    }

    fun updateStockId(id: Int) {
        stockid = id
    }

    fun retrieveProductName(): String {
        return productname
    }

    fun updateProductName(name: String) {
        productname = name
    }

    fun retrieveQuantity(): Int {
        return quantity
    }

    fun updateQuantity(qty: Int) {
        quantity = qty
    }

    fun retrieveAmount(): Double {
        return amount
    }

    fun updateAmount(amt: Double) {
        amount = amt
    }

    fun retrieveTotalAmount(): Double {
        return totalamount
    }

    fun updateTotalAmount(tmt: Double) {
        totalamount = tmt
    }

    override fun toString(): String {
        return "Stock ID: "+ stockid +"\tName: "+productname+"\tQty : "+quantity+"\tAmount : "+amount+"\tTotal : "+totalamount

    }
}



package org.example

class Stock(
    var stockid: Int,
    var productname: String,
    var quantity: Int,    // Corrected spelling from 'quatity' to 'quantity'
    var amount: Double,
    var totalamount: Double
){
    // Getter and Setter for stockid
    fun getStockId(): Int {
        return stockid
    }

    fun setStockId(id: Int) {
        stockid = id
    }

    // Getter and Setter for productname
    fun getProductName(): String {
        return productname
    }

    fun setProductName(name: String) {
        productname = name
    }

    // Getter and Setter for quantity
    fun getQuantity(): Int {
        return quantity
    }

    fun setQuantity(qty: Int) {
        quantity = qty
    }

    // Getter and Setter for amount
    fun getAmount(): Double {
        return amount
    }

    fun setAmount(amt: Double) {
        amount = amt
    }

    // Getter and Setter for totalamount
    fun getTotalAmount(): Double {
        return totalamount
    }

    fun setTotalAmount(tmt: Double) {
        totalamount = tmt
    }

    override fun toString(): String {
        return "Stock ID: "+ stockid +"\tName: "+productname+"\tQty : "+quantity+"\tAmount : "+amount+"\tTotal : "+totalamount

    }
}



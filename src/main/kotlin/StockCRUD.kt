package org.example

import java.util.*
import kotlin.collections.ArrayList

class StockCRUD {

    var stockList = ArrayList<Stock>()
    var sc = Scanner(System.`in`)
    fun addStock(){

        print("Enter Stock ID : ")
        var sid: Int = sc.nextInt()
        print("Enter Product Name: ")
        var sname: String = sc.next().toString()
        print("Enter Quantity: ")
        var sqty: Int = sc.nextInt()
        print("Enter Amount: ")
        var smt: Double = sc.nextDouble()
        var stotalamt: Double = smt*sqty

        var stockdata = Stock(sid,sname,sqty,smt,stotalamt)

        stockList.add(stockdata)
        println("Stock with ID: "+sid+" is Added Successfully")
    }
    fun deleteStock(){

    }
    fun displayStock(){

    }
    fun updateStock(){

    }


}
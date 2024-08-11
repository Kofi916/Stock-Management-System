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

        print("Enter Stock ID to be deleted")
        var del:Int = sc.nextInt()
        var chk = Stock(0,"d",0,0.0,0.0)

        for(sitem in stockList) {

            chk=sitem
            if(sitem.getStockId() == del){

                stockList.remove(sitem)
                println("Stock ID : "+del+" is removed")
            }

        }
        if(chk.getStockId() != del){
            println("Data be found")
        }
    }
    fun displayStock(){

        for(sitem in stockList){
            println(sitem)
        }
    }
    fun updateStock(){

        print("Enter Stock Id to be Updated: ")
        var sid: Int = sc.nextInt()
        var chk = Stock(0,"d",0,0.0,0.0)

        for(sitem in stockList){
            if(sitem.getStockId() == sid){

                chk = sitem
                stockList.remove(sitem)
                print("Enter Updated Product Name: ")
                var pname: String = sc.next().toString()
                print("Enter Updated Quantity: ")
                var uqty:Int = sc.nextInt()
                print("Enter Updated Amount: ")
                var uamt:Double = sc.nextDouble()

                var utotalamt:Double = uamt*uqty

                var update = Stock(sid,pname,uqty,uamt,utotalamt)

                stockList.add(update)
                println("Stock ID: "+sid+" is successfully Updated")


            }
        }
        if(chk.getStockId() != sid){
            println("Data Not Found")
        }
    }


}
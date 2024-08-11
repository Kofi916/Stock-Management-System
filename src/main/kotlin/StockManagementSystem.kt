package org.example

import java.util.*


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {

    var sc = Scanner(System.`in`)
    var scrud = StockCRUD()

    while(true) {
        println("----------STOCK MANAGEMENT SYSTEM------------")
        println("1. Adding a Stock")
        println("2. Display all Stock")
        println("3. Delete a Stock")
        println("4. Update a Stock")
        println("5. Exit the Application")
        print("Enter Your Choice: ")

        var ch: Int = sc.nextInt();

        when (ch) {
            1 -> scrud.addStock()
            2 -> println("Displaying all Stock")
            3 -> println("Deleting a Stock")
            4 -> println("Updating a Stock")
            5 -> System.exit(1)

            else -> println("Invalid Selection")
        }
    }
}
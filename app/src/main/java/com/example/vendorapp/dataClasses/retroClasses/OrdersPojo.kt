package com.example.vendorapp.dataClasses.retroClasses

data class OrdersPojo(

    var orderId: String,

    var status: String,

    var timestamp: String,

    var otp: String,

    var totalAmount: String,

    var items: Array<ItemPojo>
)
package com.example.demofode.Model

data class ProductResponse(val status : Boolean,
                    val message : String,
                    val data : ProductData)  {
}
data class  ProductData(val products : List<Product> ){}


data class Product(
    val id: Int,
    val name: String,
    val description: String,
    val price: Int,
    val category: String,
    val calories: Int,
    val size: String,
    val image_url: String,
    val created_at : String?,
    val updated_at : String?
)    {
}

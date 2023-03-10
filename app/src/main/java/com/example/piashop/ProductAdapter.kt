package com.example.piashop
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.piashop.ProductAdapter.*
import com.example.piashop.model.Product
import com.squareup.picasso.Picasso


class ProductAdapter(private val products:ArrayList<Product>) :RecyclerView.Adapter<ViewHolder>() {


    override fun onCreateViewHolder(parent:ViewGroup, viewType:Int): ViewHolder {
            val view =LayoutInflater.from(parent.context).inflate(R.layout.product_row,parent,false)
            val holder=ViewHolder(view)
        view.setOnClickListener{
            val intent = Intent(parent.context,ProductDetails::class.java)
            intent.putExtra("title",products[holder.adapterPosition].title)
            intent.putExtra("photo_url",products[holder.adapterPosition].photourl)
            parent.context.startActivity(intent)

        }


        return holder
    }

    override fun getItemCount()=products.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val product =products[position]
        Picasso.get().load(products[position].photourl).into(holder.image)
        holder.title.text =products[position].title
        holder.price.text=products[position].price.toString()

    }
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val image:ImageView =itemView.findViewById(R.id.photo)
        val title:TextView =itemView.findViewById(R.id.title)
        val price:TextView =itemView.findViewById(R.id.price)
    }

}



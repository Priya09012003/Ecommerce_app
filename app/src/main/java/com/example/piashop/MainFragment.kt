package com.example.piashop
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.piashop.model.Product
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*
import java.net.URL


class MainFragment : Fragment() {

 override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstancestate: Bundle?):View? {
     val root = inflater.inflate(R.layout.fragment_main, container, false)

       val products = arrayListOf<Product>()

    //for (i in 0..3) {
       // products.add(
           /* Product(
                "JACKETS #$i",
                "https://plchldr.co/i/350x350?&bg=D3D3D3&fc=000000&text=350X350",
                1.99x
            )
        )
        //  }*/
        products.add(Product("crop tops", "https://media.istockphoto.com/id/656530364/photo/be-a-flamingo-in-a-flock-of-pigeons.jpg?s=612x612&w=0&k=20&c=mfh7GioZdjPJz5X1pWLpAbA0HjDxt0eg0gRcwDasCoo=",0.199))
        products.add(Product("jeans", "https://faydabazzar.in/wp-content/uploads/2022/12/1629277740.WhatsApp_Image_2021-08-11_at_10.02.39_PM.jpg",3.99))
        products.add(Product("kurtis" ,"https://img.faballey.com/images/Product/ITN03622Z/d3.jpg",2.99))
        products.add(Product("saree", "https://assets.ajio.com/medias/sys_master/root/20221216/myNQ/639c8b72f997ddfdbdd952d0/-473Wx593H-465444798-navy-MODEL.jpg",2.99))
        products.add(Product("partywear", "htt-ps://static.wixstatic.com/media/524c26_1083b29a238f44dcacb28c736feb8cdb~mv2.jpeg/v1/fill/w_1079,h_1062,al_c,q_85/524c26_1083b29a238f44dcacb28c736feb8cdb~mv2.jpeg",2.99))
        products.add(Product("shirts 6", "https://th.bing.com/th/id/OIP.vKejUba30UkN3SmHY7pdXAHaKl?pid=ImgDet&rs=1",2.99))
        products.add(Product("shirts 7", "https://th.bing.com/th/id/OIP.vKejUba30UkN3SmHY7pdXAHaKl?pid=ImgDet&rs=1",2.99))
        products.add(Product("shirts 8", "https://th.bing.com/th/id/OIP.vKejUba30UkN3SmHY7pdXAHaKl?pid=ImgDet&rs=1",2.99))
        products.add(Product("shirts 9", "https://th.bing.com/th/id/OIP.vKejUba30UkN3SmHY7pdXAHaKl?pid=ImgDet&rs=1",2.99))
        products.add(Product("shirts 10", "https://th.bing.com/th/id/OIP.vKejUba30UkN3SmHY7pdXAHaKl?pid=ImgDet&rs=1",2.99))



   // }
    root.recycler_view.apply {
        layoutManager = GridLayoutManager(activity,2)
        adapter = ProductAdapter(products)
        root.progressBar.visibility = View.GONE
    }

     val categories = listOf("cropTops","Jeans","PartyWear","Sarees","kurtis","Skirts","Suits","JumpSuits","Dresses")
    root.
    categoryRecyclerview.apply{
         layoutManager = LinearLayoutManager(activity,RecyclerView.HORIZONTAL,false)
         adapter = CategoriesAdapter(categories)
     }

return root
 }
}
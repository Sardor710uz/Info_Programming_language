package uz.programmer710.infoprogramminglanguage.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_1.view.*
import uz.programmer710.infoprogramminglanguage.R
import uz.programmer710.infoprogramminglanguage.models.User
import java.security.AccessControlContext

class MyAdapter(val list: ArrayList<User>, context: Context) : ArrayAdapter<User>(context, R.layout.item_1, list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var itemView:View
        if (convertView == null){
            itemView = LayoutInflater.from(context).inflate(R.layout.item_1, parent, false)
        }else{
            itemView = convertView
        }

        itemView.text_View_Item.text = list[position].name
        itemView.image_View_Item.setImageResource(list[position].image)

        return itemView
    }
}
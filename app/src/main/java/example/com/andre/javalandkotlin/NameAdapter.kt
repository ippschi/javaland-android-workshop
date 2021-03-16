package example.com.andre.javalandkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NameAdapter : RecyclerView.Adapter<NameAdapter.NameViewHolder>() {

    var names: ArrayList<String> = arrayListOf("Andre", "Esel", "Volker", "Torsten", "a", "b", "a", "b", "a", "b", "a", "b", "a", "b", "a", "b", "a", "b")

    fun addName(name: String) {
        names.add(name)
        notifyDataSetChanged()
    }

    class NameViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemTextView = view.findViewById<TextView>(R.id.textViewItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return NameViewHolder(view)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        val name = names[position]
        holder.itemTextView.text = name
    }

    override fun getItemCount(): Int {
        return names.size
    }
}

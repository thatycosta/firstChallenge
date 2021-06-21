package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.firstchallenge.R;
import com.example.firstchallenge.view.OurProducts;

import java.util.List;

import model.Coffee;

public class Adapter extends BaseAdapter {
    private static LayoutInflater layoutInflater = null;
    List<Coffee> coffees;

    private OurProducts listCoffee;

    public Adapter(OurProducts listCoffee, List<Coffee> coffees) {
        this.coffees       =  coffees;
        this.listCoffee  =  listCoffee;
        this.layoutInflater = (LayoutInflater) this.listCoffee.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return coffees.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View LineList = layoutInflater.inflate(R.layout.activity_line_our_products,null);

        TextView textViewName  =  LineList.findViewById(R.id.textViewName);
        TextView textViewDescription = LineList.findViewById(R.id.textViewDescription);

        textViewName.setText(coffees.get(position).getName());
        textViewDescription.setText(coffees.get(position).getDescription());

        return LineList;
    }
}

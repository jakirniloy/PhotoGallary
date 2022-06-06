package me.jakirniloy.photogallery;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class customAdapter extends BaseAdapter {
    Context context;
    ArrayList<imageArray> arrayList;
    String imageURL, description;
    public customAdapter(Context context, ArrayList<imageArray> arrayList){
        this.context = context;
        this.arrayList = arrayList;

    }

    @Override
    public int getCount() {
        return this.arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.customview, parent, false);

        ImageView imageView = rowView.findViewById(R.id.image);



        imageArray imageArray = arrayList.get(position);


        imageURL = imageArray.getImageID();
        description = imageArray.getDescription();
        Picasso.get().load("https://muthosoft.com/univ/photos/"+imageArray.getImageID()).resize(1000,1000).into(imageView);
        //coursename.setText(imagesArrayList.getimageID());
        //System.out.println(data);


        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, imageWithDescription.class);
                intent.putExtra("imageID", imageArray.getImageID());
                intent.putExtra("imageDes", imageArray.getDescription());
                context.startActivity(intent);
            }
        });

        return rowView;
    }
}

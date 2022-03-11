package com.example.customlistview;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ProductAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Product> listProduct;
    private int positionSelect = -1;

    public ProductAdapter(Context context, int idLayout, List<Product> listProduct) {
        this.context = context;
        this.idLayout = idLayout;
        this.listProduct = listProduct;
    }

    @Override
    public int getCount() {
        if (listProduct.size() != 0 && !listProduct.isEmpty()) {
            return listProduct.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
        }

        TextView tvLanguageName = (TextView) convertView.findViewById(R.id.tvLanguageName);
        TextView tvShop = (TextView) convertView.findViewById(R.id.txShop);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.logo);
        final LinearLayout linearLayout = (LinearLayout) convertView.findViewById(R.id.idLinearLayout);
        final Product product = listProduct.get(position);

        if (listProduct != null && !listProduct.isEmpty()) {
            tvLanguageName.setText(product.getTitle());
            tvShop.setText(product.getNameShop());
            int idLanguage = product.getId();
            switch (idLanguage) {
                case 1:
                    imageView.setImageResource(R.drawable.ca_nau_lau);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.do_choi_dang_mo_hinh);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.ga_bo_toi);
                    break;
                case 4:
                    imageView.setImageResource(R.drawable.hieu_long_con_tre);
                    break;
                case 5:
                    imageView.setImageResource(R.drawable.lanh_dao_gian_don);
                    break;
                case 6:
                    imageView.setImageResource(R.drawable.xa_can_cau);
                    break;
                default:
                    break;
            }
        }
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, product.getTitle(), Toast.LENGTH_LONG).show();
                positionSelect = position;
                notifyDataSetChanged();
            }
        });

        if (positionSelect == position) {
            linearLayout.setBackgroundColor(Color.YELLOW);
        } else {
            linearLayout.setBackgroundColor(Color.WHITE);
        }
        return convertView;
    }
}

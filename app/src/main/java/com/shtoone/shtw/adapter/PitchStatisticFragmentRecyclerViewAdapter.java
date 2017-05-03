package com.shtoone.shtw.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shtoone.shtw.R;
import com.shtoone.shtw.bean.MaterialStatisticFragmentData;
import com.shtoone.shtw.bean.SC_cailiaoyongliang;

import java.util.List;

/**
 * Created by gesangdianzi on 2016/9/7.
 */
public class PitchStatisticFragmentRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final String TAG = MaterialStatisticFragmentRecyclerViewAdapter.class.getSimpleName();
    private Context context;
    private List<SC_cailiaoyongliang> itemsData;
    private Resources mResources;

    public PitchStatisticFragmentRecyclerViewAdapter(Context context, List<SC_cailiaoyongliang> itemsData) {
        super();
        this.context = context;
        this.itemsData = itemsData;
        mResources = context.getResources();
    }

    @Override
    public int getItemCount() {
        if (itemsData != null && itemsData.size() > 0) {
            return itemsData.size();
        }
        return 0;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ItemViewHolder) {
            ItemViewHolder mItemViewHolder = (ItemViewHolder) holder;
            SC_cailiaoyongliang item = itemsData.get(position);
            ViewGroup mViewGroup = (ViewGroup) mItemViewHolder.tv_name.getParent();
            mViewGroup.setBackgroundColor(position % 2 == 0 ? mResources.getColor(R.color.material_teal_50) : mResources.getColor(R.color.material_blue_50));
            mItemViewHolder.tv_name.setText(item.getCailiaomingcheng());
            mItemViewHolder.tv_reality.setText(String.valueOf(item.getShijiKg()));
            mItemViewHolder.tv_matching.setText(String.valueOf(item.getpeibiKg()));
            mItemViewHolder.tv_deviation.setText(String.valueOf(item.getWuchaPst()));
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemViewHolder holder = new ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.item_recyclerview_material_statistic_fragment, parent, false));
        return holder;
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name;
        TextView tv_reality;
        TextView tv_matching;
        TextView tv_deviation;

        public ItemViewHolder(View view) {
            super(view);
            tv_name = (TextView) view.findViewById(R.id.tv_name_item_recyclerview_material_statistic_fragment);
            tv_reality = (TextView) view.findViewById(R.id.tv_reality_item_recyclerview_material_statistic_fragment);
            tv_matching = (TextView) view.findViewById(R.id.tv_matching_item_recyclerview_material_statistic_fragment);
            tv_deviation = (TextView) view.findViewById(R.id.tv_deviation_item_recyclerview_material_statistic_fragment);
        }
    }
}

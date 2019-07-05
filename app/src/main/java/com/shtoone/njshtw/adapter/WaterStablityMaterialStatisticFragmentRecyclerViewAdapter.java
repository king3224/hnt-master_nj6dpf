package com.shtoone.njshtw.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shtoone.njshtw.R;
import com.shtoone.njshtw.bean.MaterialStatisticFragmentData;
import com.shtoone.njshtw.bean.WaterStablityMaterialStatisticFragmentData;

import java.util.List;

/**
 * Created by leguang on 2016/7/22 0022.
 */
public class WaterStablityMaterialStatisticFragmentRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final String TAG = WaterStablityMaterialStatisticFragmentRecyclerViewAdapter.class.getSimpleName();
    private Context                                                   context;
    private List<WaterStablityMaterialStatisticFragmentData.DataEntity> itemsData;
    private Resources                                                 mResources;

    public WaterStablityMaterialStatisticFragmentRecyclerViewAdapter(Context context, List<WaterStablityMaterialStatisticFragmentData.DataEntity> itemsData) {
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
            WaterStablityMaterialStatisticFragmentData.DataEntity item = itemsData.get(position);
            ViewGroup mViewGroup = (ViewGroup) mItemViewHolder.tv_name.getParent();
            mViewGroup.setBackgroundColor(position % 2 == 0 ? mResources.getColor(R.color.material_teal_50) : mResources.getColor(R.color.material_blue_50));
            mItemViewHolder.tv_name.setText(item.getName());
            mItemViewHolder.tv_reality.setText(item.getYongliang());
            mItemViewHolder.tv_matching.setText(item.getMbpeibi());
            mItemViewHolder.tv_deviation.setText(item.getWucha());
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

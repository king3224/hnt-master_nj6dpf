package com.shtoone.njshtw.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shtoone.njshtw.R;
import com.shtoone.njshtw.bean.ProduceQueryDetailActivityData;
import com.shtoone.njshtw.bean.WaterStablityProduceQueryData;
import com.shtoone.njshtw.bean.WaterStablityProduceQueryDetailActivityData;

import java.util.List;

/**
 * Created by leguang on 2016/7/22 0022.
 */
public class WaterStablityProduceQueryDetailActivityRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final String TAG = WaterStablityProduceQueryDetailActivityRecyclerViewAdapter.class.getSimpleName();
    private Context                                        context;
    private List<WaterStablityProduceQueryDetailActivityData.DataEntity> itemsData;
    private Resources                                      mResources;

    public WaterStablityProduceQueryDetailActivityRecyclerViewAdapter(Context context, List<WaterStablityProduceQueryDetailActivityData.DataEntity> itemsData) {
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
            WaterStablityProduceQueryDetailActivityData.DataEntity item = itemsData.get(position);
            ViewGroup mViewGroup = (ViewGroup) mItemViewHolder.tv_material_name.getParent();
            mViewGroup.setBackgroundColor(position % 2 == 0 ? mResources.getColor(R.color.material_teal_50) : mResources.getColor(R.color.material_blue_50));
            mItemViewHolder.tv_material_name.setText(item.getName());
            mItemViewHolder.tv_reality.setText(item.getYongliang());
            mItemViewHolder.tv_matching.setText(item.getScpeibi());
            mItemViewHolder.tv_deviation.setText(item.getSgpeibi());
            mItemViewHolder.tv_deviation_rate.setText(item.getWucha());
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.item_recyclerview_produce_query_detail_activity, parent, false));
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView tv_material_name;
        TextView tv_reality;
        TextView tv_matching;
        TextView tv_deviation;
        TextView tv_deviation_rate;

        public ItemViewHolder(View view) {
            super(view);
            tv_material_name = (TextView) view.findViewById(R.id.tv_material_name_item_recyclerview_produce_query_detal_activity);
            tv_reality = (TextView) view.findViewById(R.id.tv_reality_item_recyclerview_produce_query_detal_activity);
            tv_matching = (TextView) view.findViewById(R.id.tv_matching_item_recyclerview_produce_query_detal_activity);
            tv_deviation = (TextView) view.findViewById(R.id.tv_deviation_item_recyclerview_produce_query_detal_activity);
            tv_deviation_rate = (TextView) view.findViewById(R.id.tv_deviation_rate_item_recyclerview_produce_query_detal_activity);
        }
    }
}

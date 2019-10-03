package dohieu.com.testapi0310;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import dohieu.com.testapi0310.model.RespondAfter;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private RespondAfter responseAfters;
    private OnClickListener onMenuClickListener;

    public Adapter(RespondAfter introduceList) {
        this.responseAfters = introduceList;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onMenuClickListener = onClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_name, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.tvName.setText(responseAfters.getListArea().get(position).getAreaName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onMenuClickListener != null)
                    onMenuClickListener.onClick(responseAfters.getListArea().get(position));
            }
        });
    }

    void changeData(RespondAfter responseAfter) {
        this.responseAfters = responseAfter;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (responseAfters.getListArea() == null) return 0;
        return responseAfters.getListArea().size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        final TextView tvName;

        ViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
        }
    }

    public interface OnClickListener {
        void onClick(RespondAfter.ListArea listArea);
    }
}

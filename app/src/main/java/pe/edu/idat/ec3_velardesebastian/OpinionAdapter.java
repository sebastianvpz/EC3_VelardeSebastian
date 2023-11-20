package pe.edu.idat.ec3_velardesebastian;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import pe.edu.idat.ec3_velardesebastian.databinding.ItemResenasBinding;

public class OpinionAdapter
        extends RecyclerView.Adapter<OpinionAdapter.ViewHolder> {

    private List<Opinion> data;

    public OpinionAdapter(List<Opinion> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_resenas, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Opinion item = data.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivimagen;
        private TextView tvnombre;
        private TextView tvdescripcion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivimagen = itemView.findViewById(R.id.ivimagen);
            tvnombre = itemView.findViewById(R.id.tvnombre);
            tvdescripcion = itemView.findViewById(R.id.tvdescripcion);
        }

        public void bind(Opinion item) {
            ivimagen.setImageResource(item.getImagen());
            tvnombre.setText(item.getNombre());
            tvdescripcion.setText(item.getDescripcion());
        }
    }
}

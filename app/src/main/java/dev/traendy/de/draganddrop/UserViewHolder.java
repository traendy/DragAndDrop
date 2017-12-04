package dev.traendy.de.draganddrop;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by speters on 03.12.17.
 */

public class UserViewHolder  extends RecyclerView.ViewHolder {

    ImageView userAvatar;
    TextView ticketTitle;
    ImageView reorderView;

    public UserViewHolder(View itemView) {
        super(itemView);

        userAvatar = itemView.findViewById(R.id.imageview_profile);
        ticketTitle = itemView.findViewById(R.id.textview_name);
        reorderView = itemView.findViewById(R.id.imageview_reorder);
    }
    }


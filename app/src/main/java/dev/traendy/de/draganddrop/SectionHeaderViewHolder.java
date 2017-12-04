package dev.traendy.de.draganddrop;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by speters on 01.12.17.
 */


public class SectionHeaderViewHolder extends RecyclerView.ViewHolder{
    TextView sectionTitle;

    public SectionHeaderViewHolder(View itemView){
        super(itemView);
        sectionTitle  = itemView.findViewById(R.id.textview_section_header);
        String type = sectionTitle.getText().toString();

        // SO nicht -.-
        if(type.equals(Type.BACKLOG.toString())){
            sectionTitle.setBackgroundColor(Color.BLACK);
            sectionTitle.setTextColor(Color.WHITE);
        }else if(type.equals(Type.IN_PROGRESS.toString())){
            sectionTitle.setBackgroundColor(Color.BLUE);
            sectionTitle.setTextColor(Color.WHITE);
        }else if(type.equals(Type.NEEDS_CLARIFICATION.toString())){
            sectionTitle.setBackgroundColor(Color.RED);
            sectionTitle.setTextColor(Color.WHITE);
        }else if(type.equals(Type.NEW.toString())){
            sectionTitle.setBackgroundColor(Color.GRAY);
            sectionTitle.setTextColor(Color.BLACK);
        }else if(type.equals(Type.READY_FOR_DEF.toString())){
            sectionTitle.setBackgroundColor(Color.GREEN);
            sectionTitle.setTextColor(Color.WHITE);
        }else if(type.equals(Type.WAITING.toString())){
            sectionTitle.setBackgroundColor(Color.YELLOW);
            sectionTitle.setTextColor(Color.BLACK);
        }


    }
}
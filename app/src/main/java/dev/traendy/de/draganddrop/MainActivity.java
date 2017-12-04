package dev.traendy.de.draganddrop;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.View;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private FloatingActionButton addTicketButton;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView userRecyclerView = findViewById(R.id.recyclerView);
        userRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter();
        RecyclerViewCallback swipeAndDragHelper = new RecyclerViewCallback(adapter);
        ItemTouchHelper touchHelper = new ItemTouchHelper(swipeAndDragHelper);
        adapter.setTouchHelper(touchHelper);
        userRecyclerView.setAdapter(adapter);
        touchHelper.attachToRecyclerView(userRecyclerView);

        UserData usersData = new UserData();
        List<Ticket> usersList = usersData.getUsersList();
        adapter.setUserList(usersList);
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();


        ListFragment listFragment = new ListFragment();
        fragmentTransaction.add(R.id.listfragment, listFragment);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.commit();

        addTicketButton = findViewById(R.id.add_ticket_fab);

        addTicketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddTicketDialog();
            }
        });
    }

    private void openAddTicketDialog() {
        Log.i(TAG, "Dialog opened");
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.listfragment, new AddTicketFragent());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
// Commit the transaction
        fragmentTransaction.commit();
    }

}
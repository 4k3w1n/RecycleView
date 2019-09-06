package com.example.latihansekolah;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyRecycleView extends AppCompatActivity {
private RecyclerView rvSuper;
private ArrayList<Super> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycle_view);

            rvSuper = findViewById(R.id.rv_super);
            rvSuper.setHasFixedSize(true);

            list.addAll(DataSuper.getListData());
            showRecylerList();
    }

    private void setHasFixedSize(boolean b) {
    }

    private void showRecylerList(){
        rvSuper.setLayoutManager(new LinearLayoutManager(this));
        ListSuperAdapter listSuperAdapter = new ListSuperAdapter(list);
        rvSuper.setAdapter(listSuperAdapter);
    }

    private void setAdapter(ListSuperAdapter listSuperAdapter) {
    }

    private void setLayoutManager(LinearLayoutManager linearLayoutManager) {
    }  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                break;
            case R.id.action_grid:
                break;
            case R.id.action_cardview:
                break;
        }
    }
}


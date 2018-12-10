package com.judy.poker;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    PokerActivity pokerActivity =new PokerActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pokerActivity.shuffle();
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new PokerAdapter());

    }

    class PokerAdapter extends RecyclerView.Adapter<PokerAdapter.PokerHolder> {
        @NonNull
        @Override
        public PokerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = getLayoutInflater().inflate(R.layout.poker_row, parent, false);
            return new PokerHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull PokerHolder holder, int position) {
            holder.pokerText.setText(pokerActivity.cards[position].get());
        }

        @Override
        public int getItemCount() {
            return pokerActivity.cards.length;
        }

        class PokerHolder extends RecyclerView.ViewHolder {
            TextView pokerText;
            public PokerHolder(View itemView) {
                super(itemView);
                pokerText = findViewById(R.id.tv_poker);
            }
        }
    }
        }




package com.veryworks.android.androidmemoorm;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.veryworks.android.androidmemoorm.model.PicNote;

import java.util.List;

/**
 * Created by pc on 9/22/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.Holder>{
    // 1. 데이터 저장소
    private List<PicNote> data;

    public void setData(List<PicNote> data){
        this.data = data;
    }
    // 2. 개수
    @Override
    public int getItemCount() { // 목록의 전체 길이를 결정
        return data.size();
    }
    // 3. 홀더 생성
    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        // 1. 만들어둔 layout 파일을 inflate 한다
        View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_list, parent, false);
        // 2. inflate 된 View 를 Holder의 생성자에 담는다
        Holder holder = new Holder(view);
        // 3. 생성된 Holder를 리턴한다.
        return holder;
    }
    // 4. 홀더 사용
    @Override
    public void onBindViewHolder(Holder holder, int position) {
        // 1. 데이터저장소에 객체단위로 꺼내둔다
        PicNote picNote = data.get(position);
        // 2. 홀더에 있는 위젯에 값을 입력한다.
        holder.setTitle(picNote.getTitle());
    }

    // 0. 홀더 만들기
    public class Holder extends RecyclerView.ViewHolder{
        private TextView textTitle;
        public Holder(View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.textTitle);
        }
        public void setTitle(String title){
            textTitle.setText(title);
        }
    }
}

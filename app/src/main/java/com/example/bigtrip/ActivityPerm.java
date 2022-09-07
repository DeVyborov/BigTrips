package com.example.bigtrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class ActivityPerm extends AppCompatActivity {

    ImageView viewImg;
    TextView textView, textView1;

    int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perm);

        viewImg = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        textView1 = findViewById(R.id.textView1);

        viewImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (progress == 0) {
                    viewImg.setImageResource(R.drawable.sobor);
                    textView.setText("Свято-Троицкий кафедральный Собор");
                    textView1.setText("Свято-Троицкий кафедральный собор изначально назывался Слудской церковью по имени горы Слудки, на которой он располагался. В середине XIX века местный купец Егор Шавкунов предложил воздвигнуть храм, основные расходы по строительству он брал на себя, недостающая часть была собрана прихожанами, а также использовались доходы часовни Святого Илии, что стояла на Сенном рынке.");
                    progress = 1;
                }
                else if (progress == 1) {
                    viewImg.setImageResource(R.drawable.hram);
                    textView.setText("Храм Вознесения Господня");
                    textView1.setText("Храм Вознесения Господня был построен в 1903–1910 года из красного кирпича в псеводрусском стиле по проекту архитектора А.И. Ожегова. Трехнефное здание находится на подклете, с западной стороны располагается колокольня с шатровым завершением, с восточной поднимаются сияющее золотом пятиглавие небольшого четверика. ");
                    progress = 2;
                }
                else if (progress == 2) {
                    viewImg.setImageResource(R.drawable.tuz);
                    textView.setText("ТЮЗ");
                    textView1.setText("Один из главных центров детской театральной культуры Перми — Театр юного зрителя — находится в историческом центре города, в пяти минутах ходьбы от остановки наземного транспорта «Театр оперы и балета (Главпочтамт)».");
                    progress = 3;
                }
                else if (progress == 3) {
                    finishAffinity();
                    Intent intent = new Intent(ActivityPerm.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
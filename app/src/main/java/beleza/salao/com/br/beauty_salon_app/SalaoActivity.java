package beleza.salao.com.br.beauty_salon_app;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SalaoActivity extends AppCompatActivity {

    private Spinner spinner;
    private CalendarView calendar;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        public List<String> colaboradores = new ArrayList<>();

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
//                    this.colaboradores = new ArrayList<>();
//                    colaboradores.add("Colaborador 1 - Cabeleireiro");
//                    colaboradores.add("Colaborador 2 - Manicure");
//                    colaboradores.add("Colaborador 3 - Depiladora");
//                    Spinner spinner = (Spinner) findViewById(R.id.colaboradores);
//                    spinner.setOnItemSelectedListener(new ItemSelectedListener());
//                    ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
//                            android.R.layout.simple_spinner_item, colaboradores);
//                    new ArrayAdapter<String>()
//                    dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                    spinner.setAdapter(dataAdapter);

//                    activity = new AgendaActivity();
//                    mTextMessage.setText(R.string.title_home);
                    return true;
//                case R.id.navigation_dashboard:
//                    mTextMessage.setText(R.string.title_dashboard);
//                    return true;
//                case R.id.navigation_notifications:
//                    mTextMessage.setText(R.string.title_notifications);
//                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salao);

//        mTextMessage = (TextView) findViewById(R.id.message);
//        activity = new AgendaActivity();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private class ItemSelectedListener implements AdapterView.OnItemSelectedListener {

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

}

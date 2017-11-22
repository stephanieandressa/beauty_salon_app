package beleza.salao.com.br.beauty_salon_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuscaAgendaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca_agenda);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        List<String> colaboradores = new ArrayList<>();
        colaboradores.add("Colaborador 1 - Cabeleireiro");
        colaboradores.add("Colaborador 2 - Manicure");
        colaboradores.add("Colaborador 3 - Depiladora");
        Spinner spinner = (Spinner) findViewById(R.id.colaboradores);
        spinner.setOnItemSelectedListener(new ItemSelectedListener());
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, colaboradores);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        CalendarView calendar = (CalendarView) findViewById(R.id.colaboradores_calendar);
        calendar.setDate(new Date().getTime());


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), AgendaActivity.class);
                startActivity(intent);
            }
        });
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

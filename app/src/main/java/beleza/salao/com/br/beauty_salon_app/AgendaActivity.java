package beleza.salao.com.br.beauty_salon_app;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AgendaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        final ListView listview = (ListView) findViewById(R.id.listview);
        String[] values = new String[] {
                "08:00 - Cliente 1",
                "08:30",
                "09:00 - Cliente 2",
                "09:30",
                "10:00",
                "10:30 - Cliente 3",
                "11:00 - Cliente 3",
                "11:30",
                "13:30 - Cliente 4",
                "14:00",
                "14:30 - Cliente 5",
                "15:00 - Cliente 6",
                "15:30 - Cliente 7",
                "16:00 - Cliente 8",
                "16:30",
                "17:00",
                "17:30"
        };

        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < values.length; ++i) {
            list.add(values[i]);
        }
        final StableArrayAdapter adapter = new StableArrayAdapter(this,
                android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);
    }

    private class StableArrayAdapter extends ArrayAdapter<String> {

        HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

        public StableArrayAdapter(Context context, int textViewResourceId,
                                  List<String> objects) {
            super(context, textViewResourceId, objects);
            for (int i = 0; i < objects.size(); ++i) {
                mIdMap.put(objects.get(i), i);
            }
        }

        @Override
        public long getItemId(int position) {
            String item = getItem(position);
            return mIdMap.get(item);
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

    }
}

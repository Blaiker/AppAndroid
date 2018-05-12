package appli.zoutix.gamescreen;

        import android.app.Activity;

        import android.os.Bundle;
        import android.widget.TextView;

public class AccueilActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        TextView text = (TextView) findViewById(R.id.email);
    }
}

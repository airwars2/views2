package nareshit.com.identifyingviews;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by nareshit on 6/8/2017.
 */

public class ViewsActivity extends Activity{

    EditText etName;
    EditText etMobile;
    Button btnSubmit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identifying_views);

        etName = (EditText) findViewById(R.id.et_name);
        etMobile = (EditText) findViewById(R.id.et_mobile);

        btnSubmit = (Button)findViewById(R.id.btn_submit);
    }

    public void onButtonClicked(View view){
        String name = etName.getText().toString();
        String mobile = etMobile.getText().toString();

        String message = name+mobile;

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}

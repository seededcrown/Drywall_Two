package sapphyx.gsd.com.drywall.activity.frames;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import sapphyx.gsd.com.drywall.R;
import sapphyx.gsd.com.drywall.fragments.Featured;

/**
 * Created by ry on 3/2/18.
 */

public class FeaturedFrame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);

        setContentView(R.layout.activity_frame);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.quick_content, new Featured())
                .commit();
    }
}

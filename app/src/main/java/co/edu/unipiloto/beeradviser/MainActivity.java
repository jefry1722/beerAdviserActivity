package co.edu.unipiloto.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Called when the user clicks the button
    public void onClickFindBeer(View view){
        //Get a reference to the TextView
        TextView brands= (TextView) findViewById(R.id.brands);
        //Get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Get the selected item in the spinner
        String beerType = String.valueOf(color.getSelectedItem());
        String beerBrands="";
        for(String beerRecomendation:BeerExpert.getBrands(beerType)){
            beerBrands+=beerRecomendation+"\n";
        }

        //Display the selected item
        brands.setText(beerBrands);
    }
}
package jamie.itsligo.newresistor;

//my imports
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    //declaring and initializing for later
    public Spinner spinner1,spinner2,spinner3,spinner4;
    public TextView tvRate1, tvRate2, tvMultiplier, tvTolerance,tvBand1,tvBand2,tvMultiband,tvTolerBand,tvResult1,tvResult2,tvResult3,tvResult4,tvFinalResult;

    // my arrays used throughout project
    String[] bandsArray = {"Black","Brown","Red","Orange","Yellow","Green","Blue","Violet","Grey","White"};
    String[] multiplierColourArray = {"Black","Brown","Red","Orange","Yellow","Green","Blue","Violet","Grey","White","Gold","Silver"};
    String[] toleranceColourArray = {"Brown","Red","Green","Blue","Violet","Grey","Gold","Silver","None"};
    double[] valueArray = {0,1,2,3,4,5,6,7,8,9};
    double[] multiplierArray = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000,0.1,0.01};
    String[] toleranceArray = {"±1%","±2%","±0.5%","±0.25%","±0.1%","±0.05%","±5%","±10%","±20%"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finding my elements to use thorughout code
        tvFinalResult = findViewById(R.id.tvFinalResult);
        tvResult1 = findViewById(R.id.textView1);
        tvResult2 = findViewById(R.id.textView2);
        tvResult3 = findViewById(R.id.textView3);
        tvResult4 = findViewById(R.id.textView4);

        tvFinalResult.setText("Please enter Values");


        //------------------------------------------Spinner1 code ------------------------------------------
        //setting up the spinner and telling it to listen for user
        spinner1 = (Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, bandsArray);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    // when the listener hears soemting it will run the switch
                    public void onItemSelected(AdapterView<?> arg0, View arg1,int arg2, long arg3) {
                        int position = spinner1.getSelectedItemPosition();
                        // depending the the position of the array I have specified
                        // it will change Text and Colour of the the given elements
                        switch(position) {
                            case 0:
                                tvRate1 = findViewById(R.id.textView1);
                                tvRate1.setText(String.valueOf(valueArray[0]));
                                tvBand1 = findViewById(R.id.tvBand1);
                                tvBand1.setBackgroundColor(Color.parseColor("#000000"));
                                break;
                            case 1:
                                tvRate1 = findViewById(R.id.textView1);
                                tvRate1.setText(String.valueOf(valueArray[1]));
                                tvBand1 = findViewById(R.id.tvBand1);
                                tvBand1.setBackgroundColor(Color.parseColor("#4B3A26"));
                                break;
                            case 2:
                                tvRate1 = findViewById(R.id.textView1);
                                tvRate1.setText(String.valueOf(valueArray[2]));
                                tvBand1 = findViewById(R.id.tvBand1);
                                tvBand1.setBackgroundColor(Color.parseColor("#ff0000"));
                                break;
                            case 3:
                                tvRate1 = findViewById(R.id.textView1);
                                tvRate1.setText(String.valueOf(valueArray[3]));
                                tvBand1 = findViewById(R.id.tvBand1);
                                tvBand1.setBackgroundColor(Color.parseColor("#ffaa00"));
                                break;
                            case 4:
                                tvRate1 = findViewById(R.id.textView1);
                                tvRate1.setText(String.valueOf(valueArray[4]));
                                tvBand1 = findViewById(R.id.tvBand1);
                                tvBand1.setBackgroundColor(Color.parseColor("#ffea00"));
                                break;
                            case 5:
                                tvRate1 = findViewById(R.id.textView1);
                                tvRate1.setText(String.valueOf(valueArray[5]));
                                tvBand1 = findViewById(R.id.tvBand1);
                                tvBand1.setBackgroundColor(Color.parseColor("#00ff11"));
                                break;
                            case 6:
                                tvRate1 = findViewById(R.id.textView1);
                                tvRate1.setText(String.valueOf(valueArray[6]));
                                tvBand1 = findViewById(R.id.tvBand1);
                                tvBand1.setBackgroundColor(Color.parseColor("#0051ff"));
                                break;
                            case 7:
                                tvRate1 = findViewById(R.id.textView1);
                                tvRate1.setText(String.valueOf(valueArray[7]));
                                tvBand1 = findViewById(R.id.tvBand1);
                                tvBand1.setBackgroundColor(Color.parseColor("#782fde"));
                                break;
                            case 8:
                                tvRate1 = findViewById(R.id.textView1);
                                tvRate1.setText(String.valueOf(valueArray[8]));
                                tvBand1 = findViewById(R.id.tvBand1);
                                tvBand1.setBackgroundColor(Color.parseColor("#a3a3a3"));
                                break;
                            case 9:
                                tvRate1 = findViewById(R.id.textView1);
                                tvRate1.setText(String.valueOf(valueArray[9]));
                                tvBand1 = findViewById(R.id.tvBand1);
                                tvBand1.setBackgroundColor(Color.parseColor("#fffcfc"));
                                break;
                            default:
                                // code block
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }

                }
        );

        //------------------------------------------spinner2 code------------------------------------------
        //setting up the spinner and telling it to listen for user
        spinner2 = (Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, bandsArray);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {

                    @Override
                    // when the listener hears soemting it will run the switch
                    public void onItemSelected(AdapterView<?> arg0, View arg1,int arg2, long arg3) {
                        int position = spinner2.getSelectedItemPosition();
                        // depending the the position of the array I have specified
                        // it will change Text and Colour of the the given elements
                        switch(position) {
                            case 0:
                                tvRate2 = findViewById(R.id.textView2);
                                tvRate2.setText(String.valueOf(valueArray[0]));
                                tvBand2 = findViewById(R.id.tvBand2);
                                tvBand2.setBackgroundColor(Color.parseColor("#000000"));
                                break;
                            case 1:
                                tvRate2 = findViewById(R.id.textView2);
                                tvRate2.setText(String.valueOf(valueArray[1]));
                                tvBand2 = findViewById(R.id.tvBand2);
                                tvBand2.setBackgroundColor(Color.parseColor("#4B3A26"));
                                break;
                            case 2:
                                tvRate2 = findViewById(R.id.textView2);
                                tvRate2.setText(String.valueOf(valueArray[2]));
                                tvBand2 = findViewById(R.id.tvBand2);
                                tvBand2.setBackgroundColor(Color.parseColor("#ff0000"));
                                break;
                            case 3:
                                tvRate2 = findViewById(R.id.textView2);
                                tvRate2.setText(String.valueOf(valueArray[3]));
                                tvBand2 = findViewById(R.id.tvBand2);
                                tvBand2.setBackgroundColor(Color.parseColor("#ffaa00"));
                                break;
                            case 4:
                                tvRate2 = findViewById(R.id.textView2);
                                tvRate2.setText(String.valueOf(valueArray[4]));
                                tvBand2 = findViewById(R.id.tvBand2);
                                tvBand2.setBackgroundColor(Color.parseColor("#ffea00"));
                                break;
                            case 5:
                                tvRate2 = findViewById(R.id.textView2);
                                tvRate2.setText(String.valueOf(valueArray[5]));
                                tvBand2 = findViewById(R.id.tvBand2);
                                tvBand2.setBackgroundColor(Color.parseColor("#00ff11"));
                                break;
                            case 6:
                                tvRate2 = findViewById(R.id.textView2);
                                tvRate2.setText(String.valueOf(valueArray[6]));
                                tvBand2 = findViewById(R.id.tvBand2);
                                tvBand2.setBackgroundColor(Color.parseColor("#0051ff"));
                                break;
                            case 7:
                                tvRate2 = findViewById(R.id.textView2);
                                tvRate2.setText(String.valueOf(valueArray[7]));
                                tvBand2 = findViewById(R.id.tvBand2);
                                tvBand2.setBackgroundColor(Color.parseColor("#782fde"));
                                break;
                            case 8:
                                tvRate2 = findViewById(R.id.textView2);
                                tvRate2.setText(String.valueOf(valueArray[8]));
                                tvBand2 = findViewById(R.id.tvBand2);
                                tvBand2.setBackgroundColor(Color.parseColor("#a3a3a3"));
                                break;
                            case 9:
                                tvRate2 = findViewById(R.id.textView2);
                                tvRate2.setText(String.valueOf(valueArray[9]));
                                tvBand2 = findViewById(R.id.tvBand2);
                                tvBand2.setBackgroundColor(Color.parseColor("#fffcfc"));
                                break;
                            default:
                                // code block
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }

                }
        );

        //------------------------------------------spinner3 code------------------------------------------
        //setting up the spinner and telling it to listen for user
        spinner3 = (Spinner)findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, multiplierColourArray);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {

                    @Override
                    // when the listener hears soemting it will run the switch
                    public void onItemSelected(AdapterView<?> arg0, View arg1,int arg2, long arg3) {
                        int position = spinner3.getSelectedItemPosition();
                        // depending the the position of the array I have specified
                        // it will change Text and Colour of the the given elements
                        switch(position) {
                            case 0:
                                tvMultiplier = findViewById(R.id.textView3);
                                tvMultiplier.setText(String.valueOf(multiplierArray[0]));
                                tvMultiband = findViewById(R.id.tvMultiBand);
                                tvMultiband.setBackgroundColor(Color.parseColor("#000000"));
                                break;
                            case 1:
                                tvMultiplier = findViewById(R.id.textView3);
                                tvMultiplier.setText(String.valueOf(multiplierArray[1]));
                                tvMultiband = findViewById(R.id.tvMultiBand);
                                tvMultiband.setBackgroundColor(Color.parseColor("#4B3A26"));
                                break;
                            case 2:
                                tvMultiplier = findViewById(R.id.textView3);
                                tvMultiplier.setText(String.valueOf(multiplierArray[2]));
                                tvMultiband = findViewById(R.id.tvMultiBand);
                                tvMultiband.setBackgroundColor(Color.parseColor("#ff0000"));
                                break;
                            case 3:
                                tvMultiplier = findViewById(R.id.textView3);
                                tvMultiplier.setText(String.valueOf(multiplierArray[3]));
                                tvMultiband = findViewById(R.id.tvMultiBand);
                                tvMultiband.setBackgroundColor(Color.parseColor("#ffaa00"));
                                break;
                            case 4:
                                tvMultiplier = findViewById(R.id.textView3);
                                tvMultiplier.setText(String.valueOf(multiplierArray[4]));
                                tvMultiband = findViewById(R.id.tvMultiBand);
                                tvMultiband.setBackgroundColor(Color.parseColor("#ffea00"));
                                break;
                            case 5:
                                tvMultiplier = findViewById(R.id.textView3);
                                tvMultiplier.setText(String.valueOf(multiplierArray[5]));
                                tvMultiband = findViewById(R.id.tvMultiBand);
                                tvMultiband.setBackgroundColor(Color.parseColor("#00ff11"));
                                break;
                            case 6:
                                tvMultiplier = findViewById(R.id.textView3);
                                tvMultiplier.setText(String.valueOf(multiplierArray[6]));
                                tvMultiband = findViewById(R.id.tvMultiBand);
                                tvMultiband.setBackgroundColor(Color.parseColor("#0051ff"));
                                break;
                            case 7:
                                tvMultiplier = findViewById(R.id.textView3);
                                tvMultiplier.setText(String.valueOf(multiplierArray[7]));
                                tvMultiband = findViewById(R.id.tvMultiBand);
                                tvMultiband.setBackgroundColor(Color.parseColor("#782fde"));
                                break;
                            case 8:
                                tvMultiplier = findViewById(R.id.textView3);
                                tvMultiplier.setText(String.valueOf(multiplierArray[8]));
                                tvMultiband = findViewById(R.id.tvMultiBand);
                                tvMultiband.setBackgroundColor(Color.parseColor("#a3a3a3"));
                                break;
                            case 9:
                                tvMultiplier = findViewById(R.id.textView3);
                                tvMultiplier.setText(String.valueOf(multiplierArray[9]));
                                tvMultiband = findViewById(R.id.tvMultiBand);
                                tvMultiband.setBackgroundColor(Color.parseColor("#fffcfc"));
                                break;
                            case 10:
                                tvMultiplier = findViewById(R.id.textView3);
                                tvMultiplier.setText(String.valueOf(multiplierArray[10]));
                                tvMultiband = findViewById(R.id.tvMultiBand);
                                tvMultiband.setBackgroundColor(Color.parseColor("#dbc202"));
                                break;
                            case 11:
                                tvMultiplier = findViewById(R.id.textView3);
                                tvMultiplier.setText(String.valueOf(multiplierArray[11])) ;
                                tvMultiband = findViewById(R.id.tvMultiBand);
                                tvMultiband.setBackgroundColor(Color.parseColor("#dbdbdb"));
                                break;
                            default:
                                // code block
                        }

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }

                }
        );

        //------------------------------------------spinner4 code------------------------------------------
        //setting up the spinner and telling it to listen for user
        spinner4 = (Spinner)findViewById(R.id.spinner4);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, toleranceColourArray);
        spinner4.setAdapter(adapter4);
        spinner4.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    // when the listener hears soemting it will run the switch
                    public void onItemSelected(AdapterView<?> arg0, View arg1,int arg2, long arg3) {
                        int position = spinner4.getSelectedItemPosition();
                        tvTolerBand = findViewById(R.id.tvtolerBand);
                        tvTolerBand.setVisibility(View.VISIBLE);;
                        // depending the the position of the array I have specified
                        // it will change Text and Colour of the the given elements
                        switch(position) {
                            case 0:
                                tvTolerance = findViewById(R.id.textView4);
                                tvTolerance.setText(String.valueOf(toleranceArray[0]));
                                tvTolerBand = findViewById(R.id.tvtolerBand);
                                tvTolerBand.setBackgroundColor(Color.parseColor("#4B3A26"));
                                break;
                            case 1:
                                tvTolerance = findViewById(R.id.textView4);
                                tvTolerance.setText(String.valueOf(toleranceArray[1]));
                                tvTolerBand = findViewById(R.id.tvtolerBand);
                                tvTolerBand.setBackgroundColor(Color.parseColor("#ff0000"));
                                break;
                            case 2:
                                tvTolerance = findViewById(R.id.textView4);
                                tvTolerance.setText(String.valueOf(toleranceArray[2]));
                                tvTolerBand = findViewById(R.id.tvtolerBand);
                                tvTolerBand.setBackgroundColor(Color.parseColor("#00ff11"));
                                break;
                            case 3:
                                tvTolerance = findViewById(R.id.textView4);
                                tvTolerance.setText(String.valueOf(toleranceArray[3]));
                                tvTolerBand = findViewById(R.id.tvtolerBand);
                                tvTolerBand.setBackgroundColor(Color.parseColor("#0051ff"));
                                break;
                            case 4:
                                tvTolerance = findViewById(R.id.textView4);
                                tvTolerance.setText(String.valueOf(toleranceArray[4]));
                                tvTolerBand = findViewById(R.id.tvtolerBand);
                                tvTolerBand.setBackgroundColor(Color.parseColor("#782fde"));
                                break;
                            case 5:
                                tvTolerance = findViewById(R.id.textView4);
                                tvTolerance.setText(String.valueOf(toleranceArray[5]));
                                tvTolerBand = findViewById(R.id.tvtolerBand);
                                tvTolerBand.setBackgroundColor(Color.parseColor("#a3a3a3"));
                                break;
                            case 6:
                                tvTolerance = findViewById(R.id.textView4);
                                tvTolerance.setText(String.valueOf(toleranceArray[6]));
                                tvTolerBand = findViewById(R.id.tvtolerBand);
                                tvTolerBand.setBackgroundColor(Color.parseColor("#dbc202"));
                                break;
                            case 7:
                                tvTolerance = findViewById(R.id.textView4);
                                tvTolerance.setText(String.valueOf(toleranceArray[7]));
                                tvTolerBand = findViewById(R.id.tvtolerBand);
                                tvTolerBand.setBackgroundColor(Color.parseColor("#dbdbdb"));
                                break;
                            case 8:
                                tvTolerance = findViewById(R.id.textView4);
                                tvTolerance.setText(String.valueOf(toleranceArray[8]));
                                tvTolerBand = findViewById(R.id.tvtolerBand);
                                tvTolerBand.setVisibility(View.INVISIBLE);;
                                break;
                            default:
                                // code block
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }

                }
        );
    }


    //when the calculate button is pressed
    public void doCalc(View view) {
        // get the values the user inputted
        double calc1 = Double.valueOf(tvResult1.getText().toString());
        double calc2 = Double.valueOf(tvResult2.getText().toString());
        double calc3 = Double.valueOf(tvResult3.getText().toString());
        String calc4 = tvResult4.getText().toString();

        //calculation to find answer
        double FinalOutput = (((calc1 * 10) + calc2) * calc3);
        //display to the user
        tvFinalResult.setText(FinalOutput +" Ω  " + calc4);

    }

    //when the reset button is pressed
    public void doReset(View view) {
        // set elements to empty
        tvRate1.setText("0");
        tvRate2.setText("0");
        tvMultiplier.setText("0");
        tvTolerance.setText("±0%");
        tvFinalResult.setText("Please Enter Values");
        tvBand1.setBackgroundColor(Color.parseColor("#000000"));
        tvBand2.setBackgroundColor(Color.parseColor("#000000"));
        tvMultiband.setBackgroundColor(Color.parseColor("#000000"));
        tvTolerBand.setBackgroundColor(Color.parseColor("#000000"));
    }
}
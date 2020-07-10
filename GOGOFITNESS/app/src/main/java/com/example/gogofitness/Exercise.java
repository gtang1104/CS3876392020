package com.example.gogofitness;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import pl.droidsonroids.gif.GifImageView;

public class Exercise extends AppCompatActivity {

    String [] listString1;
    String [] listString2;
    int [] image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("intVariableName", 0);


        switch (intValue) {
            case 0:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits"};
                listString2= new String[]{"x 10", "x 20", "x 10", "x 25", "x 10",
                        "x 15", "x 25", "x 25", "x 20", "x 25",
                        "x 15", "x 20", "x 25", "x 15", "x 10"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15};

                break;
            case 1:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits"};
                listString2= new String[]{"x 10", "x 20", "x 10", "x 25", "x 10",
                        "x 15", "x 25", "x 25", "x 20", "x 25",
                        "x 15", "x 20", "x 25", "x 15", "x 10"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15};

                break;
            case 2:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits"};
                listString2= new String[]{"x 10", "x 20", "x 10", "x 25", "x 10",
                        "x 15", "x 25", "x 25", "x 20", "x 25",
                        "x 15", "x 20", "x 25", "x 15", "x 10"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15};

                break;
            case 3:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits"};
                listString2= new String[]{"x 15", "x 25", "x 15", "x 30", "x 15",
                        "x 20", "x 30", "x 30", "x 25", "x 30",
                        "x 20", "x 25", "x 30", "x 20", "x 15"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15};

                break;
            case 4:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits"};
                listString2= new String[]{"x 15", "x 25", "x 15", "x 30", "x 15",
                        "x 20", "x 30", "x 30", "x 25", "x 30",
                        "x 20", "x 25", "x 30", "x 20", "x 15"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15};
                break;
            case 5:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits"};
                listString2= new String[]{"x 15", "x 25", "x 15", "x 30", "x 15",
                        "x 20", "x 30", "x 30", "x 25", "x 30",
                        "x 20", "x 25", "x 30", "x 20", "x 15"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15};

                break;
            case 6:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits"};
                listString2= new String[]{"x 15", "x 25", "x 15", "x 30", "x 15",
                        "x 20", "x 30", "x 30", "x 25", "x 30",
                        "x 20", "x 25", "x 30", "x 20", "x 15"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15};

                break;
            case 7:

                listString1= new String[]{"Rest"};
                listString2= new String[]{"Whole day rest"};
                image = new int[]{R.drawable.g1};

                break;
            case 8:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits"};
                listString2= new String[]{"x 20", "x 30", "x 20", "x 35", "x 20",
                        "x 25", "x 35", "x 35", "x 30", "x 35",
                        "x 25", "x 30", "x 35", "x 25", "x 25"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15};

                break;
            case 9:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits"};
                listString2= new String[]{"x 20", "x 30", "x 20", "x 35", "x 20",
                        "x 25", "x 35", "x 35", "x 30", "x 35",
                        "x 25", "x 30", "x 35", "x 25", "x 25"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15};

                break;
            case 10:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits"};
                listString2= new String[]{"x 20", "x 30", "x 20", "x 35", "x 20",
                        "x 25", "x 35", "x 35", "x 30", "x 35",
                        "x 25", "x 30", "x 35", "x 25", "x 25"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15};

                break;
            case 11:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits"};
                listString2= new String[]{"x 25", "x 35", "x 25", "x 40", "x 25",
                        "x 30", "x 40", "x 40", "x 35", "x 40",
                        "x 30", "x 35", "x 40", "x 30", "x 30"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15};

                break;
            case 12:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits"};
                listString2= new String[]{"x 25", "x 35", "x 25", "x 40", "x 25",
                        "x 30", "x 40", "x 40", "x 35", "x 40",
                        "x 30", "x 35", "x 40", "x 30", "x 30"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15};

                break;
            case 13:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits"};
                listString2= new String[]{"x 25", "x 35", "x 25", "x 40", "x 25",
                        "x 30", "x 40", "x 40", "x 35", "x 40",
                        "x 30", "x 35", "x 40", "x 30", "x 30"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15};

                break;
            case 14:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits"};
                listString2= new String[]{"x 25", "x 35", "x 25", "x 40", "x 25",
                        "x 30", "x 40", "x 40", "x 35", "x 40",
                        "x 30", "x 35", "x 40", "x 30", "x 30"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15};

                break;
            case 15:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits",
                        "Cossack Squatsgif", "Kettlebell Overhand Swing"};
                listString2= new String[]{"x 25", "x 35", "x 25", "x 40", "x 25",
                        "x 30", "x 40", "x 40", "x 35", "x 40",
                        "x 30", "x 35", "x 40", "x 30", "x 30",
                        "x 15", "x 15"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15, R.drawable.g16, R.drawable.g17};

                break;
            case 16:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits",
                        "Cossack Squatsgif", "Kettlebell Overhand Swing"};
                listString2= new String[]{"x 25", "x 35", "x 25", "x 40", "x 25",
                        "x 30", "x 40", "x 40", "x 35", "x 40",
                        "x 30", "x 35", "x 40", "x 30", "x 30",
                        "x 15", "x 15"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15, R.drawable.g16, R.drawable.g17};


                break;
            case 17:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits",
                        "Cossack Squatsgif", "Kettlebell Overhand Swing"};
                listString2= new String[]{"x 25", "x 35", "x 25", "x 40", "x 25",
                        "x 30", "x 40", "x 40", "x 35", "x 40",
                        "x 30", "x 35", "x 40", "x 30", "x 30",
                        "x 15", "x 15"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15, R.drawable.g16, R.drawable.g17};


                break;
            case 18:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits",
                        "Cossack Squatsgif", "Kettlebell Overhand Swing", "Sit-up", "Push up"};
                listString2= new String[]{"x 30", "x 40", "x 30", "x 45", "x 30",
                        "x 35", "x 45", "x 45", "x 40", "x 45",
                        "x 35", "x 40", "x 45", "x 35", "x 35",
                        "x 20", "x 20", "x 10", "x 10"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15, R.drawable.g16, R.drawable.g17, R.drawable.g18,
                        R.drawable.g19};

                break;
            case 19:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits",
                        "Cossack Squatsgif", "Kettlebell Overhand Swing", "Sit-up", "Push up"};
                listString2= new String[]{"x 30", "x 40", "x 30", "x 45", "x 30",
                        "x 35", "x 45", "x 45", "x 40", "x 45",
                        "x 35", "x 40", "x 45", "x 35", "x 35",
                        "x 20", "x 20", "x 10", "x 10"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15, R.drawable.g16, R.drawable.g17, R.drawable.g18,
                        R.drawable.g19};

                break;
            case 20:

                listString1= new String[]{"Rest"};
                listString2= new String[]{"Whole day rest"};
                image = new int[]{R.drawable.g1};

                break;
            case 21:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits",
                        "Cossack Squatsgif", "Kettlebell Overhand Swing", "Sit-up", "Push up", "Front Plank",
                        "Barbell Lunge"};
                listString2= new String[]{"x 35", "x 45", "x 35", "x 50", "x 35",
                        "x 40", "x 50", "x 50", "x 45", "x 50",
                        "x 40", "x 45", "x 50", "x 40", "x 40",
                        "x 25", "x 25", "x 15", "x 15", "1:00",
                        "x 25"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15, R.drawable.g16, R.drawable.g17, R.drawable.g18,
                        R.drawable.g19, R.drawable.g20, R.drawable.g21};

                break;
            case 22:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits",
                        "Cossack Squatsgif", "Kettlebell Overhand Swing", "Sit-up", "Push up", "Front Plank",
                        "Barbell Lunge"};
                listString2= new String[]{"x 35", "x 45", "x 35", "x 50", "x 35",
                        "x 40", "x 50", "x 50", "x 45", "x 50",
                        "x 40", "x 45", "x 50", "x 40", "x 40",
                        "x 25", "x 25", "x 15", "x 15", "2:00",
                        "x 25"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15, R.drawable.g16, R.drawable.g17, R.drawable.g18,
                        R.drawable.g19, R.drawable.g20, R.drawable.g21};

                break;
            case 23:

                listString1= new String[]{"Rest"};
                listString2= new String[]{"Whole day rest"};
                image = new int[]{R.drawable.g1};

                break;
            case 24:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits",
                        "Cossack Squatsgif", "Kettlebell Overhand Swing", "Sit-up", "Push up", "Front Plank",
                        "Barbell Lunge", "Crunch Floor", "Diamond Push up", "Bench dip"};
                listString2= new String[]{"x 40", "x 50", "x 40", "x 55", "x 40",
                        "x 45", "x 55", "x 55", "x 50", "x 55",
                        "x 45", "x 50", "x 55", "x 45", "x 45",
                        "x 30", "x 30", "x 20", "x 20", "3:00",
                        "x 30", "x 15", "x 12", "x 12"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15, R.drawable.g16, R.drawable.g17, R.drawable.g18,
                        R.drawable.g19, R.drawable.g20, R.drawable.g21, R.drawable.g22, R.drawable.g23, R.drawable.g24};

                break;
            case 25:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits",
                        "Cossack Squatsgif", "Kettlebell Overhand Swing", "Sit-up", "Push up", "Front Plank",
                        "Barbell Lunge", "Crunch Floor", "Diamond Push up", "Bench dip"};
                listString2= new String[]{"x 40", "x 50", "x 40", "x 55", "x 40",
                        "x 45", "x 55", "x 55", "x 50", "x 55",
                        "x 45", "x 50", "x 55", "x 45", "x 45",
                        "x 30", "x 30", "x 20", "x 20", "3:00",
                        "x 30", "x 15", "x 12", "x 12"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15, R.drawable.g16, R.drawable.g17, R.drawable.g18,
                        R.drawable.g19, R.drawable.g20, R.drawable.g21, R.drawable.g22, R.drawable.g23, R.drawable.g24};

                break;
            case 26:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits",
                        "Cossack Squatsgif", "Kettlebell Overhand Swing", "Sit-up", "Push up", "Front Plank",
                        "Barbell Lunge", "Crunch Floor", "Diamond Push up", "Bench dip"};
                listString2= new String[]{"x 40", "x 50", "x 40", "x 55", "x 40",
                        "x 45", "x 55", "x 55", "x 50", "x 55",
                        "x 45", "x 50", "x 55", "x 45", "x 45",
                        "x 30", "x 30", "x 20", "x 20", "3:00",
                        "x 30", "x 15", "x 12", "x 12"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15, R.drawable.g16, R.drawable.g17, R.drawable.g18,
                        R.drawable.g19, R.drawable.g20, R.drawable.g21, R.drawable.g22, R.drawable.g23, R.drawable.g24};

                break;
            case 27:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits",
                        "Cossack Squatsgif", "Kettlebell Overhand Swing", "Sit-up", "Push up", "Front Plank",
                        "Barbell Lunge", "Crunch Floor", "Diamond Push up", "Bench dip"};
                listString2= new String[]{"x 45", "x 55", "x 45", "x 60", "x 45",
                        "x 50", "x 60", "x 60", "x 55", "x 60",
                        "x 50", "x 55", "x 60", "x 50", "x 50",
                        "x 35", "x 35", "x 25", "x 2", "5:00",
                        "x 35", "x 20", "x 17", "x 17"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15, R.drawable.g16, R.drawable.g17, R.drawable.g18,
                        R.drawable.g19, R.drawable.g20, R.drawable.g21, R.drawable.g22, R.drawable.g23, R.drawable.g24};

                break;
            case 28:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits",
                        "Cossack Squatsgif", "Kettlebell Overhand Swing", "Sit-up", "Push up", "Front Plank",
                        "Barbell Lunge", "Crunch Floor", "Diamond Push up", "Bench dip"};
                listString2= new String[]{"x 45", "x 55", "x 45", "x 60", "x 45",
                        "x 50", "x 60", "x 60", "x 55", "x 60",
                        "x 50", "x 55", "x 60", "x 50", "x 50",
                        "x 35", "x 35", "x 25", "x 2", "5:00",
                        "x 35", "x 20", "x 17", "x 17"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15, R.drawable.g16, R.drawable.g17, R.drawable.g18,
                        R.drawable.g19, R.drawable.g20, R.drawable.g21, R.drawable.g22, R.drawable.g23, R.drawable.g24};

                break;
            case 29:

                listString1= new String[]{"Burpee", "Elbows Back Stretch", "Half Moon Pose", "Iron Cross Stretch", "Mountain Climber",
                        "Pretzel Stretch", "Addauctor stretch", "All Fours quad Stretch", "Exercise Ball Chest Stretch", "Lying Leg Raise",
                        "Crossover Kneeling Stretch", "Ceiling Look Stretch", "Exercise Ball Side Stretch", "Kneeling Lat Stretch", "Roll-overs into V-sits",
                        "Cossack Squatsgif", "Kettlebell Overhand Swing", "Sit-up", "Push up", "Front Plank",
                        "Barbell Lunge", "Crunch Floor", "Diamond Push up", "Bench dip"};
                listString2= new String[]{"x 45", "x 55", "x 45", "x 60", "x 45",
                        "x 50", "x 60", "x 60", "x 55", "x 60",
                        "x 50", "x 55", "x 60", "x 50", "x 50",
                        "x 35", "x 35", "x 25", "x 2", "5:00",
                        "x 35", "x 20", "x 17", "x 17"};

                image = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
                        R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12,
                        R.drawable.g13, R.drawable.g14, R.drawable.g15, R.drawable.g16, R.drawable.g17, R.drawable.g18,
                        R.drawable.g19, R.drawable.g20, R.drawable.g21, R.drawable.g22, R.drawable.g23, R.drawable.g24};

                break;


        }

        ListView list=(ListView) findViewById(R.id.listView1);
        CustomAdaptor customAdaptor=new CustomAdaptor();
        list.setAdapter(customAdaptor);


    }
    class CustomAdaptor extends BaseAdapter {

        @Override
        public int getCount() {
            return listString1.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            view = getLayoutInflater().inflate(R.layout.exercise_layout,null);
            TextView text1=(TextView) view.findViewById(R.id.textView4);
            TextView text2=(TextView) view.findViewById(R.id.textView5);
            GifImageView gif= (GifImageView)  view.findViewById(R.id.gif_view);
            gif.setImageResource(image[position]);
            text1.setText(listString1[position]);
            text2.setText(listString2[position]);
            return view;
        }
    }

}
package application;

import java.util.Random;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    private Button closeButton;

    @FXML
    void closeButtonAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private Button generateWorkout;

    @FXML
    private TextArea textArea;

    @FXML
    void generateMyWorkout(ActionEvent event) {
        TextArea txtlog = this.textArea;

        String[][] monday = new String[][] {
                new String[] { "Chest", "Incline barbell bench: 4 set of 8",
                        "Incline DB: 4 sets of 10",
                        "Upper chest cable fly: 15, 12, 10, 8",
                        "Hammer strength chest press: 3 sets of 10",
                        "Dumbbell fly: 4 sets of 12",
                        "Dips: 3 sets to failure" },
                new String[] { "Chest and Triceps",
                        "Barbell Bench Press  4x   10, 8, 8, 6",
                        "Incline Bench Press  3x   8, 8, 6",
                        "Decline Bench Press  3x   8, 8, 6",
                        "Dumbbell Flys    2x   10",
                        "Dumbbell Pullover    2x   8",
                        "Tricep Extension 4x   10, 8, 8, 6 Incr. weight",
                        "Tricep Dip   3x   10", "Tricep Bench Dip 3x   8" }

        };
        int num = 0;

        txtlog.appendText("Monday" + "\n");

        num = getRandomNumberInRange(0, monday.length - 1);
        printworkout(monday, num, txtlog);

        txtlog.appendText("Tuesday" + "\n");

        String[][] tuesday = new String[][] { new String[] { "Arms",
                "Tricep push down: 15, 12, 10, 8 - SUPA SET - Dumbbell curl: 15, 12, 10 ,8",
                "Skull crushers: 4 sets of 8 - SUPA SET - Barbell curl: 4 sets of 8",
                "Single arm preacher curl: 4 sets of 12 - SUPA SET - Tricep kickback: 4 sets of 12",
                "Hammer curls: 4 sets of 10 - SUPA SET - Reverse barbell curl: 4 sets of 15",
                "Overhead dumbbell extension: 4 sets of 10 - SUPA SET - Tricep dips on bench: 4 sets to failure" },
                new String[] { "Back and Biceps",
                        "Deadlift  5x   10, 8, 8, 6, 4", "Chin Up   2x   8",
                        "One Arm Dumbbell Row   3x   8", "Seated Row 2x   8",
                        "Close Grip Lat Pull Down   3x   10, 10, 8",
                        "Standing Barbell Curl  3x   8, 8, 6",
                        "Close Grip Preacher Curl   3x   8, 8, 6",
                        "Incline Dumbbell Curl    2x   12-14",
                        "Concentration Curl 2x  10" }

        };
        num = getRandomNumberInRange(0, tuesday.length - 1);
        printworkout(tuesday, num, txtlog);

        txtlog.appendText("Wednseday" + "\n");

        String[][] wednesday = new String[][] {
                new String[] { "Rest Day/Cardio" },
                new String[] { "Back/Traps",
                        "Pull ups: 4 sets to failure (I never fail tho)",
                        "Lat pull down: 5 sets: 15, 12, 8, 8, 12",
                        "Dumbbell row: 4 sets of 8",
                        "Cable row with fat gripzzzz: 4 sets: 12, 10, 8, 6",
                        "Single arm lat pull down: 4 sets of 10",
                        "Face pulls: 4 sets of 10, squeeze that shit hard and hold it you lil bitch",
                        "Barbell shrugs: 6 sets: 8, 8, 8, 15, 15, 15" } };
        num = getRandomNumberInRange(0, wednesday.length - 1);
        printworkout(wednesday, num, txtlog);

        txtlog.appendText("Thursday" + "\n");

        String[][] Thursday = new String[][] {
                new String[] { "Legs", "SKIP", "Do arms" },
                new String[] { "Shouder and Forearms",
                        "Machine Shoulder Press    3x   10",
                        "Dumbbell Reverse Fly  3x   8-10",
                        "Military Press 4x   10",
                        "Dumbbell Lateral Raise    2x   10",
                        "Dumbbell Shrugs   2x   10", "Upright Row    2x   10",
                        "Standing Wrist Curl   4x   10",
                        "Barbell Wrist Curl    4x   10" } };
        num = getRandomNumberInRange(0, Thursday.length - 1);
        printworkout(Thursday, num, txtlog);

        txtlog.appendText("Friday" + "\n");

        String[][] Friday = new String[][] { new String[] { "Shoulders",
                "Warm up (sort of): DB lateral raises: 4 sets of 20",
                "Standing barbell shoulder press: 10, 8, 8, 6",
                "Rear delt cable flyes: 4 sets of 12",
                "Upright rows: 4 sets of 10",
                "Front raises (barbell or dumbbell): 4 sets of 15",
                "Cable lateral raises: 4 sets of 12 - SUPA SET - Bent over cable lateral raises: 4 sets of 10",
                "Friday night: Get fucked up, get laid" },
                new String[] { "Legs", "Squat  5x   10, 8, 8, 6, 4",
                        "Leg Extension 3x   12", "Leg Curl  3   12",
                        "Standing Calf Raise    4x   12",
                        "Seated calf Raise 2x   12" },
                new String[] { "Armed Robbery",
                        "Warm up: a hot PUMPKin pie cuz it's arm day.",
                        "EZ-bar preacher curl: 15, 12, 10, 8",
                        "Tricep rope push down: 15, 12, 10, 8",
                        "Skull crushers: 4 x 8 -SUPASET- Barbell curl: 4 x 8",
                        "Single arm hammer curls: 4 x 10 -SUPASET- Single arm tricep kickback: 4 x12 (Highly recommend doing these on a bench or leaning on something so it doesn't look like you are getting B-fucked while tossing out handies)",
                        "Overhead cable tricep extension: 4 x15 -SUPASET- Cable reverse curls: 4 x 15",
                        "Incline DB curl: 4 x 10 -DROPSET- 12",
                        "Incline DB skull crushers: 4 x 10 - DROPSET- 12",
                        "Peak pump selfies: find the best lighting in the gym and/or locker room and pop out 30-50 selfies. Sit in your car and spend the next 45-60 minutes picking the wettest one, filter it and post that hot boy to IG. " } };
        num = getRandomNumberInRange(0, Friday.length - 1);
        printworkout(Friday, num, txtlog);

    }

    private static void printworkout(String[][] day, int num, TextArea text) {
        for (int i = 0; i < day[num].length; i++) {
            text.appendText(day[num][i] + "\n");
        }
        text.appendText("\n" + "\n");
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
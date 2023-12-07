

package showAlerts;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class GetMessegeAsAlert {

    public static void getCondidatesNotFoundWarning(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR, message, ButtonType.OK);
        alert.setTitle("YOU ARE NOT ELIGIBLE CANDIDATE TO VOTE:");
        alert.showAndWait();
    }

    public static void getCondidateDetails(String condidateDetails) {
        System.err.println("Data :"+condidateDetails);
        Alert alert = new Alert(Alert.AlertType.INFORMATION, condidateDetails, ButtonType.APPLY);
        alert.setTitle("CANDIDATE DETAILS:");
        alert.showAndWait();

    }
     public static void getThanksMessageAfterVoteToCondidate(String CandidateName) {
       
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "This for voting to "+CandidateName, ButtonType.FINISH);
        alert.setTitle("YOUR VOTE CASTED SUCCESSFULLY:");
        alert.showAndWait();

    }

}

import java.util.Scanner;
import java.util.HashMap;

/*
*     @author Mark Westerweel, Studentnumber 500836508
*
*   The goal of this program is to ask the use for an X amount of tracks to make a tracklist.
*   User is then asked for name and length of said tracks.
*   The following is printed after user has given the data:
*   - titles of tracks
*   - title and lengths of tracks
*   - total length of playlist and longest track
*   - and again the entire playlist with titles and length per standards HvA  
*/


class Playlist {
     
     
    public static void main(String[] args){
        String firstName = "Mark";
        String lastName = "Westerweel";
        String studentNumber = "500836508";
        
        System.out.println("First name is: " + firstName);
        System.out.println("Last name is: " + lastName);
        System.out.println("Student number is: " + studentNumber);

        int userTracklist;
        do {
            try (Scanner userObj = new Scanner(System.in)) {
                System.out.println("Enter number of songs between 2 and 20");
                userTracklist = userObj.nextInt();
            }
        }
        while (userTracklist < 2 || userTracklist > 20);

        HashMap<String, Integer> track = new HashMap<String, Integer>();
    
        track.put("Stairways to heaven", 479);
        System.out.println(track);     
    }    
}
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
     
    public static int acceptTracklist(){

        try (Scanner userObj = new Scanner(System.in)) {
            System.out.println("Enter number of songs");
            int userTracklist = userObj.nextInt();

            if ( userTracklist >= 2 && userTracklist<= 20 ){
                System.out.println("User tracklist is " + userTracklist+ " long");
            } else {
                System.out.println("User tracklist must be more than one and less than 21 tracks");
                System.out.println("Enter number of songs");
                userTracklist = userObj.nextInt();
                acceptTracklist();
            }
            return userTracklist;
        }
        
    }


    
    public static void main(String[] args){
        String firstName = "Mark";
        String lastName = "Westerweel";
        String studentNumber = "500836508";
        
        System.out.println("First name is: " + firstName);
        System.out.println("Last name is: " + lastName);
        System.out.println("Student number is: " + studentNumber);

        acceptTracklist();   

        

        // HashMap<String, Integer> track = new HashMap<String, Integer>();
    
        // track.put("Stairways to heaven", 479);
        // System.out.println(track);     
    }    
}
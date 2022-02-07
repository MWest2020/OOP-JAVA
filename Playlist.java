import java.util.Scanner;
import java.util.ArrayList;


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
        int min = 2;
        int max = 20;
        
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number of songs between 2 and 20");
            userTracklist = in.nextInt();
        }
        while (userTracklist < min || userTracklist > max);
        

        ArrayList<String> trackList = new ArrayList<String>();
        ArrayList<Integer> durationList = new ArrayList<Integer>();
        
        for (int i = 1; i < userTracklist; i++ ){

        Scanner scan = new Scanner(System.in);
        System.out.println("Title of track :" + i);
        String track = scan.next();
        System.out.println("You entered: " + track);
        trackList.add(track);
        

        Scanner seconds = new Scanner(System.in);
        System.out.println("Duration of track " + i + " in seconds :");
        int duration = seconds.nextInt();
        durationList.add(duration);
        System.out.println("You entered: " + duration + " in seconds");
        
        }
    

           System.out.println(trackList);
           System.out.println(durationList);
    }    
}
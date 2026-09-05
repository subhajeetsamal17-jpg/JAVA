import java.util.Scanner;

class Movie {
    int movieId;
    String title;
    double rating;

    
    Movie(int movieId, String title, double rating) {
        this.movieId = movieId;
        this.title = title;
        this.rating = rating;
    }

    
    void display() {
        System.out.println("Movie ID: " + movieId);
        System.out.println("Title: " + title);
        System.out.println("Rating: " + rating);
        System.out.println();
    }
}


public class Q6{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of movies: ");
        int n = sc.nextInt();
        sc.nextLine();

        Movie[] movies = new Movie[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Movie " + (i + 1));

            System.out.print("Enter Movie ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Movie Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Rating: ");
            double rating = sc.nextDouble();

            movies[i] = new Movie(id, title, rating);
        }

        
        System.out.println("\n===== ALL MOVIE DETAILS =====");

        for (int i = 0; i < n; i++) {
            movies[i].display();
        }


        int highest = 0;

        for (int i = 1; i < n; i++) {
            if (movies[i].rating > movies[highest].rating) {
                highest = i;
            }
        }

        
        System.out.println("===== HIGHEST RATED MOVIE =====");
        movies[highest].display();
    }
}
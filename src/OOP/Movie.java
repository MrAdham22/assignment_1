package OOP;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPG(Movie[] movies) {
        Movie[] result = new Movie[movies.length];
        int index = 0;

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].rating.equals("PG")) {
                result[index] = movies[i];
                index++;
            }
        }

        return result;
    }
}

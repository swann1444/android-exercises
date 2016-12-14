package fr.android.androidexercises;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by Swann Legrand on 14/12/2016.
 */

public interface BookService {

        @GET("books")
        Call<List<Book>> listBooks();

}

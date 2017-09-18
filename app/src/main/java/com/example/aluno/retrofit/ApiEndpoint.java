package com.example.aluno.retrofit;

import com.example.aluno.retrofit.dominio.User;
import com.example.aluno.retrofit.dominio.Post;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiEndpoint {
    @GET("users/{id}")
    Call<User> obterusuario(@Path("id") int userID);

    @GET("posts/{id}")
    Call<Post> obterpost(@Path("id") int userID);
}
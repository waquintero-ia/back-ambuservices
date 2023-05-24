package com.example.myapplication.sinterface;

import java.util.List;

import com.example.myapplication.model.Empleado;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface CrudEmpleadoInterface {
    @GET("consultarAll")
    Call<List<Empleado>> getAll();

    @POST("guardar")
    Call<Empleado> create(@Body Empleado empleado);

    @DELETE("user/{id}")
    Call<Empleado> delete(@Path("id") Long id);

    @PUT("user/{id}")
    Call<Empleado> callEdit(@Path("id") Long id, @Body Empleado empleado);

}

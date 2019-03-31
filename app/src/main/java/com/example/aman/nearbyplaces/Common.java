package com.example.aman.nearbyplaces;

import com.example.aman.nearbyplaces.Remote.IGoogleAPIService;
import com.example.aman.nearbyplaces.Remote.RetrofitClient;

import retrofit2.Retrofit;

public class Common {
    private static final String GOOGLE_API_URL = "https://maps.googleapis.com/";

    public static IGoogleAPIService getGoogleAPIService(){
        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
}

package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.SurveyData;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface SelfSpmApi {
        /**
        * 
        * 
        * @return Call&lt;List&lt;SurveyData&gt;&gt;
        */
        @GET("self/surveys")
        Call<List<SurveyData>> fetchAllSurveys();
        


            /**
            * 
            * 
            * @return Call&lt;List&lt;SurveyData&gt;&gt;
            */
            @GET("self/surveys")
        Call<List<SurveyData>> fetchAllSurveys(@HeaderMap Map<String, String> headers);
        

        }

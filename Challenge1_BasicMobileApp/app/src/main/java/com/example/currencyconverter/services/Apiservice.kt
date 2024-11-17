import com.example.currencyconverter.model.CurrencyModel
import com.example.currencyconverter.services.RetrofitClient
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("latest/{base}")
    suspend fun getExchangeRate(
        @Path("base") base: String
    ): Response<CurrencyModel.CurrencyRate>

    companion object {
        val api: ApiService by lazy {
            RetrofitClient.getClient().create(ApiService::class.java)
        }
    }
}


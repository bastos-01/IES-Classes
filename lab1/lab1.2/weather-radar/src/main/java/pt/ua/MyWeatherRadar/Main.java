package pt.ua.MyWeatherRadar;

import org.apache.logging.log4j.LogManager;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import pt.ua.MyWeatherRadar.IpmaCityForecast;
import pt.ua.MyWeatherRadar.IpmaService;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
//∞import java.util.logging.Logger;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static final HashMap<String, Integer> mapa = new HashMap<>();

    private static final int CITY_ID_AVEIRO = 1010500;

    protected static final Logger LOGGER = LogManager.getLogger();
    //private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) throws IOException {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IpmaService service = retrofit.create(IpmaService.class);

        //colocar no mapa as cidades e os seus códigos
        Cities cidades = service.getCodes().execute().body();
        Iterator<City> iterator = cidades.getData().listIterator();
        Integer codigo_cidade = null;
        while (iterator.hasNext()) {
            City cityObj = iterator.next();
            mapa.put(cityObj.getLocal(), cityObj.getGlobalIdLocal());
        }

        String cidade_pedida = args[0];

        Call<IpmaCityForecast> callSync = service.getForecastForACity(mapa.get(cidade_pedida));

        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();
            if (forecast != null) {
                LOGGER.info("max temp for " + cidade_pedida + "  today: " + forecast.getData().listIterator().next().getTMax());
            } else LOGGER.info("No results!");
        } catch (Exception ex) {
            LOGGER.error("No results!");
        }
    }
}

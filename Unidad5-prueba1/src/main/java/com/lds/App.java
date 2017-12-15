package com.lds;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.rmi.RemoteException;
import com.lds.GlobalWeatherStub.GetCitiesByCountry;
import com.lds.GlobalWeatherStub.GetCitiesByCountryResponse;
import com.lds.GlobalWeatherStub.GetWeather;
import com.lds.GlobalWeatherStub.GetWeatherResponse;

@ApplicationPath("/rest")
public class App extends Application {

	public static void main(String[] args) throws RemoteException {
		
//		GlobalWeatherStub globalWeatherStub = new GlobalWeatherStub();
//		GetCitiesByCountry getCitiesByCountry = new GetCitiesByCountry();
//		getCitiesByCountry.setCountryName("Canada");
//		
//		GetCitiesByCountryResponse getCitiesByCountryResponse = globalWeatherStub.getCitiesByCountry(getCitiesByCountry);
//		System.out.println(getCitiesByCountry.getCountryName());
//		System.out.println(getCitiesByCountryResponse.getGetCitiesByCountryResult());
//		
//		GetWeather getWeather = new GetWeather();
////		getWeather.setCityName("Puerto Asis");
////		getWeather.setCountryName("Colombia");
//		GetWeatherResponse getWeatherResponse = globalWeatherStub.getWeather(getWeather);
//		System.out.println(getWeatherResponse.getGetWeatherResult());

	}

}

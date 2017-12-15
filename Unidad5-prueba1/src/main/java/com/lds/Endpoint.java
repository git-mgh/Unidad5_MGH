package com.lds;

import java.rmi.RemoteException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.axis2.AxisFault;

import com.lds.GlobalWeatherStub.GetCitiesByCountry;
import com.lds.GlobalWeatherStub.GetCitiesByCountryResponse;
import com.lds.GlobalWeatherStub.GetWeather;
import com.lds.GlobalWeatherStub.GetWeatherResponse;

@Path("/servlet")
public class Endpoint {


	@GET
	@Path("/Ciudad/{id}")
	@Produces("text/plain")
	public String servlet3(@PathParam("id") String identificador) throws RemoteException {

		GlobalWeatherStub globalWeatherStub = new GlobalWeatherStub();
		GetCitiesByCountry getCitiesByCountry = new GetCitiesByCountry();
		getCitiesByCountry.setCountryName(identificador);
		
		GetCitiesByCountryResponse getCitiesByCountryResponse = globalWeatherStub.getCitiesByCountry(getCitiesByCountry);
//		System.out.println(getCitiesByCountry.getCountryName());
//		System.out.println(getCitiesByCountryResponse.getGetCitiesByCountryResult());
		
		GetWeather getWeather = new GetWeather();
//		getWeather.setCityName("Puerto Asis");
		getWeather.setCountryName(identificador);
		GetWeatherResponse getWeatherResponse = globalWeatherStub.getWeather(getWeather);
//		System.out.println(getWeatherResponse.getGetWeatherResult());

		
		
		return getWeatherResponse.getGetWeatherResult();
	}
}

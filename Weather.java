class Weather{
	
static int Instance=0;
WeatherSeason season;
float temperature=28.0f;
String humidity;
boolean feel;

Weather(WeatherSeason season, String humidity){
Instance++;
this.season=season;
this.humidity=humidity;

}
}
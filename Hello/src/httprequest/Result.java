package httprequest;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

@SerializedName("uri")
@Expose
private String uri;
@SerializedName("calories")
@Expose
private Integer calories;
@SerializedName("totalWeight")
@Expose
private Double totalWeight;
@SerializedName("dietLabels")
@Expose
private List<String> dietLabels = null;
@SerializedName("healthLabels")
@Expose
private List<String> healthLabels = null;
@SerializedName("cautions")
@Expose
private List<String> cautions = null;
@SerializedName("totalNutrients")
@Expose
private TotalNutrients totalNutrients;
@SerializedName("totalDaily")
@Expose
private TotalDaily totalDaily;
@SerializedName("totalNutrientsKCal")
@Expose
private TotalNutrientsKCal totalNutrientsKCal;

public String getUri() {
return uri;
}

public void setUri(String uri) {
this.uri = uri;
}

public Integer getCalories() {
return calories;
}

public void setCalories(Integer calories) {
this.calories = calories;
}

public Double getTotalWeight() {
return totalWeight;
}

public void setTotalWeight(Double totalWeight) {
this.totalWeight = totalWeight;
}

public List<String> getDietLabels() {
return dietLabels;
}

public void setDietLabels(List<String> dietLabels) {
this.dietLabels = dietLabels;
}

public List<String> getHealthLabels() {
return healthLabels;
}

public void setHealthLabels(List<String> healthLabels) {
this.healthLabels = healthLabels;
}

public List<String> getCautions() {
return cautions;
}

public void setCautions(List<String> cautions) {
this.cautions = cautions;
}

public TotalNutrients getTotalNutrients() {
return totalNutrients;
}

public void setTotalNutrients(TotalNutrients totalNutrients) {
this.totalNutrients = totalNutrients;
}

public TotalDaily getTotalDaily() {
return totalDaily;
}

public void setTotalDaily(TotalDaily totalDaily) {
this.totalDaily = totalDaily;
}

public TotalNutrientsKCal getTotalNutrientsKCal() {
return totalNutrientsKCal;
}

public void setTotalNutrientsKCal(TotalNutrientsKCal totalNutrientsKCal) {
this.totalNutrientsKCal = totalNutrientsKCal;
}

}
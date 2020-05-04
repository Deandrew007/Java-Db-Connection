package httprequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ENERCKCAL__ {

@SerializedName("label")
@Expose
private String label;
@SerializedName("quantity")
@Expose
private Integer quantity;
@SerializedName("unit")
@Expose
private String unit;

public String getLabel() {
return label;
}

public void setLabel(String label) {
this.label = label;
}

public Integer getQuantity() {
return quantity;
}

public void setQuantity(Integer quantity) {
this.quantity = quantity;
}

public String getUnit() {
return unit;
}

public void setUnit(String unit) {
this.unit = unit;
}

}
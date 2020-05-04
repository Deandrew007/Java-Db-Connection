package httprequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TotalNutrientsKCal {

@SerializedName("ENERC_KCAL")
@Expose
private ENERCKCAL__ eNERCKCAL;
@SerializedName("PROCNT_KCAL")
@Expose
private PROCNTKCAL pROCNTKCAL;
@SerializedName("FAT_KCAL")
@Expose
private FATKCAL fATKCAL;
@SerializedName("CHOCDF_KCAL")
@Expose
private CHOCDFKCAL cHOCDFKCAL;

public ENERCKCAL__ getENERCKCAL() {
return eNERCKCAL;
}

public void setENERCKCAL(ENERCKCAL__ eNERCKCAL) {
this.eNERCKCAL = eNERCKCAL;
}

public PROCNTKCAL getPROCNTKCAL() {
return pROCNTKCAL;
}

public void setPROCNTKCAL(PROCNTKCAL pROCNTKCAL) {
this.pROCNTKCAL = pROCNTKCAL;
}

public FATKCAL getFATKCAL() {
return fATKCAL;
}

public void setFATKCAL(FATKCAL fATKCAL) {
this.fATKCAL = fATKCAL;
}

public CHOCDFKCAL getCHOCDFKCAL() {
return cHOCDFKCAL;
}

public void setCHOCDFKCAL(CHOCDFKCAL cHOCDFKCAL) {
this.cHOCDFKCAL = cHOCDFKCAL;
}

}
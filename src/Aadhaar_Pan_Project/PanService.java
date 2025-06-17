package Aadhaar_Pan_Project;

import java.util.HashMap;
import java.util.Map;

public class PanService {
    // write static if you want static block
    private Map<String, PanCard> panMap = new HashMap<>();

    public void setPanMap(String panNumber, PanCard panCard) {
        panMap.put(panNumber, panCard);
    }

    public PanCard getPan(String aadhaarNumber) {
        for (PanCard pan : panMap.values()) {
            if (pan.getAadhaarNumber().equalsIgnoreCase(aadhaarNumber)) {
                return pan;
            }
        }
        return null;
    }
}
